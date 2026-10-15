import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, square;
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        square = num * num;
        System.out.println("Square = " + square);
        sc.close();
    }
}
