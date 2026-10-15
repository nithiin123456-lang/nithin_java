import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p, r, t, si;
        System.out.print("Enter principal amount: ");
        p = sc.nextDouble();
        System.out.print("Enter rate of interest: ");
        r = sc.nextDouble();
        System.out.print("Enter time in years: ");
        t = sc.nextDouble();
        si = (p * r * t) / 100;
        System.out.println("Simple Interest = " + si);
        sc.close();
    }
}
