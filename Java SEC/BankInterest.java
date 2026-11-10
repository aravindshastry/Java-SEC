abstract class Bank {

    abstract void getInterestRate();

    void displayMessage() {
        System.out.println("Welcome to the Bank");
    }
}

class SBI extends Bank {

    void getInterestRate() {
        System.out.println("SBI Interest Rate: 6.5%");
    }
}

class HDFC extends Bank {

    void getInterestRate() {
        System.out.println("HDFC Interest Rate: 7%");
    }
}

public class BankInterest {
    public static void main(String[] args) {

        SBI s = new SBI();
        HDFC h = new HDFC();

        s.displayMessage();
        s.getInterestRate();

        h.displayMessage();
        h.getInterestRate();
    }
}