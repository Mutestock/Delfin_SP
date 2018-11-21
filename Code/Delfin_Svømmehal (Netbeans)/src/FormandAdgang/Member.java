
package FormandAdgang;

public class Member {
    

    //The fields/values of a member.
    private String name;
    private int age;
    private String phone;
    private boolean activity;
    private boolean competetive;
    private boolean ageBonus;
    private boolean senior;
    private boolean junior;
    
    //Kontingent fields has been merged to 
    private int subCatalogueYear;
    private int subFee;
    
    //Trainer fields added to member class
    private boolean compButterfly;
    private boolean compBreastStroke;
    private boolean compBackstroke;
    private boolean compFree;

    public Member(String name, int age, String phone, boolean activityForm, boolean competetive) {

        this.name = name;
        this.age = age;
        this.activity = activityForm;
        this.competetive = competetive;
        this.phone = phone;
        //Sets the value of a member to either Junior or Senior
        //and also checks if the member is old enough for an age bonus.
        if (getAge() < 18) {
            this.junior = true;
            this.senior = false;
        } else {
            this.senior = true;
            this.junior = false;
        }
        if (getAge() > 60) {
            this.ageBonus = true;
        }
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isActive() {
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

    public int getSubCatalogueYear() {
        return subCatalogueYear;
    }

    public int getSubFee() {
       return subFee = calcFee();
    }

    public void setSubCatalogueYear(int subCatalogueYear) {
        this.subCatalogueYear = subCatalogueYear;
    }

    public void setSubFee(int subFee) {
        this.subFee = subFee;
    }
    
    

    public boolean isCompButterfly() {
        return compButterfly;
    }

    public void setCompButterfly(boolean compButterfly) {
        this.compButterfly = compButterfly;
    }

    public boolean isCompBreastStroke() {
        return compBreastStroke;
    }

    public void setCompBreastStroke(boolean compBreastStroke) {
        this.compBreastStroke = compBreastStroke;
    }

    public boolean isCompBackstroke() {
        return compBackstroke;
    }

    public void setCompBackstroke(boolean compBackstroke) {
        this.compBackstroke = compBackstroke;
    }

    public boolean isCompFree() {
        return compFree;
    }

    public void setCompFree(boolean compFree) {
        this.compFree = compFree;
    }

    
    
    //Logic method used to calculate a certain members fee (based on their age)
    //It's functionality has been implemented in the constructor.
    //Kept since it might become useful later.
    
    public int calcFee() {
        if (isActive() == true) {
            if (getAge() >= 60) {
                return 1200;
            } else if (getAge() >= 18) {
                return 1600;
            } else {
                return 1000;
            }
        }
        return 500;
   }

    
    //toString will have to get simplified and easier to read.
    @Override
    public String toString() {
        return name + "," + age + "," + phone + "," + activity + "," + competetive + "," + ageBonus + "," + senior + "," + junior + "," + subCatalogueYear + "," + getSubFee() + ".";
    }
    
    
    
   
    
    
    
}
