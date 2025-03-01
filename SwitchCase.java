import java.util.Scanner;

public class SwitchCase {

    public static void main(String args[]) {
        System.out.println("Enter day : ");
        Scanner mc = new Scanner(System.in);
        String day = mc.nextLine();

        String result = "";

        // new feature in java . This is the new way to use switch-case in java.
        result = switch (day) {
            case "Sunday", "sunday", "Saturday", "saturday" -> "8-AM";
            case "Monday", "monday" -> "7-AM";
            default -> "6-AM";
        };

        System.out.println(result);

        // using yield in switch-case statement
        result = switch (day) {
            case "Sunday", "sunday", "Saturday", "saturday":
                yield "8-AM";
            case "Monday", "monday":
                yield "7-AM";
            default:
                yield "6-AM";
        };

        System.out.println(result);

        // Traditional way to use switch-case in java
        switch (day) {
            case "sunday", "Sunday", "Saturday", "saturday":
                result = "8-AM";
                break;

            case "monday", "Monday":
                result = "7-AM";
                break;

            default:
                result = "6-AM";
                break;
        }

        System.out.println(result);
        mc.close();
    }
}