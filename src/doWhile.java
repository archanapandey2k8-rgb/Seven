import java.util.Scanner;
class doWhile {
    public static void main(String[] args) {
        System.out.println("Welcome to Age checker");
        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter your age");
//        int age = input.nextInt();
//        while (age < 0 || age > 100){
//            System.out.println("Please enter your age");   ye humne upar bhi kiya tha aur yhn bhi
//             age = input.nextInt();
//        }
//        System.out.println("your age is  " + age);
        int age;
        do {
            System.out.println("Please enter your age");
               age = input.nextInt();// do mei ek baar chalega hi chalega in case agar glt aaya
        }while(age < 0 || age > 100);  // toh while confition check hogi
            System.out.println("your age is  " + age);
    }
}
