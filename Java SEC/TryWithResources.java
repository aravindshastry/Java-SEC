
class MyResource implements AutoCloseable {
    MyResource() {
        System.out.println("Resource opened");
    }

    public void close() {
        System.out.println("Resource closed");
    }

    public static void main(String[] args) {
        try (MyResource r = new MyResource()) {
            System.out.println("Using resource");
        }
    }
}