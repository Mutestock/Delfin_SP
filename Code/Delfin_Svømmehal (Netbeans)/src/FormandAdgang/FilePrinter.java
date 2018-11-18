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

    ArrayList<String> membersArrayList = new ArrayList();
    
    //Defining filepath. Can be redefined if a new path is necessary.
    //If there's no D:\\ drive on your computer, you can change the path in order to get the .txt
    private static String filePath = "D:\\registrationNew.txt";
    
    
    //Creates file at set location. See createFile method
    private static PrintWriter printwriter = FilePrinter.createFile(filePath);

    public FilePrinter(String filePath, PrintWriter printwriter) {

        this.filePath = filePath;
        this.printwriter = printwriter;
    }

    
    //Creates new file at the chosen filepath and then writes to the file. 
    //The boolean value in filwriter indicates, whether you want to append to the file or not. 
    //if false or removed, the filewriter will overwrite
    public static PrintWriter createFile(String filePath) {
        try {
            File subInfo = new File(filePath);
            PrintWriter infoWriter = new PrintWriter(new FileWriter(subInfo, true));

            return infoWriter;
        } catch (IOException ex) {
            System.out.println("IO Exception!");
            System.exit(0);

        }
        return null;
    }
    
    
    //File reader. This method allows us to read and react from the .txt file. 
    //This is necessary when using the function where the user pays his fee(kontingentBetaling)(WIP)
    public void getFileInfo(String path) {
        //System.out.println("Info written to file...\n");
        File subListUpgrade = new File(path);
        membersArrayList.clear();

        try {
            BufferedReader getInfo = new BufferedReader(new FileReader(subListUpgrade));
            String subInfo = getInfo.readLine();
            

            while (subInfo != null) {
                membersArrayList.add(subInfo);
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

    //Serves as to write each individual line. If removed, only the last of the added members would be printed.
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

    
    
    
    public ArrayList<String> getMembersArrayList() {
        return membersArrayList;
    }
    
    public void printArrayList() {
        for (int i = 0; i < membersArrayList.size(); ++i) {
            System.out.println(membersArrayList.get(i));
        }
        
    }

}
