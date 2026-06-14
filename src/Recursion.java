import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to see the example of Recursion");
        int number = input.nextInt();
//        long fact = factorial(number);
        long recursion = fact(number);
        System.out.println("The Factorial of the number is " + recursion );
    }
//    public static long factorial(int num ){
//       long result = 1;
//       for (int i = 1; i <= num ; i++){
//           result = result * i;
//       }
//       return result;
//    }
    public static long fact(int num ){
        if (num == 1){ // agar aapka num ==1 toh uska answer 1 hoga
            return 1;
        }
        return num * fact(num -1); // fact of 5 is 5*4! fact fact ko hi call kar rha
    }
}
