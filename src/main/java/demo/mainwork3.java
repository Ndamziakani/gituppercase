package demo;

import java.util.Scanner;

public class mainwork3 {

    public class Calculator {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            System.out.print("Choose operation (+, -, *, /): ");
            char operator = sc.next().charAt(0);

            double result = 0;

            switch (operator) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/': result = num2 != 0 ? num1 / num2 : Double.NaN; break;
                default: System.out.println("Invalid operator"); return;
            }

            System.out.println("Result: " + result);
}
    }
}
