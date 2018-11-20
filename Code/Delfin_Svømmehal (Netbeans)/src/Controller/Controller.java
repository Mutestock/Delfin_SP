package Controller;

import FormandAdgang.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
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
    //deleteMember(Member member)   (added)  
    //getAllMembers()               (added)
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

    //updateMember should in the easiest way update all parameters of any member
    //from the .txt file.
    public Member getMember(String phone) {
        String inputFileName = FilePrinter.getFilePath();
        String outputFileName = FilePrinter.getFilePath();
        String lineToUpdate = phone;

        File inputFile = new File(inputFileName);
        File outputFile = new File(outputFileName);

        Member member = null;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            String line = reader.readLine();
            String temp = new String();
            while (line != null) {
                if (line.contains(lineToUpdate)) {
                    temp = line;
                    break;
                }
                line = reader.readLine();
            }
            reader.close();

            String name = "";
            String parseAge = "";
            boolean activityForm = false;
            boolean competetive = false;
            int counter = 0;
            for (int i = 0; i < line.length(); ++i) {
                if (line.charAt(i) == ',') {
                    counter++;
                }

                if (counter == 0) {
                    name += line.charAt(i);
                }

                if (counter == 1) {
                    if (line.charAt(i) == ',') {

                    } else {
                        parseAge += line.charAt(i);
                    }
                }

                if (counter == 2) {
                    if (line.charAt(i) == ',') {
                    } else {
                        if (line.charAt(i) == 't') {
                            activityForm = true;
                        }
                    }
                }

                if (counter == 3) {
                    if (line.charAt(i) == ',') {
                    } else {
                        if (line.charAt(i) == 't') {
                            competetive = true;
                        }
                    }
                }
            }
            System.out.println(parseAge);
            int age = Integer.parseInt(parseAge);
            member = new Member(name, age, phone, activityForm, competetive);

        } catch (Exception e) {
        }
        return member;
    }

    //Returns a list of all the members that is contained by the .txt file from
    //getFilePath();
    public ArrayList<Member> getAllMembers() {
        FilePrinter f = new FilePrinter(FilePrinter.getFilePath(), FilePrinter.getPrintwriter(FilePrinter.getFilePath()));
        f.getFileInfo(FilePrinter.getFilePath());

        String name = "";
        String parseAge = "";
        String phone = "";
        boolean activityForm = false;
        String act = "";
        boolean competetive = false;
        String comp = "";
        int counter = 0;

        ArrayList<Member> membersList = new ArrayList();
        for (int i = 0; i < f.getMembersArrayList().size(); ++i) {
            for (int j = 0; j < f.getMembersArrayList().get(i).length(); ++j) {

                if (f.getMembersArrayList().get(i).charAt(j) == '.') {
                    int age = Integer.parseInt(parseAge);
                    Member member = new Member(name, age, phone, activityForm, competetive);
                    membersList.add(member);
                    break;
                }

                if (f.getMembersArrayList().get(i).charAt(j) == ',') {

                    counter++;
                }

                else if (counter == 0) {
                    if (f.getMembersArrayList().get(i).charAt(j) == ',') {

                    } else {
                    name += f.getMembersArrayList().get(i).charAt(j);
                    }
                }

                else if (counter == 1) {
                    if (f.getMembersArrayList().get(i).charAt(j) == ',') {

                    } else {
                        parseAge += f.getMembersArrayList().get(i).charAt(j);
                    }
                }
                
                else if (counter == 2) {
                    phone += f.getMembersArrayList().get(i).charAt(j);
                }

                else if (counter == 3) {
                    act += f.getMembersArrayList().get(i).charAt(j);
                    if (act.contains("true")){
                        activityForm = true;
                    }
                }

                else if (counter == 4) {
                    comp += f.getMembersArrayList().get(i).charAt(j);
                    if (comp.contains("true")){
                        competetive = true;
                    }
                }
            }
        }
        return membersList;
    }
    
    public ArrayList<Member> getAllJunior() {
        ArrayList<Member> member = getAllMembers();
        System.out.println(member);
        ArrayList<Member> junior = new ArrayList();
        for (int i = 0; i < member.size(); ++i) {
            Member memberinst = member.get(i);
            System.out.println(memberinst);
            if (memberinst.isJunior()) {
                System.out.println("test");
                junior.add(memberinst);
            }
        }
        return junior;
    }

    //Deletes all lines containing the contents of lineToRemove from a .txt
    public void deleteMember(String phone) {
        String inputFileName = FilePrinter.getFilePath();
        String outputFileName = FilePrinter.getFilePath();
        String lineToRemove = phone;

        File inputFile = new File(inputFileName);
        File outputFile = new File(outputFileName);

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            String line = reader.readLine();
            ArrayList<String> temp = new ArrayList();
            while (line != null) {
                if (!line.contains(lineToRemove)) {
                    temp.add(line);
                }
                line = reader.readLine();
            }
            reader.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            for (int i = 0; i < temp.size(); ++i) {
                writer.write(temp.get(i));
                writer.newLine();
            }
            writer.close();

        } catch (IOException e) {
        }
    }

}
