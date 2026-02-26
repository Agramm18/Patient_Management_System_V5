import java.time.*;
import java.util.Scanner;

public class AddPatient {

    //Name Information
    private String fname;
    private String lname;
    
    //Age Information
    private int age;
    private int birthday_day;
    private int birthday_month;
    private int birthday_year;

    //Body details
    private double heihgt_cm;
    private double weight_kg;

    //Address Information
    private String country;
    private String county;
    private String city;
    private String PostalCode;
    private String StreetName;
    private String StreetNumber;

    public AddPatient() {
        //Values come via User Input
    }

    //Hello MSG
    public static void ShowAddHelloMSG() {
        System.out.println("\n==================================================");
        System.out.println("====You can now Add your patient to the System====");
        System.out.println("==================================================\n");
    }

    //Set basic values for name
    public void AddBasicInformation(Scanner scanner) {
        while (true) {
            try {
                //Set Values
                System.out.println("Please type in your first name: ");
                this.fname = scanner.nextLine();

                System.out.println("Please type in your last name: ");
                this.lname = scanner.nextLine();
                //Error Handeling
                if (this.fname == null || this.fname.isBlank()) {
                    throw new IllegalArgumentException("Your Firstname seems to be empty");
                } else if (this.lname == null || this.lname.isBlank()) {
                    throw new IllegalArgumentException("Your last name seems to be empty");
                } else {
                    break;
                }

            } catch (Exception error) {
                System.out.println("\nThere is your error in your name");
                System.out.println("The error is: " + error + "\n");
            }
        }
    }

    //Display Data
    public void DisplayPatient() {
        System.out.println("\n------------------The Patient------------\n");
        System.out.println("First Name: " + this.fname);
        System.out.println("Last Name: " + this.lname);
    }

    //Add to Data Base
    //Coming Later....

}
