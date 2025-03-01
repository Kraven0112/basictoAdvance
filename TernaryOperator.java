import java.util.Scanner;

public class TernaryOperator {

    public static void main(String args[]) {
        Scanner mc = new Scanner(System.in);

        System.out.println("Enter any number : ");
        int num = mc.nextInt();

        String result = num % 2 == 0 ? "Even Number" : "Odd Number";

        System.out.println(result);

        mc.close();
    }
}