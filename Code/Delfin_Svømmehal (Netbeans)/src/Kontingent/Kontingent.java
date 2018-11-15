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
    

    public Kontingent() {

    }

    //Currently working as a separate entity, not using the list of registered members.
    //Note that using additional fields could improve the quality of the 60+ 25% rule.
    
    
    
    
    // ------------------------------------------
    // ----------------To Henning----------------
    // ------------------------------------------
    // ------------------------------------------
    /* createFile() bør være en metode som simpelthen bare kan lave en fil
        navngivet efter en String parameter. Den metode bør sættes i den kommende
        fil-håndterings-klasse.
    */
    public PrintWriter createFile(String kontingentFilePath) {
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

    // ------------------------------------------
    // ----------------To Henning----------------
    // ------------------------------------------
    // ------------------------------------------
    /* createSubscription() kan vi godt beholde her i en kontingentklasse
        men jeg vil gerne have den simplificeret til det punkt hvor alt ang.
        filer i denne metode foregår gennem andre metode fra fil klassen.
    */
    public void createSubscription(Member member, PrintWriter output) {

        String feeConv = Integer.toString(member.calcFee());
        String subYear = Integer.toString(member.getSubCatalogueYear());
        output.println(member + feeConv + subYear);
    }

    
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
