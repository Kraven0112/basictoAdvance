// The operators used for comparation are known as relational operators.
// == < > <= >= 

public class RelationalOper {

    public static void main(String args[]){
        // == operator
        int a1 = 14;
        int b1 = 14;
        System.out.println(a1 == b1);

        int a2 = 23;
        int b2 = 24;
        System.out.println(a2 == b2);

        int a3 = 100;
        int b3 = 300;
        System.out.println(a3 != b3);

        // < > >= <= operator
        int m1 = 100;
        int n1 = 200;

        System.out.println(m1>n1);
        System.out.println(m1<n1);
        System.out.println(m1>=n1);
        System.out.println(m1<=n1);


        String name1 = "Sushil";
        String name2 = "Sushil";

        System.out.println(name1 == name2);
        // System.out.println(name1.equals(name2));
    }
}