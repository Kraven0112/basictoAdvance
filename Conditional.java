import java.util.Scanner;

public class Conditional {

    public static void main(String[] args) {
        Scanner mc = new Scanner(System.in);
        int a = 109;

        if (a > 10) {
            System.out.println("Enter a : ");
            int x = mc.nextInt();

            System.out.println("Enter y : ");
            int y = mc.nextInt();

            System.out.println("Total Sum : " + (x + y));
        } else {
            System.out.println("default");
        }

        mc.close();
    }
}