public class CharStringConvertion {
    public static void main(String[] args) {
        char char1 = 'S';
        // Way of converting char into string
        String str1 = "" + char1;
        String str2 = String.valueOf(char1);
        String str3 = Character.toString(char1);

        System.out.println(str1 + " " + str2 + " " + str3);

        // Way of conerting String to char
        String str4 = "Sushil Chaudhary";
        char[] allchar = str4.toCharArray();

        for (char character : allchar) {
            System.out.print(character + " ");
        }
    }
}