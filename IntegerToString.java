public class IntegerToString {
    public String retuString(int num) {
        return Integer.toString(num);
    }

    public static void main(String[] args) {
        int num = 034;

        IntegerToString obj = new IntegerToString();

        String result = obj.retuString(num);

        System.out.println("String form : " + result);
    }
}