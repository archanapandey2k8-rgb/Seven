import java.util.Scanner;

class Ternary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to no. checker");
        System.out.println("Please enter first number : ");
        int first = input.nextInt();
        System.out.println("now, enter second number : ");
        int second = input.nextInt();
//        if (first > second){
//            System.out.println("First is greatest");
//        }else {
//            System.out.println("Second is greater");
//        } type 1
//        int greaterNumber;
//        if (first > second) {
//            greaterNumber = first;
//        }else{
//            greaterNumber = second;
//        }
//        System.out.println("The greater no. is " + greaterNumber);
//    }  this is second type. now lets see ternary operator
        int greaterNumber = first > second ? first : second; // expression then ? then true wala
        System.out.println(greaterNumber  + " The greater number is ");
    }
}
