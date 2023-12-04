import java.util.Scanner;

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
        return password.matches("=\"^[A-Z][a-z]{2,}$");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a First Name:");
        String First_name = sc.nextLine();
        boolean result_First_name = FirstName(First_name);
        System.out.println("Enter a Last Name:");
        String Last_name=sc.nextLine();
        boolean result_last_Name=LastName(Last_name);
        System.out.println("Enter an Email Id:");
        String email=sc.nextLine();
        boolean result_email=Email(email);
        System.out.println("Enter Mobile Number");
        String mobile_number= sc.nextLine();
        boolean result_mobile_number=Mobile_number(mobile_number);
        System.out.println("Enter a Password:");
        String password= sc.nextLine();
        boolean result_password=Password(password);



    }
}
