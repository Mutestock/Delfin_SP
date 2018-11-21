/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kontingent;

import FormandAdgang.FilePrinter;
import FormandAdgang.Member;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Moi(
 */
public class Kontingent {

    //A lot of these methods have been taken directly from Controller. This is not the best choice of action.
    static ArrayList<Member> registeredMembers = new ArrayList();
    ArrayList<String> membersArrayList = new ArrayList();
    String kontingentPath = "D:\\kontingentList.txt";
    Member member;
    int subYear;

    public Kontingent() {
    }

    public void createMember(String name, int age, String phone, boolean activityForm, boolean competetive) {
        Member member = new Member(name, age, phone, activityForm, competetive);
        registerMember(member);
    }

    public void registerMember(Member member) {
        this.registeredMembers.clear();
        //RegisteredMembers is a list of ALL registered members in the club.
        this.registeredMembers.add(member);
        //team.addMember is a method of adding the member to the correct team.

        PrintWriter print = FilePrinter.getPrintwriter(kontingentPath);
        FilePrinter.subLister(registeredMembers, print);
        print.close();
    }

    public Member getMember(String phone) {
        String inputFileName = kontingentPath;
        String outputFileName = kontingentPath;
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

    public ArrayList<Member> getAllMembers() {
        FilePrinter f = new FilePrinter(kontingentPath, FilePrinter.getPrintwriter(kontingentPath));
        f.getFileInfo(kontingentPath);

        int counter = 0;

        ArrayList<Member> membersList = new ArrayList();
        ArrayList<String> allMembers = membersArrayList;
        for (int i = 0; i < allMembers.size(); ++i) {
            String name = "";
            String parseAge = "";
            String phone = "";
            boolean activityForm = false;
            String act = "";
            boolean competetive = false;
            String comp = "";

            for (int j = 0; j < allMembers.get(i).length(); ++j) {

                if (membersArrayList.get(i).charAt(j) == '.') {
                    int age = Integer.parseInt(parseAge);
                    Member member = new Member(name, age, phone, activityForm, competetive);
                    membersList.add(member);
                    counter = 0;
                }

                if (membersArrayList.get(i).charAt(j) == ',') {

                    counter++;
                } else if (counter == 0) {
                    if (membersArrayList.get(i).charAt(j) == ',') {

                    } else {
                        name += membersArrayList.get(i).charAt(j);
                    }
                } else if (counter == 1) {
                    if (membersArrayList.get(i).charAt(j) == ',') {

                    } else {
                        parseAge += membersArrayList.get(i).charAt(j);
                    }
                } else if (counter == 2) {
                    phone += membersArrayList.get(i).charAt(j);
                } else if (counter == 3) {
                    act += membersArrayList.get(i).charAt(j);
                    if (act.contains("true")) {
                        activityForm = true;
                    }
                } else if (counter == 4) {
                    comp += membersArrayList.get(i).charAt(j);
                    if (comp.contains("true")) {
                        competetive = true;
                    }
                }
            }
        }
        return membersList;
    }

    public Member getMember() {
        return member;
    }

    public int getSubYear() {
        return subYear;
    }

    public int getSubFee() {
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

    @Override
    public String toString() {
        return member.getName() + member.getAge() + member.getPhone() + member.isActive() + member.isCompetetive() + ", subYear=" + subYear + ", subFee=" + getSubFee();
    }

}
