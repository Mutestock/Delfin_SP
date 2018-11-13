package Kontingent;
import FormandAdgang.Member;
import java.time.LocalDate;

/**
 *
 * @author ahmed
 */

public class Kontingent {

    
    private LocalDate dayOfVisit = LocalDate.now();
    private String description;

    public Kontingent(LocalDate dayOfVisit,String description) {
        this.dayOfVisit = dayOfVisit;
        this.description = description;
    }
    
}
