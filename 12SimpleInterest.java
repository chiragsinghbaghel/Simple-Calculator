import java.util.Scanner;

class SimpleInterest {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to simple Interest calculator\n");
        System.out.print("Please enter your principle amount Rs :");
        int principle=input.nextInt();
        System.out.print("Now,Tell me your rate of interest :");
        float rate=input.nextFloat();
        System.out.print("Now,Tell me for how many years are you borrowing this money :");
        float year=input.nextFloat();

        float interest=(principle *rate* year)/100;
        System.out.println("\n\n Your simple interest is Rs :"+interest);
    }
}
