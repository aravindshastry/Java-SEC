import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char chr = text.charAt(i);

            if (chr == 'a' || chr == 'e' || chr == 'i' ||
                chr == 'o' || chr == 'u' ||
                chr == 'A' || chr == 'E' || chr == 'I' ||
                chr == 'O' || chr == 'U') {

                count++;
            }
        }

        System.out.println("Number of vowels = " + count);

        sc.close();
    }
}