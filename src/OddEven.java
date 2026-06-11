import java.util.Scanner;

class OddEven {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to odd even calculator");
         System.out.println("Please enter number : ");
         int num = input.nextInt();
//         int num2 = input.nextInt();
         String aboutNumber = num % 2 == 0 ? "Even" : "Odd" ;
         System.out.println("The given number is : " + aboutNumber);

     }
}
