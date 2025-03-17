public class Conversion {
    public static void main(String args[]){
        // Implicit conversion in java means automatically converting one data type to another data type. It is also called widening process.Given below are the implicit conversion of data: 
        // byte -> short -> int -> float -> long -> double
        int num = 200_0000;
        float f = num;

        System.out.println(f); //output will be 200000.0 which is float data type.

        // Explicit conversion in java means type casting. It is also called to narrowing process. Given below are the explicit conversion of data:

        // double -> long -> float -> int -> short -> byte

        double d = 4000_0000.00;
        long l = (long) d;

        int a = 257;
        byte b = (byte) a;
        System.out.println(b);
        System.out.println(l);
    }
}