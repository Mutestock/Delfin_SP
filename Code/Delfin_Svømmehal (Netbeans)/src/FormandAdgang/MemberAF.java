
package FormandAdgang;

public class MemberAF {
    
    Member member;
    boolean ageBonus;
    boolean senior;
    boolean junior;
    
    //The constructor of a members is consisted of giving a member a "shell"
    //of which it is gained more values based on the members age.
    public MemberAF(Member member) {
        this.member = member;
        if (member.getAge() < 18) {
            junior = true;
            senior = false;
        } else {
            senior = true;
            junior = false;
        }
        if (member.getAge() > 60) {
            ageBonus = true;
        }
    }


    public Member getMember() {
        return member;
    }

    public boolean isAgeBonus() {
        return ageBonus;
    }

    public boolean isSenior() {
        return senior;
    }

    public boolean isJunior() {
        return junior;
    }

    @Override
    public String toString() {
        return member + ", AGEBONUS: " + ageBonus + ", SENIOR: " + senior + ", JUNIOR: " + junior;
    }

    
    
    
}
