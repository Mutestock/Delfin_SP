
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

    ArrayList<MemberAF> registeredMembers = new ArrayList();
    String membersFile  ;
    private static final boolean DEBUG = true;
    
    public void registerMember(MemberAF member) {
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
        Member member4 = new Member("Dolf bo",15,true,true);
        
        MemberAF memberaf1 = new MemberAF(member1);
        MemberAF memberaf2 = new MemberAF(member2);
        MemberAF memberaf3 = new MemberAF(member3);
        MemberAF memberaf4 = new MemberAF(member4);
        
        System.out.println(member1);
        Registration r = new Registration();
        r.registerMember(memberaf1);
        r.registerMember(memberaf2);
        r.registerMember(memberaf3);
        r.registerMember(memberaf4);
    }
    
}

