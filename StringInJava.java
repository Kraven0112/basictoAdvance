public class StringInJava {

    public static void main(String[] args) {
        String str1 = "Hello World";

        // using charAt(int index) method in string
        // It is used to get character in specific index from string
        char myChar = str1.charAt(9);
        System.out.println("Character at index 9 : " + myChar);

        // using codePoint(int index)
        // It is used to get unicode of that character in specific index
        int unicode = str1.codePointAt(9);
        System.out.println("Unicode : " + unicode);

        // using concat(String str)
        // It is used to append string at the end of another string
        String afterConcate = str1.concat(", I love my world.");
        System.out.println("After concat another string : " + afterConcate);

        // using contains(charSequence)
        // It is used to check charSequence is exist there or not
        boolean isExisted = str1.contains("World");
        System.out.println("isExisted : " + isExisted);

        // using endsWith(String suffix)
        // It is used to check if string is ended with charSequence
        boolean isEnded = str1.endsWith("World");
        System.out.println("isEnded : " + isEnded);

        // using equals(Object anObject)
        // It is used to compare two object
        String str2 = "Hello Universe";
        boolean isEqual = str1.equals(str2);
        System.out.println("str2 == str1 : " + isEqual);

        // using indexOf(String str)
        // It is used to find the index of first occurence of subString
        int index = str1.indexOf("Hello");
        System.out.println("Index of first occurance of subString : " + index);

        // using isEmpty()
        // It is used to check whether string is empty or not.
        boolean isEmpty = str1.isEmpty();
        boolean isBlank = str1.isBlank();
        System.out.println("str1 is empty : " + isEmpty);
        System.out.println("str1 is blank : " + isBlank);

        // using length()
        // It is used to get the length of the String
        int length = str1.length();
        System.out.println("Length of str1 : " + length);

        // using replace(charSequence target, charSequence replacement)
        // It is used to replace the targeted subString with another string
        String afterReplacement = str1.replace("World", "Universe");
        System.out.println("str1 after replacement : " + afterReplacement);

        // using replaceAll(String regex, String replacement)
        // It is used to replace all String with another
        String afterAllReplacement = str1.replaceAll("Hello World", "I am a Java Developer");
        System.out.println("str1 after all replacement : " + afterAllReplacement);

        // using splits(String regex)
        // It is used to splits string into arrays of substring
        String[] str1Array = str1.split(",");
        for (String n : str1Array) {
            System.out.println(n);
        }

        // using startsWith(String str)
        // It is used to check if the string is start with specific charSequence
        boolean isStartWith = str1.startsWith("Hello");
        System.err.println("str1 start with Hello : " + isStartWith);

        // using substring(int beginIndex) or substring(int beginIndex,int endIndex)
        // It is used to get subString from the specific index
        String from5 = str1.substring(5);
        String from5To11 = str1.substring(5, 11);
        System.out.println("From index 5 : " + from5);
        System.out.println("From index 5 to 11 : " + from5To11);

        // using toUpperCase(String str)
        // It is used to get uppercase string
        String upperCase = str1.toUpperCase();
        System.out.println("Uppercase : " + upperCase);

        // using toLowerCase(String str)
        // It is used to get lowercase string
        String lowercase = str1.toLowerCase();
        System.out.println("Lowercase : " + lowercase);

        // using trim()
        // It is used to remove whitespaces from the string
        String str3 = "   trim() method is used remove the leading and trailing white spaces from the string ";
        System.out.println("Before trim length :" + str3.length());

        str3 = str3.trim();
        System.out.println("After trim str3 :" + str3);

        System.out.println("After trim length :" + str3.length());
    }
}