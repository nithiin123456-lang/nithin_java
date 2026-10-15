import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int empid;
        double salary;
        System.out.print("Enter employee name: ");
        name = sc.nextLine();
        System.out.print("Enter employee ID: ");
        empid = sc.nextInt();
        System.out.print("Enter employee salary: ");
        salary = sc.nextDouble();
        System.out.println("\nEmployee Details");
        System.out.println("Name: " + name);
        System.out.println("EmpID: " + empid);
        System.out.println("Salary: " + salary);
        sc.close();
    }
}
