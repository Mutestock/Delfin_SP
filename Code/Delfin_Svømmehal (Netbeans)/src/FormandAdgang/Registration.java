
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

public class Registration {

    ArrayList<Member> registeredMembers = new ArrayList();
    String membersFile  ;
    private static final boolean DEBUG = true;
    
    public void registerMember(Member member) {
        this.registeredMembers.add(member);
        System.out.println(registeredMembers);            
            
        PrintWriter out = null;
        try {
            File file = new File(membersFile);
            out = new PrintWriter(file);
            
            for (int i = 0; i < registeredMembers.size(); ++i){
                out.println(registeredMembers.get(i));
            }
            
            
        } catch (FileNotFoundException ex) {
            if(DEBUG) ex.printStackTrace();
        } finally {
            out.close();
        }
    }    
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
    
    public static void main(String[] args) {
        Member member1 = new Member("Emil",20,true,true);
        Member member2 = new Member("ahmed",20,true,true);
        Member member3 = new Member("Emil skov",20,false,true);
        System.out.println(member1);
        Registration r = new Registration();
        r.registerMember(member1);
        r.registerMember(member2);
        r.registerMember(member3);
    }
    
}

