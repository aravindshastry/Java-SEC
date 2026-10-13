public class LoginSystem {

    public void login(String username) {
        System.out.println("Logged in with username: " + username);
    }

    public void login(String username, String password) {
        System.out.println("Logged in with username: " + username + " and password.");
    }

    public void login(String username, String password, int otp) {
        System.out.println("Logged in with username: " + username + ", password, and OTP: " + otp);
    }

    public static void main(String[] args) {
        LoginSystem auth = new LoginSystem();
        auth.login("john_doe");
        auth.login("john_doe", "Secret@123");
        auth.login("john_doe", "Secret@123", 458921);
    }
}
