
package FormandAdgang;

public class Member {
    
    //The fields/values of a member.
    String name;
    int age;
    boolean activity;
    boolean competetive;
    //--Need to add more at a certain point (We need "stamoplysninger")!--//
    
    boolean ageBonus;
    boolean senior;
    boolean junior;
    
    public Member(String name, int age, boolean activityForm, boolean competetive) {
        this.name = name;
        this.age = age;
        this.activity = activityForm;
        this.competetive = competetive;
        
        if (getAge() < 18) {
            junior = true;
            senior = false;
        } else {
            senior = true;
            junior = false;
        }
        if (getAge() > 60) {
            ageBonus = true;
        }
    }

    
    //A lot of get-methods.
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isActivity() {
        return activity;
    }

    public boolean isCompetetive() {
        return competetive;
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
        return "Member{" + "name=" + name + ", age=" + age + ", activity=" + activity + ", competetive=" + competetive + ", ageBonus=" + ageBonus + ", senior=" + senior + ", junior=" + junior + '}';
    }

    
    
    
    
}
