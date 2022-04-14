package customerInfo;
import java.util.Scanner;

public class askingInfo {

    public static void main(String[] args){

        String firstName, lastName;
        int age;
        Long phoneNumber;
        Scanner read = new Scanner(System.in);
        System.out.println("Please, type your first name: ");
        firstName = read.nextLine();
        System.out.println("Please, type your last name: ");
        lastName = read.nextLine();
        System.out.println("Please, type your age: ");
        age = read.nextInt();
        System.out.println("Please, type your phone number: ");
        phoneNumber = read.nextLong();


        System.out.println("Welcome, mr. " + lastName + ". It's a pleasure for us to count on a person who is "
                + age + " years old" + ".");
        System.out.println("Soon, We will be getting in touch with you using your phone number " + phoneNumber + ".");
        System.out.println("Have a nice day!");

    }
}

