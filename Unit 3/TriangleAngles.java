import java.util.Scanner;
import java.util.InputMismatchException;
public class TriangleAngles {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        boolean repeat = true;
        System.out.println("Enter 3 numbers:");
        int a = 0;
        int b = 0;
        int c = 0;
        do {
            try{
                a = abc.nextInt();
                b = abc.nextInt();
                c = abc.nextInt();
                while (a < 0 || b < 0 || c < 0) {
                    abc.nextLine();
                    System.out.println("enter a positive number");
                    a = abc.nextInt();
                    b = abc.nextInt();
                    c = abc.nextInt();
                }
                repeat = false;
            } catch (InputMismatchException e) {
                abc.nextLine();
                System.err.println("try again");
                System.out.println("Enter 3 numbers:");
            }
        } while (repeat);
        if (a + b + c == 180) {
            if (a == b && b == c) {
                System.out.println("Equilateral");
            } else if ((a == b && b != c) || (a == c && a != b) || (b == c && b != a)) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        } else {
            System.out.println("Error");
        }
    }
}
