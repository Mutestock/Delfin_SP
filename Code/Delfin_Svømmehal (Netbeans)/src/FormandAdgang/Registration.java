package FormandAdgang;

import Controller.Controller;
import Kontingent.Kontingent;
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
        this.registeredMembers.clear();
        //RegisteredMembers is a list of ALL registered members in the club.
        this.registeredMembers.add(member);
        //team.addMember is a method of adding the member to the correct team.
        team.addMemberToTeam(member);

        
        PrintWriter print = FilePrinter.getPrintwriter(FilePrinter.getFilePath());
        FilePrinter.subLister(registeredMembers, print);
        print.close();
    }

    
    
    
    
    //Testing area
    public static void main(String[] args) {
        
        //Creating instances of Member. 
        //This is necessary when trying to test the functionality of the filePrinter class.
        Member member1 = new Member("Emil", 60, "12345678", true, true);
        Member member2 = new Member("Emil1", 60, "12345678", true, true);
        Member member3 = new Member("Emil2", 60, "12345678", true, true);
        Member member4 = new Member("Emil3", 60, "12345678", true, true);
        Member member5 = new Member("Emil4", 60, "12345678", true, true);

        Controller c = new Controller();

        c.registerResult(member1, "Butterfly", 1);
        c.registerResult(member2, "Butterfly", 2);
        c.registerResult(member3, "Butterfly", 3);
        c.registerResult(member4, "Butterfly", 4);
        c.registerResult(member5, "Butterfly", 5);
        System.out.println(c.getAllResults());
        //System.out.println(c.getTop5Results(c.getAllResults()));
        System.out.println(c.getDiciplineTop5("Butterfly"));
    }
}
