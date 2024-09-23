package demo;

public class Static {
    public static void printFullNameStatic(String firstName, String lastName) {
        System.out.println("Full Name: " + firstName + " " + lastName);
    }

    public static void main(String[] args) {

        String firstName = "NDAMZI";
        String lastName = "AKANI";

        printFullNameStatic(firstName, lastName);
}
}
