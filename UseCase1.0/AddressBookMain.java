import java.util.*;

public class AddressBookMain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String firstName = sc.nextLine();
        System.out.println("Enter Last Name: ");
        String lastName = sc.nextLine();
        System.out.println("Enter Address: ");
        String address = sc.nextLine();
        System.out.println("Enter City: ");
        String city = sc.nextLine();
        System.out.println("Enter State: ");
        String state = sc.nextLine();
        System.out.println("Enter Zip Code: ");
        int zip = sc.nextInt();
        System.out.println("Enter Phone Number: ");
        long phoneNumber = sc.nextLong();
        sc.nextLine(); // consume the newline character
        System.out.println("Enter Email: ");
        String email = sc.nextLine();

        contact contact1 = new contact(firstName, lastName, address, city, state, zip, phoneNumber, email);

        System.out.println(contact1.toString());
    }

}
