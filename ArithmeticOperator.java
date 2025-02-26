// There are some most important arithmetic operators in programming
// addition (+), substraction (-), multiply (*), division (/), modular (%)
// like we use increment (++) and decrement (--) operator 

public class ArithmeticOperator {
    public static void main(String args[]){
        // Addition (+)
        int a = 122;
        int b = 122;
        System.out.println("Sum :"+(a+b));

        // Substraction (-)
        int m = 50;
        int n = 20;
        System.out.println("Difference :"+(m-n));

        // Multiplication (*)
        int x = 500;
        int y = 500;
        System.out.println("Multiplication :"+(x*y));

        // Division (/) for quotient
        int num1 = 10000;
        int num2 = 20;
        System.out.println("Division :"+(num1/num2));

        // Modular (%) for remainder
        int number1 = 7;
        int number2 = 2;
        System.out.println("Remainder using modular operator :"+(number1 % number2));

        // Increment (++)
        int num = 200;

        System.out.println("Before post-increment num : "+num);
        // post-increment
        num++;
        System.out.println("After Post-increment num :"+num);

        System.out.println("Before pre-increment num : " + num);
        // pre-increment
        ++num;
        System.out.println("After Pre-increment num :"+num);


        // Decrement (--)
        int p = 100;

        System.out.println("Before post decrement num : "+p);
        // post decrement
        p--;
        System.out.println("After post decrement num : "+p);

        System.out.println("Before pre-decrement num : "+p);
        // pre-decrement
        --p;
        System.out.println("After pre-decrement : "+p);


    } 
}