import java.util.Scanner;

public class Condition {

    public static void main(String args[]) {
        Scanner mc = new Scanner(System.in);

        System.out.println("Enter a : ");
        int a = mc.nextInt();

        System.out.println("Enter b : ");
        int b = mc.nextInt();

        System.out.println("Enter c : ");
        int c = mc.nextInt();

        if (a > b && a > c)
            System.out.println("a is a largest number.");
        else if (b > c)
            System.out.println("b is a largest number.");
        else
            System.out.println("c is larget number.");

        mc.close();
    }
}