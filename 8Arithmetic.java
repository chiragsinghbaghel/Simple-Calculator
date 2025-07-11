
import java.util.Scanner;

class Arithmetic {
    public static void main(String[] args){
        System.out.println("Welcome to Basic calculator\n\n");
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter  first number :");
        int first=input.nextInt();
        System.out.print("Now.enter second number :");
        int second=input.nextInt();
        System.out.println(" Arithmetic operation of Result is");

        int Add=first+second;
        int sub=first-second;
        int mul=first*second;
        int div=first/second;
        int mod=first%second;

        System.out.println("Addition is :"+Add);
        System.out.println("Subtraction is :"+sub);
        System.out.println("Multiplication is :"+mul);
        System.out.println("Division is :"+div);
        System.out.println("Modulus is :"+mod);


    }

}
