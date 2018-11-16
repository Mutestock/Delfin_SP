package FormandAdgang;

import java.awt.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import Trainer.*;

public class Registration {

    static ArrayList<Member> registeredMembers = new ArrayList();
    private static final boolean DEBUG = true;

    //Since this is just a reference, and not an instance,
    //we will have to initialize the Team class in the GUI
    //once the user will start the program. Initializer 
    //that gets information from the text file upon starting.
    Team team;

    public Registration() {
    }

    public void registerMember(Member member) {
        //RegisteredMembers is a list of ALL registered members in the club.
        this.registeredMembers.add(member);

        //team.addMember is a method of adding the member to the correct team.
        team.addMemberToTeam(member);
    }

    public static void main(String[] args) {
        Member member1 = new Member("Emil", 60, true, true);
        Member member2 = new Member("ahmed", 20, true, true);
        Member member3 = new Member("Emil skov", 20, false, true);
        Member member4 = new Member("Dolf bo", 15, true, true);

        String path = FilePrinter.getFilePath();
        PrintWriter print = FilePrinter.getPrintwriter(path);

        registeredMembers.add(member1);
        registeredMembers.add(member2);
        registeredMembers.add(member3);
        registeredMembers.add(member4);
      //  Registration r = new Registration();

        FilePrinter.subLister(registeredMembers, print);

        print.close();
    }
}
