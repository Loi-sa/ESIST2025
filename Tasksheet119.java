//Create a a program where user inputs two numbers and perform 4 basic arithmetic operations
//        using 4 methods with return types and print the results.

import java.util.Scanner;
public class Tasksheet119 {

        public static double add(double num1, double num2) {
            return num1 + num2;
        }

        public static double subtract(double num1, double num2) {
            return num1 - num2;
        }

        public static double multiply(double num1, double num2) {
            return num1 * num2;
        }

        public static double divide(double num1, double num2) {
            if (num2 == 0) {
                System.out.println("Error: Division by zero is not allowed.");
                return Double.NaN; // Return Not-a-Number to indicate an error
            }
            return num1 / num2;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            double sum = add(num1, num2);
            double difference = subtract(num1, num2);
            double product = multiply(num1, num2);
            double quotient = divide(num1, num2);

            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
            System.out.println("Product: " + product);
            System.out.println("Quotient: " + quotient);

            }
    }