package FormandAdgang;

import Controller.Controller;
import java.io.PrintWriter;
import java.util.ArrayList;
import Trainer.*;

public class Registration {

    static ArrayList<Member> registeredMembers = new ArrayList();
    private static final boolean DEBUG = true;

    //Since this is just a reference, and not an instance,
    //we will have to initialize the Team class in the GUI
    //once the user will start the program. Initializer 
    //that gets information from the text file upon starting.
    Teams team = new Teams(); 

    public Registration() {
    }

    
    //registerMember now also registers the member to the .txt file.
    public void registerMember(Member member) {
        //RegisteredMembers is a list of ALL registered members in the club.
        this.registeredMembers.add(member);
        //team.addMember is a method of adding the member to the correct team.
        team.addMemberToTeam(member);
        
        String path = FilePrinter.getFilePath();
        PrintWriter print = FilePrinter.getPrintwriter(path);
        FilePrinter.subLister(registeredMembers, print);
        print.close();
    }

    
    
    
    
    //Testing area
    public static void main(String[] args) {
        
        //Creating instances of Member. 
        //This is necessary when trying to test the functionality of the filePrinter class.
        Member member1 = new Member("Emil", 60, "12345678", true, true);
        Member member2 = new Member("ahmed", 20, "33445566", true, true);
        Member member3 = new Member("Emil skov", 20, "34343477", false, true);
        Member member4 = new Member("Dolf bo", 15, "99998888", true, true);
      
        Registration r = new Registration();
        r.registerMember(member1);
        
        
        FilePrinter f = new FilePrinter(FilePrinter.getFilePath(),FilePrinter.getPrintwriter(FilePrinter.getFilePath()));
        f.getFileInfo(FilePrinter.getFilePath());
        f.printArrayList();

        
        //Testing controller functionality..
        Controller c = new Controller();
        System.out.println(c.getAllMembers());
        
<<<<<<< HEAD
<<<<<<< HEAD

        FilePrinter.subLister(registeredMembers, print);
        

        
        FilePrinter.subLister(registeredMembers, print);

=======
        //Prints each line without overwriting.
        FilePrinter.subLister(registeredMembers, print);
        
        //Closes the PrintWriter instance. print.close(); could be seen as a confirmation of the PrintWriters actions, before printing to the document.
        //No text will printed without it being there, and therefore it's absolutely necessary, and shouldn't be deleted.
>>>>>>> 19d933801723c8892fa6ea1e3b996ec6ac39f1a4
        print.close();
=======
        System.out.println("");
        
        c.deleteMember("12345678");
        //c.updateMember();
        for (int i = 0; i < c.getAllMembers().size(); ++i) {
            System.out.println(c.getAllMembers().get(i));
        }
       
        System.out.println(c.getAllMembers());
>>>>>>> db5919ceced133bfc3953cfc7494b01f2c997645

    }
}
