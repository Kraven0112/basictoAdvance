public class StrBuilder {

    public static void main(String[] args) {
        StringBuilder string = new StringBuilder();
        System.out.println("Capacity : " + string.capacity());

        // append() used to add charSequence end of existed string
        string.append("I love Nepal");
        System.out.println("After appending some value : " + string);

    }
}