public class StrBuffer {
    public static void main(String[] args) {
        StringBuffer string = new StringBuffer();

        // capacity of StringBuffer variable
        int capacity = string.capacity();
        System.out.println("Capacity before any value : " + capacity);

        // append some value in StringBuffer variable
        string.append("Sushil Chaudhary");
        System.out.println("After appending some value : " + string);

        // insert(startIndex,charSequence)
        // It is used to add string after specific index
        string.insert(16, " I love Nepal");
        System.out.println("After insering : " + string);

        // length() - it is used to get length
        int length = string.length();
        System.out.println("Length of string : " + length);

        // delete(startIndex,endIndex) - use to delete charSequence from specific index
        // last specific index
        string.delete(0, 6);
        System.out.println("After deletion of charSequence : " + string);

        // replace(startIndex,endIndex, replacement charSequence)
        string.replace(0, 11, "Kraven ");
        System.out.println("After replacing : " + string);

        // reverse() -> used to reverse charSequence
        string.reverse();
        System.out.println("After reversing : " + string);

        // substring(startIndex,endIndex) - used to extract substring from string
        String substring = string.substring(0, 10);
        System.out.println("After extracting : " + substring);
    }
}