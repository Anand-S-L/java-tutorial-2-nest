import java.util.Scanner;

public class switchcal {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("1 add 2 numbers");
        System.out.println("2 substract 2 numbers");
        System.out.println("3 multiply 2 numbers");
        System.out.println("4 Exit");
        System.out.println("Enter the option?");
        int option=s.nextInt();

        switch (option){
            case 1 :
                System.out.println("Enter first number");
                int a=s.nextInt();
                System.out.println("Enter second number");
                int b=s.nextInt();
                System.out.println("The sum is "+(a+b));
                break;
            case 2 :
                System.out.println("Enter first number");
                int a1=s.nextInt();
                System.out.println("Enter second number");
                int b1=s.nextInt();
                System.out.println("The sub is "+(a1-b1));
                break;
            case 3 :
                System.out.println("Enter first number");
                int a2=s.nextInt();
                System.out.println("Enter second number");
                int b2=s.nextInt();
                System.out.println("The multiplication is "+(a2*b2));
                break;
            case 4 :
                System.out.println("Exit");
                break;
        }

    }
}
