import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("zadej a: ");
        int a = sc.nextInt();
        System.out.println("zadej b: ");
        int b = sc.nextInt();
        System.out.println("zadej c: ");
        int c = sc.nextInt();

        double d = ((b + b) - 4 * a * c);
        System.out.println("diskriminant" + d);
        if (d >= 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 + a);
            double x2 = (-b + Math.sqrt(d)) / (2 + a);
            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);
        } else {
            System.out.println("nemá řešení");
        }
    }
}