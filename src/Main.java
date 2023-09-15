import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Task 1 - String variables
        /*
        String firstName = "John", lastName = "Jones", name = firstName + " " + lastName;
        System.out.println(name);
         */

        // Task 2 - Numbers
        int num1 = 1, num2 = 2;
        System.out.println(num1 + num2);

        double result = (double) num1 / num2;
        int num3 = 8;
        System.out.println(num3++);
        System.out.println(num3);
        System.out.println(++num3);

        // Task 3 - User input
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your first name:");
        String firstName = scan.next();
        System.out.println("Please enter your last name:");
        String lastName = scan.next();
        System.out.println("Hello " + firstName + " " + lastName);

        System.out.println("Please enter a number:");
        int firstNum = scan.nextInt();
        System.out.println("Please enter another number:");
        int secondNum = scan.nextInt();
        int sum = firstNum + secondNum;
        System.out.println("The sum of the numbers is " + sum);

    }
}