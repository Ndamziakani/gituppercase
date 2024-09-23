package demo;

import java.util.Scanner;
public class work2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();

        String fullName = firstName + " " + surname;
        System.out.println("my full name is " + fullName);

        scanner.close();
    }
}
