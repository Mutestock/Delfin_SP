
package FormandAdgang;
import java.util.ArrayList;

public class Registration {

    ArrayList<Member> registreredMembers;
    
    public void registerMember(Member member) {
        this.registreredMembers.add(member);
    }
    
}

