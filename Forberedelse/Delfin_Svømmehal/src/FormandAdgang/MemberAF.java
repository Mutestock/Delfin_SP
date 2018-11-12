
package FormandAdgang;

public class MemberAF {
    
    Member member;
    
    boolean junior;
    boolean senior;
    boolean ageBonus;

    
    
    
    public MemberAF(Member member) {
        this.member = member;
        this.junior = checkAgeJunior(member);
        this.senior = checkAgeSenior(member);
        this.ageBonus = checkAgeBonus(member);
    }
    
    
    public boolean checkAgeJunior(Member member) {
        if (member.getAge() > 18) {
            return false;
        }
        return true;
    }
    
    public boolean checkAgeSenior(Member member) {
        if (member.getAge() <= 18) {
            return false;
        }
        return true;
    }
    
    public boolean checkAgeBonus(Member member) {
        if (member.getAge() > 60) {
            return false;
        }
        return true;
    }

    public Member getMember() {
        return member;
    }
    
}
