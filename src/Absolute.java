import java.util.Scanner;

class Absolute {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Absolute calculator");
        System.out.println("Please enter number : ");
        int num = input.nextInt();
        int number = num >= 0 ? num : -num;
        System.out.println("Absolute value is : " + number);
    }
}
