public class StudentAverage {

    public double calculateAverage(double subject1, double subject2) {
        return (subject1 + subject2) / 2.0;
    }

    public double calculateAverage(double subject1, double subject2, double subject3) {
        return (subject1 + subject2 + subject3) / 3.0;
    }

    public static void main(String[] args) {
        StudentAverage avg = new StudentAverage();
        System.out.println(avg.calculateAverage(85.5, 90.0));
        System.out.println(avg.calculateAverage(78.0, 88.5, 92.0));
    }
}