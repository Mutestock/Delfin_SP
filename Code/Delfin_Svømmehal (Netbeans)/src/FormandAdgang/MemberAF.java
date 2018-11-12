
package FormandAdgang;

public class MemberAF {
    
    Member member;
    boolean ageBonus;
    boolean senior;
    boolean junior;
    
    
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

}
