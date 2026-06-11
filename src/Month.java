import java.util.Scanner;

class Month {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to month mapping");
        System.out.println("enter number of month : ");
        int monthNum = input.nextInt();
        String monthName = getMonthName(monthNum);
        System.out.println("Your month name is : " + monthName);
    }

    public static String getMonthName(int monthNumber){
        return switch (monthNumber){
            case 1 -> "jan";
            case 2 -> "feb";
            case 3 -> "march";
            case 4 -> "april";
            case 5 -> "may";
            case 6 -> "june";
            case 7 -> "july";
            case 8 -> "aug";
            case 9 -> "sep";
            case 10 -> "oct";
            case 11-> "nov";
            case 12-> "dec";
            default -> "Invalid";
        };

    }
}
