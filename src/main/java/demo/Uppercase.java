package demo;
import java.util.Scanner;
public class Uppercase {



        public static String toUpperCase(String input) {
            return input.toUpperCase();
        }


        public static String reverseString(String input) {
            StringBuilder reversed = new StringBuilder(input);
            return reversed.reverse().toString();
        }


        public static int countVowels(String input) {
            int count = 0;
            String vowels = "aeiouAEIOU";
            for (char ch : input.toCharArray()) {
                if (vowels.indexOf(ch) != -1) {
                    count++;
                }
            }
            return count;
        }


        public static boolean isPalindrome(String input) {
            String reversed = reverseString(input);
            return input.equalsIgnoreCase(reversed);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.print("enter a string: ");
            String input = scanner.nextLine();


            String upperCaseString = toUpperCase(input);
            String reversedString = reverseString(input);
            int vowelCount = countVowels(input);
            boolean isPalindrome = isPalindrome(input);


            System.out.println("Uppercase: " + upperCaseString);
            System.out.println("Reversed: " + reversedString);
            System.out.println("Number of vowels: " + vowelCount);
            System.out.println("Is palindrome: " + isPalindrome);
        }
}
