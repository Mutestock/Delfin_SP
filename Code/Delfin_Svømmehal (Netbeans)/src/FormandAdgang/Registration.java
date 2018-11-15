package FormandAdgang;

import Kontingent.Kontingent;
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
    //once the user will start the program.
    Team team;

    public Registration() {

       
        //this.membersFile = "D:\\members.txt";
        
    }
    static String registrationPath = "D:\\registrationNew.txt";
    static PrintWriter subOut1 = FilePrinter.createFile(registrationPath);

    static String sublistPath = "D:\\subListNew.txt";
    static PrintWriter subOut2 = FilePrinter.createFile(sublistPath);

    public void registerMember(Member member) {
        //RegisteredMembers is a list of ALL registered members in the club.
        this.registeredMembers.add(member);

        //team.addMember is a method of adding the member to the correct team.
        team.addMemberToTeam(member);

    }


    public static void subLister(ArrayList<Member> arrayList, PrintWriter printer) {
        for (int i = 0; i < arrayList.size(); ++i) {
            printer.println(arrayList.get(i));}}

    public static void main(String[] args) {
        Member member1 = new Member("Emil", 60, true, true);
        Member member2 = new Member("ahmed", 20, true, true);
        Member member3 = new Member("Emil skov", 20, false, true);
        Member member4 = new Member("Dolf bo", 15, true, true);

        registeredMembers.add(member1);
        registeredMembers.add(member2);
        registeredMembers.add(member3);
        registeredMembers.add(member4);
        
        subLister(registeredMembers, subOut1);
        

        // System.out.println(member1);
        Registration r = new Registration();
//        r.registerMember(memberaf1);
//        r.registerMember(memberaf2);
//        r.registerMember(memberaf3);
//        r.registerMember(memberaf4);

        subOut1.close();
    }

}
