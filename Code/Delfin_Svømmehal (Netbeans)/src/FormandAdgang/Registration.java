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

    ArrayList<Member> registeredMembers = new ArrayList();
    private static final boolean DEBUG = true;

    //Since this is just a reference, and not an instance,
    //we will have to initialize the Team class in the GUI
    //once the user will start the program.
    Team team;

    
    
    public Registration() {
<<<<<<< HEAD
        this.membersFile = "C:\\Users/emils/Desktop/delfin opgave/members.txt";
        //this.membersFile = "D:\\members.txt";
=======
        
>>>>>>> 9338604e8f94de895a77fb1a2440a76f260412a1
    }
    
    
    public void registerMember(Member member) {
        //RegisteredMembers is a list of ALL registered members in the club.
        this.registeredMembers.add(member);

        //team.addMember is a method of adding the member to the correct team.
        team.addMemberToTeam(member);

        //Method that in theory could update the file of registered members
        //by adding a new member as a parameter.
        fileHandle.updateRegisteredMembers(member);
        
        //Code below was an attempt to update the file within the method of
        //registering a new member.
        /*PrintWriter out = null;
        try {
            File file = new File(membersFile);
            out = new PrintWriter(file);

            for (int i = 0; i < registeredMembers.size(); ++i) {
                out.println(registeredMembers.get(i));
            }

        } catch (FileNotFoundException ex) {

            if (DEBUG) {
                ex.printStackTrace();
            }
        } finally {
            out.close();
        }*/
    }

<<<<<<< HEAD
<<<<<<< HEAD
    public ArrayList<MemberAF> getRegisteredMembers() {
        return registeredMembers;
    }

    public String getMembersFile() {
        return membersFile;
    }

    public static boolean isDEBUG() {
        return DEBUG;
    }

    public Team getTeam() {
        return team;
    }

    
    
    
    
       
=======
<<<<<<< HEAD

=======
    /* finally {
            try {
                out.close();
            } catch (IOException ex) {
                if(DEBUG) {
                }
        }
        }*/
    public Registration() {
        this.membersFile = "D:\\members.txt";
    }
    
>>>>>>> pokasdf
>>>>>>> 22e330560ee4ff4eeb5324d1564c80e4f258fa20
=======
    
<<<<<<< HEAD
    
    
>>>>>>> 0ee5ad5318bb60e8ea58d0105e74058edd92e951
=======

>>>>>>> 9338604e8f94de895a77fb1a2440a76f260412a1
    public static void main(String[] args) {
        Member member1 = new Member("Emil", 60, true, true);
        Member member2 = new Member("ahmed", 20, true, true);
        Member member3 = new Member("Emil skov", 20, false, true);
        Member member4 = new Member("Dolf bo", 15, true, true);

        // System.out.println(member1);
        Registration r = new Registration();
//        r.registerMember(memberaf1);
//        r.registerMember(memberaf2);
//        r.registerMember(memberaf3);
//        r.registerMember(memberaf4);

        
        
        System.out.println(member4.calcFee());
        System.out.println(member2.calcFee());

        String filePath = "D:\\subList.txt";
        //PrintWriter subOut = Kontingent.createFile(filePath);

        ArrayList<Kontingent> subList = new ArrayList<>();
        //subList.add(kontingent1);
        //subList.add(kontingent2);

        /*for (Kontingent subscriber : subList) {
            Kontingent.createSubscription(subscriber, subOut);
            System.out.println(subscriber);
        }

        subOut.close();
        Kontingent.getFileInfo(filePath);*/

    }

}
