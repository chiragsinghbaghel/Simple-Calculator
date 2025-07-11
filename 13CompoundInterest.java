import java.util.Scanner;

class CompoundInterest {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Compound Interest calculator\n");
        System.out.print("Please enter your principle amount Rs:");
        int principle=input.nextInt();
        System.out.print("Now,tell me your rate of interest :");
        float rate=input.nextFloat();
        System.out.print("Now.Tell me for how many  years are you borrowing this money :");
        float year=input.nextFloat();

        double compInt=principle*Math.pow((1+rate/100),year);
        System.out.println("your compound Interest is Rs:"+compInt);

    }
}
