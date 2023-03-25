import java.util.Scanner;
import java.lang.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ScientificCalculator{
    private static final Logger logger = LogManager.getLogger(ScientificCalculator.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Scientific Calculator Menu:");
            System.out.println("1. Square root function");
            System.out.println("2. Factorial function");
            System.out.println("3. Natural logarithm (base е)");
            System.out.println("4. Power function");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    double sqrtNum = scanner.nextDouble();
                    double sqrtResult = Math.sqrt(sqrtNum);
                    System.out.println("The square root of " + sqrtNum + " is " + sqrtResult);
                    break;
                case 2:
                    System.out.print("Enter a number: ");
                    int factNum = scanner.nextInt();
                    int factResult = factorial(factNum);
                    System.out.println("The factorial of " + factNum + " is " + factResult);
                    break;
                case 3:
                    System.out.print("Enter a number: ");
                    double lnNum = scanner.nextDouble();
                    double lnResult = Math.log(lnNum);
                    System.out.println("The natural logarithm of " + lnNum + " is " + lnResult);
                    break;
                case 4:
                    System.out.print("Enter a base: ");
                    double powBase = scanner.nextDouble();
                    System.out.print("Enter an exponent: ");
                    double powExp = scanner.nextDouble();
                    double powResult = Math.pow(powBase, powExp);
                    System.out.println(powBase + " raised to the power of " + powExp + " is " + powResult);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 5.");
                    break;
            }
        }
    }

    public static double squareRoot(double num){
        if(num<0)
        {
            logger.error("[ERROR] - Factorial of -ve number not defined.");
            return -1.0;
        }
        double sqrt = Math.sqrt(num);
        logger.info("[SQRT] - " + num);
        logger.info("[RESULT - SQRT] - " + sqrt);
        return sqrt;
    }

    public static double naturalLog(double num){
        if(num == 0)
        {
            //Changes made
            logger.error("[ERROR] - Logarithm of 0 not defined.");
            return -1.0;
        }
        if(num < 0)
        {
            logger.error("[ERROR] - Logarithm of -ve not defined.");
            return -1.0;
        }
        double log = Math.log(num);
        logger.info("[LOG] - " + num);
        logger.info("[RESULT - LOG] - " + log);
        return log;
    }
    public static int factorial(int num){
        if(num < 0)
        {
            logger.error("[ERROR] - Factorial of -ve not defined.");
            return -1;
        }
        if(num == 0 || num == 1)
        {
            logger.info("[RESULT - FACTORIAL] - 1");
            return 1;
        }
        int fact = 1;
        for (int i = 1; i <= num; i++) {
                fact *= i;
        }
        logger.info("[FACT] - " + num);
        logger.info("[RESULT - FACT] - " + fact);
        return fact;
    }
    public static double powerFunction(double x, double b){
        if(x == 0 && b == 0)
        {
            logger.error("[ERROR] - 0 power 0 is not defined.");
            return -1.0;
        }
        double power = Math.pow(x, b);
        logger.info("[POW] - " + x + ", " + b);
        logger.info("[RESULT - POW] - " + power);
        return power;
    }

}
