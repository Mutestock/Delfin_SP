
package FormandAdgang;

public class Member {
    
    //The fields/values of a member.
    String name;
    int age;
    boolean activity;
    boolean competetive;
    //--Need to add more at a certain point (We need "stamoplysninger")!--//
    
    public Member(String name, int age, boolean activityForm, boolean competetive) {
        this.name = name;
        this.age = age;
        this.activity = activityForm;
        this.competetive = competetive;
    }

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

    
    @Override
    public String toString() {
        return "NAME: " + name + ", AGE: " + age + ", ACTIVITY: " + activity + ", COMPETETIVE: " + competetive;
    }
    
    
}
