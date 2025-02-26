// To perform logical operations we use logical operators.
// && (AND), || (OR), ! (NOT)

public class LogicalOper {

    public static void main(String args[]){
        int a =20;
        int b = 30;

        int x = 200;
        int y = 300;

        // boolean result = a<b && x<y; //output is true
        // boolean result = a>b && x<y; //output is false

        // boolean result = a>b || x<y; //output is true
        // boolean result = a<b || x<y; //output is true
        boolean result = a>b || x>y; //output is false

        System.out.println(result);
    }
}