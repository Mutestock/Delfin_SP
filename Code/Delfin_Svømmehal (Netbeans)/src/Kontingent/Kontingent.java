package Kontingent;

import FormandAdgang.Member;
import FormandAdgang.MemberAF;
import java.time.LocalDate;

/**
 *
 * @author Ahmed
 */
public class Kontingent {

    //The function of this class is for the kasserer(cashier) to manage the data of the subscribers.
    //This includes using the basic information which is derived from the "FormandAdgang" package,
    //as a means of calculating the fee of the subscriber.
    
//    private LocalDate dayOfVisit = LocalDate.now();
//    private String description;
 
    Member member;
    private String kontingentFile;
    private int subCatalogueYear;
    private int subFee;

    public Kontingent(Member member,int subCatalogueYear) {
        this.subCatalogueYear = subCatalogueYear;
        
        if (member.isActivity()==true)
        {
            if (member.getAge()<=60)
            {
                subFee = 1200;
            }
            else if (member.getAge()<=18)
            {
                subFee = 1600;
            }
            else
            {
                subFee = 1000;
            }
        }
        subFee= 500;  
    }

    //Currently working as a separate entity, not using the list of registered members.
    
    public int calcFee (Member member)
    {
        if (member.isActivity()==true)
        {
            if (member.getAge()<=60)
            {
                return 1200;
            }
            else if (member.getAge()<=18)
            {
                return 1600;
            }
            else
            {
                return 1000;
            }
        }
        return 500;
    }

    public int getSubCatalogueYear() {
        return subCatalogueYear;
    }
    
  

    public int getSubFee() {
        return subFee;
    }

    public void setSubFee(int subFee) {
        this.subFee = subFee;
    }

   
  

}
