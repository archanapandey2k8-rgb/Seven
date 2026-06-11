import java.util.Scanner;

class ModifiedSwitch {
    public static void main(String[] args) {
        System.out.println("Welcome to Advance Switch");
        System.out.println("Pleasee enter the day in number : ");
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
        newSwitch(day);
    }

    public static void newSwitch(int day) {
        String dayStr = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid";
        };
        System.out.println(dayStr);
    }
}

