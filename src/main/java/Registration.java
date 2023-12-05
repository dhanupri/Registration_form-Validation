import java.lang.reflect.Method;
import java.util.Scanner;

class InvalidException extends Exception{

    InvalidException(String msg){
        super(msg);

    }

}

public class Registration {
    public static boolean FirstName(String First_name) {

        return First_name.matches("^[A-Z][a-z]{2,}$");


    }
    public static boolean LastName(String last_name) {
        return last_name.matches("^[A-Z][a-z]{2,}$");
    }
    public static boolean Email(String email) {
        return email.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
    }
    public static boolean Mobile_number(String mobile_number) {
        return mobile_number.matches("^\\d{2} \\d{10}$");
    }
    public static boolean Password(String password) {
        return password.matches("^(?=.*[A-Z]).(?=.*[0-9]).(?=[A-Za-z\\d]*[^A-Za-z\\d][A-Za-z\\d]*$){1}.{8,}$");

    }

    public static void Validation(String s,boolean b) throws InvalidException {
        if(!b){
            throw new InvalidException("Invalid Input....");

        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a First Name:");
        String First_name = sc.nextLine();
        try {
            Validation(First_name,FirstName(First_name));

        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }

        System.out.println("Enter a Last Name:");
        String Last_name=sc.nextLine();

        try{
            Validation(Last_name,LastName(Last_name));
        } catch (InvalidException e) {
            System.err.println(e.getMessage());

        }

        System.out.println("Enter an Email Id:");
        String email=sc.nextLine();
        try {
            Validation(email,Email(email));
        }
        catch (InvalidException e) {
            System.err.println(e.getMessage());

        }


        System.out.println("Enter Mobile Number");
        String mobile_number= sc.nextLine();
        try {
            Validation(mobile_number,Mobile_number(mobile_number));
        }
        catch (InvalidException e) {
            System.err.println(e.getMessage());

        }

        System.out.println("Enter a Password:");
        String password= sc.nextLine();
        try {
            Validation(password,Password(password));
        }
        catch (InvalidException e) {
            System.err.println(e.getMessage());

        }
       



    }
}
