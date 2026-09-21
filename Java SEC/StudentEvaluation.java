import java.util.Scanner;

public class StudentEvaluation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final int MIN_MARKS_REQUIRED = 40;
        final int MIN_ATTENDANCE_REQUIRED = 75;

        System.out.print("Enter the student's total marks (0-100): ");
        int marks = scanner.nextInt();
        
        System.out.print("Enter the student's attendance percentage (0-100): ");
        int attendance = scanner.nextInt();

        boolean hasPassed = (marks >= MIN_MARKS_REQUIRED) && (attendance >= MIN_ATTENDANCE_REQUIRED);

        if (hasPassed) {
            System.out.println("Verdict: The student has PASSED.");
        } else {
            System.out.println("Verdict: The student has FAILED.");
            
            if (marks < MIN_MARKS_REQUIRED) {
                System.out.println("- Reason: Insufficient marks.");
            }
            if (attendance < MIN_ATTENDANCE_REQUIRED) {
                System.out.println("- Reason: Insufficient attendance.");
            }
        }
        
        scanner.close();
    }
}