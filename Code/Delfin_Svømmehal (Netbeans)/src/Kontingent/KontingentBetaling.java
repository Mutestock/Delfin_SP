/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kontingent;
import FormandAdgang.Member;
import java.time.LocalDate;
/**
 *
 * @author emils
 */

public class KontingentBetaling {
    
    //This class's function is to allow the "medlem" / subscriber / user to pay his/her subscription fee.

    //Data includes:
    //Basic personal information, e.g. age(full date of birth), full name, email, phone, etc.
    //Date of payment.
    //Subscription fee
    
    //Basic personal information is derived from the "FormandAdgang" package.    
    //All "kontingentBetaling" data is stored inside an external document. 
 
    private LocalDate feePaidDate;
    private int Fee;

    public KontingentBetaling(LocalDate feePaidDate, int Fee) {
        this.feePaidDate = feePaidDate;
        this.Fee = Fee;
    }

    public LocalDate getFeePaidDate() {
        return feePaidDate;
    }

    public void setFeePaidDate(LocalDate feePaidDate) {
        this.feePaidDate = feePaidDate;
    }

    public int getFee() {
        return Fee;
    }

    public void setFee(int Fee) {
        this.Fee = Fee;
    }
    
    
    
}
