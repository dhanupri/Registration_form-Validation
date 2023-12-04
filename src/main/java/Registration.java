import java.util.Scanner;

public class Registration {
    public static boolean FirstName(String First_name) {

        return First_name.matches("^[A-Z][a-z]{2,}$");


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a First Name:");
        String First_name = sc.nextLine();
        boolean result_First_name = FirstName(First_name);
    }
}
