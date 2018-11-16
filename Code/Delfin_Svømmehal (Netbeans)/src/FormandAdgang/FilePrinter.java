/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormandAdgang;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Moi(
 */
public class FilePrinter {

    //Defining filepath. Can be redefined if a new path is necessary.
    private static String filePath = "D:\\registrationNew.txt";
    private static PrintWriter printwriter = FilePrinter.createFile(filePath);

    public FilePrinter(String filePath, PrintWriter printwriter) {

        this.filePath = filePath;
        this.printwriter = printwriter;
    }

    public static PrintWriter createFile(String filePath) {
        try {
            File listOfNames = new File(filePath);
            PrintWriter infoWriter = new PrintWriter(new FileWriter(listOfNames));

            return infoWriter;
        } catch (IOException ex) {
            System.out.println("IO Exception!");
            System.exit(0);

        }
        return null;
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

    public static void subLister(ArrayList<Member> ArrayList, PrintWriter printer) {
        for (int i = 0; i < ArrayList.size(); ++i) {
            printer.println(ArrayList.get(i));
        }
    }

    public static String getFilePath() {
        return filePath;
    }

    public static PrintWriter getPrintwriter(String path) {
        printwriter = FilePrinter.createFile(path);

        return printwriter;
    }

}
