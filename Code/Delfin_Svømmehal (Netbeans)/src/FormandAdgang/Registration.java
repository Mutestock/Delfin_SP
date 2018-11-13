
package FormandAdgang;
import java.util.ArrayList;
import java.util.Scanner;

public class Registration {

    ArrayList<Member> registreredMembers;
    String membersFile = "C:\\members.txt";
    
    public void registerMember(Member member) {
        this.registreredMembers.add(member);
    }
    
}

