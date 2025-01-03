/* Math Operations with Static Import
Create a Java program that performs basic math operations
    (addition, subtraction, multiplication, division)
    using static imports for the Math class methods.
The program should have the following features:
Define a class named Task119. Inside the class,
create static methods for addition, subtraction, multiplication, and division.
Each method should take two parameters and return the result.
Use static imports for the Math class methods (Math.addExact(), Math.subtractExact(),
    Math.multiplyExact(), Math.floorDiv()).
In the main method, demonstrate the use of these static methods by
performing some math operations with different values.Display the results of each operation.
*/

import static java.lang.Math.*;

    public class Tasksheet121 {

        public static int add(int a, int b) {
            return addExact(a, b);
        }

        public static int subtract(int a, int b) {
            return subtractExact(a, b);
        }

        public static int multiply(int a, int b) {
            return multiplyExact(a, b);
        }

        public static int divide(int a, int b) {
            if (b == 0) {
                throw new ArithmeticException("Division by zero");
            }
            return floorDiv(a, b);
        }

        public static void main(String[] args) {
            int num1 = 10;
            int num2 = 2;

            int sum = add(num1, num2);
            int difference = subtract(num1, num2);
            int product = multiply(num1, num2);
            int quotient = divide(num1, num2);

            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
            System.out.println("Product: " + product);
            System.out.println("Quotient: " + quotient);
        }
    }
