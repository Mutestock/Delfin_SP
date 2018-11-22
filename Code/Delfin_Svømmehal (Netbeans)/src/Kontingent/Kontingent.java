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

    private Member member;
    private int subYear;
    private int fee;
    private final boolean wasActive;
    private final boolean wasCompetitive;

    public Kontingent(Member member, int subYear, boolean wasActive, boolean wasCompetitive) {
        this.member = member;
        this.subYear = subYear;
        this.wasActive = wasActive;
        this.wasCompetitive = wasCompetitive;
        
    }

    public static void registerKontingent(Kontingent k) {
        System.out.println("##########################");
        System.out.println(k);
        String path = FilePrinter.getFilePathKontingent();
        PrintWriter print = FilePrinter.getPrintwriter(path);
        String output = k.member.getName()+","+k.member.getAge()+","+k.member.getPhone()+","+k.wasActive+","+k.wasCompetitive+k.getSubYear()+k.getSubFee();
        print.println(k);
        print.close();

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
                fee = 1200;
            } else if (member.getAge() >= 18) {
                fee = 1600;
            } else {
                fee = 1000;
            }
        } else {
            fee = 500;
        }
        return fee;
    }

    @Override
    public String toString() {
        return member.getName() + member.getAge()+ member.getPhone() +  member.isActive() + member.isCompetetive() + getSubYear() + getSubFee();
    }

}
