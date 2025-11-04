import java.util.Scanner;

public class Task5 {
public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = s.nextInt();
        System.out.print("Enter second number: ");
        int b = s.nextInt();
        System.out.print("Enter third number: ");
        int c = s.nextInt();

        if (a == b && b == c)
            System.out.println("All numbers are equal.");
        else if (a >= b && a >= c)
            System.out.println("Largest number: " + a);
        else if (b >= a && b >= c)
            System.out.println("Largest number: " + b);
        else
            System.out.println("Largest number: " + c);

        s.close();
    }

}
