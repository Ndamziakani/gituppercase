package demo;
import java.util.Scanner;
public class work1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first number");
        double num1 = scanner.nextDouble();

        System.out.println("enter your second number");
        double num2 =scanner.nextDouble();



        System.out.println("Addition:"+(num1 + num2));
        System.out.println("Subtraction:"+(num1 - num2));
        System.out.println("Multiplication:"+(num1 * num2));
        System.out.println("Division:"+(num1 / num2));

        scanner.close();

    }
}
