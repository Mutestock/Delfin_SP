/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trainer;

import Controller.Controller;
import FormandAdgang.Member;
import java.util.ArrayList;

public class Competetion {
    
    private ArrayList<Member> participants;
    private ArrayList<Result> results;
    private String competetionName;
    private String discipline;

    
    public Competetion(String competetionName, String Discipline) {
        this.competetionName = competetionName;
        this.discipline = Discipline;
    }
    
    
    public void addParticipant(String phone) {
        Controller c = new Controller();
        participants.add(c.getMember(phone));
    }
    
    public void addResult(String phone, int time) {
        Controller c = new Controller();
        results.add(c.createResult(c.getMember(phone), discipline, time));
    }

    public ArrayList<Member> getParticipants() {
        return participants;
    }

    public ArrayList<Result> getResults() {
        return results;
    }

    public String getCompetetionName() {
        return competetionName;
    }

    public String getDiscipline() {
        return discipline;
    }

    public ArrayList<Result> getRankings() {
        Controller c = new Controller();
        return c.getTop5Results(getResults());
    }
    
    
}
