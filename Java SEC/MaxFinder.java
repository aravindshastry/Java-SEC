public class MaxFinder {

    public int findMax(int a, int b) {
        return (a > b) ? a : b;
    }

    public int findMax(int a, int b, int c) {
        return findMax(findMax(a, b), c);
    }

    public static void main(String[] args) {
        MaxFinder obj = new MaxFinder();
        System.out.println(obj.findMax(25, 40));
        System.out.println(obj.findMax(15, 85, 42));
    }
}