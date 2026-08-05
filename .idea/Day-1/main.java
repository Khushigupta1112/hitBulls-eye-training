import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        //int a = 532;
        double  x = 532;
        double ans = x/10;
        //System.out.println("ans is  : " + ans );
        int a = 6;
        int b = 4;
        int add = a+b;
        int sub = a-b;
        int mul = a*b;
        int modulo = a%b;
        // System.out.println("add is: " + add);
        // System.out.println("sub is: " + sub);
        // System.out.println("mul is: " + mul);
        // System.out.println("modulo is: " + modulo);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double num1 = sc.nextInt();

        System.out.println("Enter the second number: ");
        double num2 = sc.nextInt();

        System.out.println("Enter the operation you want to perform(+,-,/,*): ");
        char operator = sc.next().charAt(0);

        if(operator == '+'){
            System.out.println("The result is: " + (num1 + num2));
        } else if(operator == '-'){
            System.out.println("The result is: " + (num1 - num2));
        } else if(operator == '*'){
            System.out.println("The result is: " + (num1 * num2));
        } else if(operator == '/'){
            if(num2 == 0) {
                System.out.println("Error: Division by zero is not allowed.");
            } else {
            System.out.println("The result is: " + (num1 / num2));
        }
    }else {
            System.out.println("Invalid operator!");
            sc.close();

    }
}
}

