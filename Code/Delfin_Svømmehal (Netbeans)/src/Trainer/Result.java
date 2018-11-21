/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trainer;

import FormandAdgang.FilePrinter;
import FormandAdgang.Member;
import java.io.PrintWriter;

public class Result {
    
    private Member member;
    private String diciplin;
    private int time;

    public Result(Member member, String diciplin, int time) {
        this.member = member;
        this.diciplin = diciplin;
        this.time = time;
    }

    
    public static void registerResult(Result result) {
        String path = FilePrinter.getFilePathResults();
        PrintWriter print = FilePrinter.getPrintwriter(path);
        print.println(result);
        print.close();
    }
    
    public Member getMember() {
        return member;
    }

    public String getDiciplin() {
        return diciplin;
    }

    public int getTime() {
        return time;
    }

    @Override
    public String toString() {
        return '{' + member.getName() + "," + member.getAge() + "," + member.getPhone() + "}" + diciplin + "," + time + '.';
    }
    
    
}
