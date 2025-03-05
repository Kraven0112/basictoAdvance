enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

public class Enum {
    public static void main(String args[]) {
        Day today = Day.SUNDAY;

        String result = "";

        result = switch (today) {
            case SUNDAY, SATURDAY:
                yield "week off";
            default:
                yield "working days";
        };
        System.out.println(result);
    }
}