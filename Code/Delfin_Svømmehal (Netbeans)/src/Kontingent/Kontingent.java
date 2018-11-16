package Kontingent;

import FormandAdgang.Member;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


/**
 *
 * @author Ahmed
=======
/**
 *
 * @author moi(
>>>>>>> 22e330560ee4ff4eeb5324d1564c80e4f258fa20
 */
public class Kontingent {

    //The function of this class is for the kasserer(cashier) to manage the data of the subscribers.
    //This includes using the basic information which is derived from the "FormandAdgang" package,
    //as a means of calculating the fee of the subscriber.
    //private LocalDate dayOfVisit = LocalDate.now();
    //private String description;
    

    public Kontingent() {

    }

    //Currently working as a separate entity, not using the list of registered members.
    //Note that using additional fields could improve the quality of the 60+ 25% rule.

    public static int calcFee(Member member) {
        if (member.isActive() == true) {
            if (member.getAge() >= 60) {
                return 1200;
            } else if (member.getAge() >= 18) {
                return 1600;
            } else {
                return 1000;
            }
        }
        return 500;
    } // ville være en god ide at sætte den i member
    
    // ------------------------------------------
    // ----------------To Henning----------------
    // ------------------------------------------
    // ------------------------------------------
    /* Igen en metode som bør være under filhåndteringsklassen.
    */
    public void getFileInfo(String path) {
        System.out.println("Info written to file...\n");
        File subListUpgrade = new File(path);

        try {
            BufferedReader getInfo = new BufferedReader(new FileReader(subListUpgrade));
            String subInfo = getInfo.readLine();

            while (subInfo != null) {
                System.out.println(subInfo);
                subInfo = getInfo.readLine();
            }

        } catch (FileNotFoundException ex) {
            System.out.println("File not found...");
            System.exit(0);
        } catch (IOException ex) {
            System.out.println("IOException...");
            System.exit(0);
        }
    }



}
