class StaticBlockDemo {
    static int value;

    static {
        value = 100;
        System.out.println("Static block executed");
    }

    public static void main(String[] args) {
        System.out.println(value);
    }
}