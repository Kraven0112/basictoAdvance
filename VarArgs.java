public class VarArgs {
    // VarArgs (ellipsis) helps to accept multiple argument
    public double addition(double... numbers) {
        double result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }
        return result;
    }

    public String concatenate(String... words) {
        String fullName = "";
        for (String word : words) {
            fullName += word;
        }
        return fullName;
    }

    public static void main(String[] args) {
        VarArgs arg = new VarArgs();

        double totalSum = arg.addition(1, 2, 3, 4, 5, 6.6, 7.9, 8, 9.9, 10);

        System.out.println("Total sum is : " + totalSum);

        String fullName = arg.concatenate("S", "us", "h", "il");

        System.out.println(fullName);
    }
}