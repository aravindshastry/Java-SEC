import java.util.Scanner;

class BankAccount {
    int accNo;
    String holderName;
    double balance;

    BankAccount(int accNo, String holderName, double balance) {
        this.accNo = accNo;
        this.holderName = holderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Remaining Balance: " + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    void displayDetails() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Account Holder: " + holderName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount(101, "Alex", 5000.0);
        acc.displayDetails();
        acc.deposit(1500.0);
        acc.withdraw(2000.0);
        acc.withdraw(6000.0);
    }
}