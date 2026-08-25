// String methods

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        System.out.println("Length = " + text.length());
        System.out.println("First character = " + text.charAt(0));
        System.out.println("Uppercase = " + text.toUpperCase());
        System.out.println("Lowercase = " + text.toLowerCase());
        System.out.println("Index of 'a' = " + text.indexOf('a'));
        System.out.println("Contains 'Java' = " + text.contains("Java"));
        System.out.println("Starts with 'Hello' = " + text.startsWith("Hello"));
        System.out.println("Ends with 'Java' = " + text.endsWith("Java"));

        sc.close();
    }
}