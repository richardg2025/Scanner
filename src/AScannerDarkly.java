import java.util.Scanner;

public class AScannerDarkly {

    public static void main(String[] args) {

        // 1. Create a Scanner object called 'scanner' that reads user input.
        Scanner scanner = new Scanner(System.in);
        // 2. Print out a message that says "Please enter your first name: "
        System.out.println("Please enter your first name: ");
        // 3. Store the input into a variable called 'firstName'.
        String firstName = scanner.nextLine();
        // 4. Print out a message that says "Please enter your last name: "
        System.out.println(firstName);
        // 5. Store the input into a variable called 'lastName'.
        System.out.println("Please enter your last name: ");
        String lastName = scanner.nextLine();
//        System.out.println(lastName);
        // 6. Print out a message that says "Please enter your age: "
        System.out.println("Please enter your age: ");
        // 7. Store the input into a variable called 'age'.
        String age = scanner.nextLine();
//        System.out.println(age);
        // 8. Store all the details of the user into a variable called 'userInfo'.
        String userInfo = firstName + "\n" + lastName + "\n" + age;
            /* The format for this String should be, for example, as follows:

                First name: Keanu
                Last name: Reeves
                Age: 58

            */

        // 9. Print out the variable 'userInfo'.
        System.out.println(userInfo);
        // 10. Close the Scanner object.
        scanner.close();

    }

}
