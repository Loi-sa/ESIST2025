/*Check whose largest number in 3 inputs
Write a program that takes in three numbers
from the user and outputs the largest number.
if all numbers are equal it will print All numbers are equal
*/
import java.util.Scanner;

public class Tasksheet117 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Enter third number: ");
        int num3 = scanner.nextInt();

        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal.");
        } else {
            int largest = Math.max(Math.max(num1, num2), num3);
            System.out.println("The largest number is: " + largest);
        }
    }
}