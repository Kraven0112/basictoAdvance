import java.util.Scanner;

public class Fibonacci {

    public static void main(String args[]){
        Scanner mc = new Scanner(System.in);
        System.out.println("Enter range of fibonacci number: ");
        int num = mc.nextInt();

        int a = 0;
        int b= 1; 
        int c;

        for(int i=0; i<=num; i++){
            System.out.print(a + " ");
            c=a+b;
            a=b;
            b=c;
        }

        mc.close();
    }
}