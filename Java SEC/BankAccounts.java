class BankAccounts {
    String holder;
    double balance;

    BankAccounts(String h, double b) {
        holder = h;
        balance = b;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    void display() {
        System.out.println(holder);
        System.out.println(balance);
    }

    public static void main(String[] args) {
        BankAccounts b = new BankAccounts("Aravind", 5000);

        b.deposit(2000);
        b.withdraw(1000);
        b.display();
    }
}