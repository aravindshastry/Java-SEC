// take a string from user then count nu of uppercase,lowercase, digits and nu of spaces in java 


import java.util.Scanner;

class CheckString {
          public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int uppercase = 0, lowercase = 0, digits = 0, spaces = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch))
                uppercase++;
            else if (Character.isLowerCase(ch))
                lowercase++;
            else if (Character.isDigit(ch))
                digits++;
            else if (ch == ' ')
                spaces++;
        }

        System.out.println("Uppercase letters: " + uppercase);
        System.out.println("Lowercase letters: " + lowercase);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
    }
}