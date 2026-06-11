import java.util.Scanner;

class Minimum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number : ");
        int num1 = input.nextInt();
        System.out.println("Now , Enter Second Number : ");
        int num2 = input.nextInt();
        int minimumNumber = num1 < num2 ? num1 : num2;
        System.out.println(minimumNumber + " is the minimum");
    }
}
