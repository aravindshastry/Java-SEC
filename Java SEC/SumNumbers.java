// Print sum of all numbers between 1 to 100. 

public class SumNumbers {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }

        System.out.println(sum);
    }
}