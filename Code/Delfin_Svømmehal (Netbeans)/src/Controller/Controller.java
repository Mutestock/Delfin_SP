package Controller;

import FormandAdgang.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Controller {

    //The Controller's purpose is to collect methods and make them easy to handle and instanciate.
    //Since this also acts as a hub for the GUI to interact with the rest of the classes.
    //Could be seen as the brain of the program (WIP).
    //To do list:
    //merge junior/senior as a single boolean value
    //Implement Controller
    //Connect GUI to controller
    //Connect other functionalities to Controller and GUI.
    //Consider the functionality of the Main Method in registration when the Controller has been implemented
    //Make it possible for the GUI to go back to the main menu after having chosen a role.
    //Change GUI Class names.
    //Clean up redundant GUI code
    //Stretch goals:
    //Additional basic information for members and trainer (e.g. phonenumber).
    //Make unit test for the .txt files. Test the perfomance of the PrintWriter.
    //Controller methods:
    //createMember()                (added)
    //updateMember(Member member)   ()
    //deleteMember(Member member)   ()  
    //getAllMembers()               ()
    // - (^ read members)
    //Controller methods (methods of which we have yet to implement at all)
    //top5Members(Diciplin diciplin)
    // - (^ We should create a class for eat diciplin and save
    // - (the top 5 members of each diciplin in their seperate classes)
    //registerResult()
    //getResult(-unknown parameter-)
    //getBalanceSheet()
    //createContingentPayment(Member member);
    public Controller() {
    }

    //Methods
    //createMember creates a new instance of a member and adds it to the .txt file.
    public void createMember(String name, int age, String phone, boolean activityForm, boolean competetive) {
        Member member = new Member(name, age, phone, activityForm, competetive);
        Registration r = new Registration();
        r.registerMember(member);
    }

    //updateMember should in the easiest way update any parameter of any member
    //from the .txt file.
    public void updateMember() {

        try {
            Path path = Paths.get("D:\\test.txt");
            Charset charset = StandardCharsets.UTF_8;

            String content = new String(Files.readAllBytes(path), charset);
            content = content.replaceAll("age", "bar");
            Files.write(path, content.getBytes(charset));
        } catch (IOException ex) {

        }
    }

    //Deletes all lines containing the contents of lineToRemove from a .txt
    //Comments in the code are not mine //Moi(
    public void deleteMembersRedo2() {
        String inputFileName = "D:\\registrationNew.txt";
        String outputFileName = "D:\\out.txt";
        String lineToRemove = "Emil";

// The traps any possible read/write exceptions which might occur
        File inputFile = new File(inputFileName);
        File outputFile = new File(outputFileName);
// Open the reader/writer, this ensure that's encapsulated
// in a try-with-resource block, automatically closing
// the resources regardless of how the block exists
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            // Read each line from the reader and compare it with
            // with the line to remove and write if required
            String line = null;
            while ((line = reader.readLine()) != null) {
                if (!line.contains(lineToRemove)) {
                    writer.write(line);
                    writer.newLine();
                }
            }
        } catch (IOException e) {

        }
    }

    public ArrayList<String> getAllMembers() {
        FilePrinter f = new FilePrinter(FilePrinter.getFilePath(), FilePrinter.getPrintwriter(FilePrinter.getFilePath()));
        f.getFileInfo(FilePrinter.getFilePath());
        return f.getMembersArrayList();
    }

}
