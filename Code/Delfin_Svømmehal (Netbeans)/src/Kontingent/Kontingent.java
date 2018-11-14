package Kontingent;

import FormandAdgang.Member;
import FormandAdgang.MemberAF;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author ahmed
 */
public class Kontingent {

    //The function of this class is for the kasserer(cashier) to manage the data of the subscribers.
    //This includes using the basic information which is derived from the "FormandAdgang" package,
    //as a means of calculating the fee of the subscriber.
//    private LocalDate dayOfVisit = LocalDate.now();
//    private String description;
    Member member;

    ArrayList<Member> subList = new ArrayList();
    private String kontingentFile = "D:\\subList.txt";
    private int subCatalogueYear;
    private int subFee;

    private static final boolean DEBUG = true;

    public Kontingent(Member member, int subCatalogueYear) {
        this.subCatalogueYear = subCatalogueYear;
        this.subList.add(member);

        if (member.isActivity() == true) {
            if (member.getAge() <= 60) {
                subFee = 1200;
            } else if (member.getAge() <= 18) {
                subFee = 1600;
            } else {
                subFee = 1000;
            }
        }
        subFee = 500;
   
        PrintWriter out = null;
        try {
            File file = new File(kontingentFile);
            out = new PrintWriter(file);

            for (int i = 0; i < subList.size(); ++i) {
                out.println(subList.get(i));
            }

        } catch (FileNotFoundException ex) {
            if (DEBUG) {
                ex.printStackTrace();
            }
        } finally {
            out.close();
        }
    }
    
    //Currently working as a separate entity, not using the list of registered members.
    public int calcFee(Member member) {
        if (member.isActivity() == true) {
            if (member.getAge() <= 60) {
                return 1200;
            } else if (member.getAge() <= 18) {
                return 1600;
            } else {
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
