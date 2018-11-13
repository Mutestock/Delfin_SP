/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kontingent;

import FormandAdgang.Member;
import java.time.LocalDate;



public class Kontingent {
    
    private LocalDate dayOfVisit = LocalDate.now();
    private String description;

    public Kontingent(LocalDate dayOfVisit,String description) {
        this.dayOfVisit = dayOfVisit;
        this.description = description;
    }
    
    
}
