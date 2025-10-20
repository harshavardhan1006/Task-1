import java.util.Scanner;

public class ConsoleCalculator {

    public static double add(double a, double b) {    //addition
        return a + b;
    }

    public static double subtract(double a, double b) {    //subtraction
        return a - b;
    }

    public static double multiply(double a, double b) {    //multiplication
        return a * b;
    }

    public static double divide(double a, double b) {    //division
        if (b == 0) {
            System.out.println("Error :- cannot divide by zero.");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char choice;

        System.out.println("simple java console calculator");

        do {
            System.out.print("\nenter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("enter second number: ");
            double num2 = sc.nextDouble();

            System.out.println("\nchoose operation:");
            System.out.println("1. addition (+)");
            System.out.println("2. subtraction (-)");
            System.out.println("3. multiplication (*)");
            System.out.println("4. division (/)");

            System.out.print("enter your choice (1-4): ");

            int option = sc.nextInt();

            double result = 0;

            switch (option) {
                case 1 -> result = add(num1, num2);
                case 2 -> result = subtract(num1, num2);
                case 3 -> result = multiply(num1, num2);
                case 4 -> result = divide(num1, num2);
                default -> System.out.println("invalid option. try again.");
            }

            System.out.println("result = " + result);

            System.out.print("\ndo you want to perform another calculation ? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("\nthank you for using the calculator.");
        sc.close();
    }
}
