public class BillGenerator {

    public double generateBill(int quantity, int price) {
        return quantity * price;
    }

    public double generateBill(int quantity, double price) {
        return quantity * price;
    }

    public static void main(String[] args) {
        BillGenerator bill = new BillGenerator();
        System.out.println(bill.generateBill(5, 50));
        System.out.println(bill.generateBill(4, 99.75));
    }
}