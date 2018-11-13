package Kontingent;
import FormandAdgang.Member;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author ahmed
 */

public class Kontingent {

    
    private LocalDateTime kontingentÅr;
    private String sum ;
  

    public Kontingent(LocalDateTime Kontingent,String sum) {
        this.kontingentÅr = kontingentÅr;
        this.sum = sum;
    }
    
    public Kontingent(String sum)
    {
        this(LocalDateTime.now(), sum);
    }
    
    String opDate = kontingentÅr.format(DateTimeFormatter.ISO_LOCAL_DATE);
    
  /*  public Kontingent( LocalDateTime hasPaid, String name, int age, boolean activityForm, boolean competetive ){   
        super( name, age, activityForm, competetive);
        this.Kontingent = hasPaid;
        
    }*/
}
