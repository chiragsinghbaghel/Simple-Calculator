import java.util.Scanner;

class Swap {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to swapping station\n\n");
        System.out.print("Please enter first number A");
        int a=input.nextInt();
        System.out.print("Now,enter Second number B");
        int b=input.nextInt();
        int c=a;
        a=b;
        b=c;
       // System.out.println(c);
        System.out.println(a);
        System.out.println(b);

    }
}