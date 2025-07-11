import java.util.Scanner;

class FloatMultiplication {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("We are float Multiplication\n");
        System.out.print("please enter first decimal :");
        double first=input.nextDouble();
        System.out.print("Now,please enter second decimal :");
        double second=input.nextDouble();

        double mul=first*second;
        System.out.println("\n Result is :"+mul);




    }
}
