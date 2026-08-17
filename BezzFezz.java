//  when the multipal of 3 comes then print "Bezz" and if the multipal of 5 comes then print "Fezz" and if both comes at a same time then print "FezzBuzz"


public class BezzFezz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FezzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Bezz");
            } else if (i % 5 == 0) {
                System.out.println("Fezz");
            } else {
                System.out.println(i);
            }
        }
    }
}