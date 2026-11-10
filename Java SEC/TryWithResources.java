class MyResource implements AutoCloseable {

    MyResource() {
        System.out.println("Resource opened");
    }

    public void close() {
        System.out.println("Resource closed");
    }

    void useResource() {
        System.out.println("Using resource");
    }

    public static void main(String[] args) {

        try (MyResource r = new MyResource()) {
            r.useResource();
        }
    }
}