import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Triangle calculator\n");
        System.out.print("Please enter your base in cms :");
        double base=input.nextDouble();
        System.out.print("Now enter your perpendicular height in cms :");
        double height=input.nextDouble();

        double Area=(base*height)/2;
        System.out.println("The area of your triangle is :"+Area+"cms");


    }
}
