import java.util.Scanner;

public class NumberRangeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the lower bound: ");
        int lowerBound = scanner.nextInt();
        
        System.out.print("Enter the upper bound: ");
        int upperBound = scanner.nextInt();
        
        System.out.print("Enter the number to check: ");
        int number = scanner.nextInt();
        
        boolean isBetween = (number >= lowerBound) && (number <= upperBound);
        
        if (isBetween) {
            System.out.println(number + " lies between " + lowerBound + " and " + upperBound + ".");
        } else {
            System.out.println(number + " does not lie between " + lowerBound + " and " + upperBound + ".");
        }
        
        scanner.close();
    }
}