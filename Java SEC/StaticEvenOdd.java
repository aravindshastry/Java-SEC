public class StaticEvenOdd {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void checkEvenOdd(int number) {
        if (isEven(number)) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }

    public static void main(String[] args) {
        int num1 = 14;
        int num2 = 27;

        checkEvenOdd(num1);
        checkEvenOdd(num2);
    }
}