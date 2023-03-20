import java.util.Scanner;
import java.lang.Math;

public class ScientificCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Select an operation: ");
            System.out.println("1. Square root");
            System.out.println("2. Natural log");
            System.out.println("3. Factorial");
            System.out.println("4. Power function");
            System.out.println("0. Exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter a number: ");
                    double num1 = scanner.nextDouble();
                    double sqrt = squareRoot(num1);
                    System.out.println("Square root of " + num1 + " is " + sqrt);
                    break;

                case 2:
                    System.out.println("Enter a number: ");
                    double num2 = scanner.nextDouble();
                    double log = naturalLog(num2);
                    System.out.println("Natural log of " + num2 + " is " + log);
                    break;

                case 3:
                    System.out.println("Enter a number: ");
                    int num3 = scanner.nextInt();
                    int fact = factorial(num3);
                    System.out.println("Factorial of " + num3 + " is " + fact);
                    break;

                case 4:
                    System.out.println("Enter the value of x: ");
                    double x = scanner.nextDouble();
                    System.out.println("Enter the value of b: ");
                    double b = scanner.nextDouble();
                    double power = powerFunction(x, b);
                    System.out.println(x + " raised to the power of " + b + " is " + power);
                    break;

                case 0:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);
        scanner.close();
    }

    public static double squareRoot(double num){
        double sqrt = Math.sqrt(num);
        return sqrt;
    }

    public static double naturalLog(double num){
        double log = Math.log(num);
        return log;
    }
    public static int factorial(int num){
        int fact = 1;
        for (int i = 1; i <= num; i++) {
                fact *= i;
        }
        return fact;
    }
    public static double powerFunction(double x, double b){
        double power = Math.pow(x, b);
        return power;
    }
}
