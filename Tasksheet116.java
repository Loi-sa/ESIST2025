/*Write a program that takes a string as input and checks if it is a palindrome.
A palindrome is a word, number, or other sequence of characters that reads the same forward and backward.
Your program should perform the following steps:
Use StringBuilder to create a new string that is a reverse of the input string.
Use the equals() method to check if the input string and the reversed string are the same.
If the strings are the same, print "The input string is a palindrome."
If the strings are not the same, print "The input string is not a palindrome."*/
import java.util.Scanner;
public class Tasksheet116 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String inputString = scanner.nextLine();

            StringBuilder reversedString = new StringBuilder(inputString);
            reversedString.reverse();

            if (inputString.equals(reversedString.toString())) {
                System.out.println("The input string is a palindrome.");
            } else {
                System.out.println("The input string is not a palindrome.");
            }
        }

}
