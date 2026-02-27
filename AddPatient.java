import java.time.*;
import java.util.Scanner;

public class AddPatient {

    //Name Information
    private String fname;
    private String lname;
    
    //Age Information
    private int age;
    private int birthday;
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


    public void SetAge(Scanner scanner) {
        //Set the aptients age
        while (true) {
            try {

                String birthdayDayString;
                String birthdayMonthString;
                String birthdayYearString;

                //Collect the values via user Input
                System.out.println("Please type in the day from your birthday: ");
                birthdayDayString = scanner.nextLine();

                System.out.println("Please type in the month from your birthday: ");
                birthdayMonthString = scanner.nextLine();

                System.out.println("Please type in the year where you born: ");
                birthdayYearString = scanner.nextLine();

                //Check if user_input is empty
                if (birthdayDayString.isBlank() || birthdayMonthString.isBlank() || birthdayYearString.isBlank()) {
                    throw new IllegalArgumentException("One of your inputs are blank please try again");
                } else {
                    //If not parse the integer values
                    this.birthday_day = Integer.parseInt(birthdayDayString);
                    this.birthday_month = Integer.parseInt(birthdayMonthString);
                    this.birthday_year = Integer.parseInt(birthdayYearString);

                    //Check if User input values are valid
                    if (this.birthday_day < 1 || this.birthday_month < 1 || this.birthday_year < 1) {
                        throw new IllegalArgumentException("The Day/Month/Year can't be less than 1");
                    } else if (this.birthday_year < 1900) {
                        throw new IllegalArgumentException("Are you realy this old? the year is invalid cause it's behind 1900");
                    } else if (this.birthday_year > LocalDate.now().getYear()) {
                        throw new IllegalArgumentException("Are you from the future? the year is invalid cause it's from the future");
                    } else if (this.birthday_month > 12) {
                        throw new IllegalArgumentException("Your month is out of range only 1-12 are valid");
                    }
                }
                break;
            } catch (Exception error) {
                System.out.println("\nThere is an error in your code");
                System.out.println("The error is: " + error + "\n");
            }
        }
    }

    //Display Data
    public void DisplayPatient() {
        System.out.println("\n------------------The Patient------------\n");
        System.out.println("First Name: " + this.fname);
        System.out.println("Last Name: " + this.lname);

        System.out.println("Birthday day: " + this.birthday_day);
        System.out.println("Birthday month: " + this.birthday_month);
        System.out.println("Birthday year: " + this.birthday_year);
    }

    //Add to Data Base
    //Coming Later....

}
