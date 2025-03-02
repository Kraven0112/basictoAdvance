public class StaticKey {

    static int addition(int a, int b) {
        return a + b;
    }

    static double mult(double a, double b) {
        return a * b;
    }

    public static void main(String args[]) {
        // Below here StaticKey is class and addition is a staic method
        // Accessing static method using instance of class in not recommended because
        // static itself belongs to class rather than instance of class.

        int result = StaticKey.addition(122, 122);
        double output = StaticKey.mult(result, result);
        System.out.println(result);
        System.out.println(output);
    }
}