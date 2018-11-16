package Kontingent;

import FormandAdgang.Member;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/**
 *
 * @author moi(
 */
public class Kontingent {

    //The function of this class is for the kasserer(cashier) to manage the data of the subscribers.
    //This includes using the basic information which is derived from the "FormandAdgang" package,
    //as a means of calculating the fee of the subscriber.
//private LocalDate dayOfVisit = LocalDate.now();
//private String description;
    Member member;

    private int subCatalogueYear, subFee;

    public Kontingent(Member member, int subCatalogueYear) {
        this.subCatalogueYear = subCatalogueYear;
        this.member = member;
    }

    //Currently working as a separate entity, not using the list of registered members.
    //Note that using additional fields could improve the quality of the 60+ 25% rule.
    public static int calcFee(Member member) {
        if (member.isActivity() == true) {
            if (member.getAge() >= 60) {
                return 1200;
            } else if (member.getAge() >= 18) {
                return 1600;
            } else {
                return 1000;
            }
        }
        return 500;
    }

    public static PrintWriter createFile(String kontingentFilePath) {

        try {
            File listOfNames = new File(kontingentFilePath);
            PrintWriter infoWriter = new PrintWriter(new FileWriter(listOfNames));

            return infoWriter;
        } catch (IOException ex) {
            System.out.println("IO Exception!");
            System.exit(0);

        }
        return null;
    }

    public static void createSubscription(Kontingent kontingent, PrintWriter output) {

        String feeConv = Integer.toString(calcFee(kontingent.member));
        String subYear = Integer.toString(kontingent.subCatalogueYear);
        output.println(kontingent + feeConv + subYear);
    }

    public static void getFileInfo(String path) {
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

    @Override
    public String toString() {
        return member + " " + " " + subCatalogueYear + " Fee: " + subFee;
    }

}
