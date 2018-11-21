package Controller;

import FormandAdgang.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;
import Trainer.*;

public class Controller {

    //The Controller's purpose is to collect methods and make them easy to handle and instanciate.
    //Since this also acts as a hub for the GUI to interact with the rest of the classes.
    //Could be seen as the brain of the program (WIP).
    //To do list:
    //merge junior/senior as a single boolean value
    //Implement Controller
    //Connect GUI to controller
    //Connect other functionalities to Controller and GUI.
    //Consider the functionality of the Main Method in registration when the Controller has been implemented
    //Make it possible for the GUI to go back to the main menu after having chosen a role.
    //Change GUI Class names.
    //Clean up redundant GUI code
    //Stretch goals:
    //Additional basic information for members and trainer (e.g. phonenumber).
    //Make unit test for the .txt files. Test the perfomance of the PrintWriter.
    //Controller methods:
    //createMember()                (added)
    //updateMember(Member member)   ()
    //deleteMember(Member member)   (added)  
    //getAllMembers()               (added)
    // - (^ read members)
    //Controller methods (methods of which we have yet to implement at all)
    //top5Members(Discipline discipline)
    // - (^ We should create a class for eat discipline and save
    // - (the top 5 members of each discipline in their seperate classes)
    //registerResult()
    //getResult(-unknown parameter-)
    //getBalanceSheet()
    //createContingentPayment(Member member);
    public Controller() {
    }

    //Methods
    //createMember creates a new instance of a member and adds it to the .txt file.
    public void createMember(String name, int age, String phone, boolean activityForm, boolean competetive) {
        Member member = new Member(name, age, phone, activityForm, competetive);
        Registration r = new Registration();
        r.registerMember(member);
    }

    //updateMember should in the easiest way update all parameters of any member
    //from the .txt file.
    public Member getMember(String phone) {
        String inputFileName = FilePrinter.getFilePath();
        String outputFileName = FilePrinter.getFilePath();
        String lineToUpdate = phone;

        File inputFile = new File(inputFileName);
        File outputFile = new File(outputFileName);

        Member member = null;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            String line = reader.readLine();
            String temp = new String();
            while (line != null) {
                if (line.contains(lineToUpdate)) {
                    temp = line;
                    break;
                }
                line = reader.readLine();
            }
            reader.close();

            String name = "";
            String parseAge = "";
            boolean activityForm = false;
            boolean competetive = false;
            int counter = 0;
            for (int i = 0; i < line.length(); ++i) {
                if (line.charAt(i) == ',') {
                    counter++;
                }

                if (counter == 0) {
                    name += line.charAt(i);
                }

                if (counter == 1) {
                    if (line.charAt(i) == ',') {

                    } else {
                        parseAge += line.charAt(i);
                    }
                }

                if (counter == 2) {
                    if (line.charAt(i) == ',') {
                    } else {
                        if (line.charAt(i) == 't') {
                            activityForm = true;
                        }
                    }
                }

                if (counter == 3) {
                    if (line.charAt(i) == ',') {
                    } else {
                        if (line.charAt(i) == 't') {
                            competetive = true;
                        }
                    }
                }
            }
            System.out.println(parseAge);
            int age = Integer.parseInt(parseAge);
            member = new Member(name, age, phone, activityForm, competetive);

        } catch (Exception e) {
        }
        return member;
    }

    //Returns a list of all the members that is contained by the .txt file from
    //getFilePath();
    public ArrayList<Member> getAllMembers() {
        FilePrinter f = new FilePrinter(FilePrinter.getFilePath(), FilePrinter.getPrintwriter(FilePrinter.getFilePath()));
        f.getFileInfo(FilePrinter.getFilePath());

        int counter = 0;

        ArrayList<Member> membersList = new ArrayList();
        ArrayList<String> allMembers = f.getFileArrayList();
        for (int i = 0; i < allMembers.size(); ++i) {
            String name = "";
            String parseAge = "";
            String phone = "";
            boolean activityForm = false;
            String act = "";
            boolean competetive = false;
            String comp = "";

            for (int j = 0; j < allMembers.get(i).length(); ++j) {

                if (f.getFileArrayList().get(i).charAt(j) == '.') {
                    int age = Integer.parseInt(parseAge);
                    Member member = new Member(name, age, phone, activityForm, competetive);
                    membersList.add(member);
                    counter = 0;
                }

                if (f.getFileArrayList().get(i).charAt(j) == ',') {
                    counter++;

                } else if (counter == 0) {
                    if (f.getFileArrayList().get(i).charAt(j) == ',') {

                    } else {
                        name += f.getFileArrayList().get(i).charAt(j);
                    }
                } else if (counter == 1) {
                    if (f.getFileArrayList().get(i).charAt(j) == ',') {

                    } else {
                        parseAge += f.getFileArrayList().get(i).charAt(j);
                    }
                } else if (counter == 2) {
                    phone += f.getFileArrayList().get(i).charAt(j);
                } else if (counter == 3) {
                    act += f.getFileArrayList().get(i).charAt(j);
                    if (act.contains("true")) {
                        activityForm = true;
                    }
                } else if (counter == 4) {
                    comp += f.getFileArrayList().get(i).charAt(j);
                    if (comp.contains("true")) {
                        competetive = true;
                    }
                }
            }
        }
        return membersList;
    }

    public ArrayList<Member> getAllJunior() {
        ArrayList<Member> member = getAllMembers();
        ArrayList<Member> junior = new ArrayList();
        for (int i = 0; i < member.size(); ++i) {
            Member memberinst = member.get(i);
            if (memberinst.isJunior()) {
                junior.add(memberinst);
            }
        }
        return junior;
    }

    public ArrayList<Member> getAllSenior() {
        ArrayList<Member> member = getAllMembers();
        ArrayList<Member> senior = new ArrayList();
        for (int i = 0; i < member.size(); ++i) {
            Member memberinst = member.get(i);
            if (memberinst.isSenior()) {
                senior.add(memberinst);
            }
        }
        return senior;
    }

    public ArrayList<Member> getAllCompJunior() {
        ArrayList<Member> member = getAllMembers();
        ArrayList<Member> compJunior = new ArrayList();
        for (int i = 0; i < member.size(); ++i) {
            Member memberinst = member.get(i);
            if (memberinst.isJunior() && memberinst.isCompetetive()) {
                compJunior.add(memberinst);
            }
        }
        return compJunior;
    }

    public ArrayList<Member> getAllCompSenior() {
        ArrayList<Member> member = getAllMembers();
        ArrayList<Member> senior = new ArrayList();
        for (int i = 0; i < member.size(); ++i) {
            Member memberinst = member.get(i);
            if (memberinst.isSenior() && memberinst.isCompetetive()) {
                senior.add(memberinst);
            }
        }
        return senior;
    }

    //Deletes all lines containing the contents of lineToRemove from a .txt
    public void deleteMember(String phone) {
        String inputFileName = FilePrinter.getFilePath();
        String outputFileName = FilePrinter.getFilePath();
        String lineToRemove = phone;

        File inputFile = new File(inputFileName);
        File outputFile = new File(outputFileName);

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            String line = reader.readLine();
            ArrayList<String> temp = new ArrayList();
            while (line != null) {
                if (!line.contains(lineToRemove)) {
                    temp.add(line);
                }
                line = reader.readLine();
            }
            reader.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            for (int i = 0; i < temp.size(); ++i) {
                writer.write(temp.get(i));
                writer.newLine();
            }
            writer.close();

        } catch (IOException e) {
        }
    }

    public void registerMember(Member member) {
        Registration r = new Registration();
        r.registerMember(member);
    }

    public void registerResult(Member member, String discipline, int time) {
        Result result = new Result(member, discipline, time);
        Result.registerResult(result);
    }

    public ArrayList<Result> getAllResults() {
        FilePrinter fp = new FilePrinter(FilePrinter.getFilePathResults(), FilePrinter.getPrintwriter(FilePrinter.getFilePathResults()));
        fp.getFileInfo(FilePrinter.getFilePathResults());

        int counter = 0;
        ArrayList<String> fileInfo = fp.getFileArrayList();
        ArrayList<Result> resultList = new ArrayList();
        for (int i = 0; i < fileInfo.size(); ++i) {

            String name = "";
            String parseAge = "";
            String phone = "";

            String discipline = "";
            String parseTime = "";

            for (int j = 0; j < fileInfo.get(i).length(); ++j) {
                if (fileInfo.get(i).charAt(j) == '}' || fileInfo.get(i).charAt(j) == ',' || fileInfo.get(i).charAt(j) == '{') {
                    counter++;
                } else if (counter == 1) {
                    name += fileInfo.get(i).charAt(j);
                } else if (counter == 2) {
                    parseAge += fileInfo.get(i).charAt(j);
                } else if (counter == 3) {
                    phone += fileInfo.get(i).charAt(j);
                } else if (counter == 4) {
                    discipline += fileInfo.get(i).charAt(j);
                } else if (counter == 5 && fileInfo.get(i).charAt(j) != '.') {
                    parseTime += fileInfo.get(i).charAt(j);

                } else if (fileInfo.get(i).charAt(j) == '.') {

                    int age = Integer.parseInt(parseAge);
                    Member member = new Member(name, age, phone, true, true);
                    int time = Integer.parseInt(parseTime);
                    Result result = new Result(member, discipline, time);
                    resultList.add(result);
                    counter = 0;
                }

            }
        }
        return resultList;
    }

    public ArrayList<Result> getTop5Results(ArrayList<Result> results) {
        ArrayList<Result> top5 = new ArrayList();
        Controller c = new Controller();

        Member member = new Member("",0,"",true,true);
        Result result = new Result(member,"",999999999);
        top5.add(result);
        
        for (int i = 0; i < 5; ++i) {
            int n = 0;
            int temp = top5.get(0).getTime();
            
            for (int j = 0; j < results.size(); ++j) {    
                if (results.get(j).getTime() < temp) {
                    temp = results.get(j).getTime();
                    n = j;
                }
            }
            top5.add(results.get(n));
            results.remove(n);
        }
        top5.remove(0);
        return top5;
    }

    public ArrayList<Result> getAllJuniorResults() {
        Controller c = new Controller();
        ArrayList<Result> allResults = c.getAllResults();
        ArrayList<Result> allJuniorResults = new ArrayList();
        
        for (int i = 0; i < allResults.size(); ++i) {
            if (allResults.get(i).getMember().isJunior()) {
                allJuniorResults.add(allResults.get(i));
            }
        }
        return allJuniorResults;
    }
    

    public ArrayList<Result> getAllSeniorResults() {
        Controller c = new Controller();
        ArrayList<Result> allResults = c.getAllResults();
        ArrayList<Result> allSeniorResults = new ArrayList();
        
        for (int i = 0; i < allResults.size(); ++i) {
            if (allResults.get(i).getMember().isSenior()) {
                allSeniorResults.add(allResults.get(i));
            }
        }
        return allSeniorResults;
    }
    
    public ArrayList<Result> getDisciplineTop5(String discipline,ArrayList<Result> results) {
        Controller c = new Controller();
        ArrayList<Result> allResults = results;
        ArrayList<Result> disciplineResults = new ArrayList();
        
        for (int i = 0; i < allResults.size(); ++i) {
            if (allResults.get(i).getDiscipline().equals(discipline)) {
                disciplineResults.add(allResults.get(i));
            }
        }
        return c.getTop5Results(disciplineResults);
    }


}
