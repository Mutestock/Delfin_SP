
package Controller;
import FormandAdgang.*;
import java.util.ArrayList;

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
    //deleteMember(Member member)   ()  
    //getAllMembers()               ()
    // - (^ read members)
    
    //Controller methods (methods of which we have yet to implement at all)
    //top5Members(Diciplin diciplin)
    // - (^ We should create a class for eat diciplin and save
    // - (the top 5 members of each diciplin in their seperate classes)
    //registerResult()
    //getResult(-unknown parameter-)
    //getBalanceSheet()
    //createContingentPayment(Member member);
    
    
    public Controller() {
    }
    
    
    
    //Methods
    
    //createMember creates a new instance of a member and adds it to the .txt file.
    public void createMember(String name, int age, String phone, boolean activityForm, boolean competetive)  {
        Member member = new Member(name, age, phone, activityForm, competetive);
        Registration r = new Registration();
        r.registerMember(member);
    }
    
    //updateMember should in the easiest way update any parameter of any member
    //from the .txt file.
    public void updateMember() {
        
    }
    
    //deleteMember deletes a member from the .txt file.
    public void deleteMember() {
        
    }
    
    //getAllMembers returns a String list of all members registered in the .txt file.
    public ArrayList<String> getAllMembers() {
        FilePrinter f = new FilePrinter(FilePrinter.getFilePath(),FilePrinter.getPrintwriter(FilePrinter.getFilePath()));
        f.getFileInfo(FilePrinter.getFilePath());
        return f.getMembersArrayList();
    }
    
    
    
}
