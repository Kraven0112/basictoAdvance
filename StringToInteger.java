public class StringToInteger {

    public boolean isInteger(String str) {
        int num = Integer.parseInt(str) + Integer.parseInt(str);
        System.out.println(num);
        return true;
    }

    public static void main(String[] args) {
        String str = "10111";

        StringToInteger obj = new StringToInteger();

        boolean result = obj.isInteger(str);

        if (result)
            System.out.println("Integer");
        else
            System.out.println("String");
    }
}