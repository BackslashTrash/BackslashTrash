import java.util.Scanner;
public class U1R5 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter the first side:");
        if (!abc.hasNextInt()) {
            System.out.println("Exiting program");
            abc.nextLine();
            System.exit(0);
        }
        int lineA = abc.nextInt();                         // First side
        System.out.println("Enter the second side:");
        if (!abc.hasNextInt()) {
            System.out.println("Exiting program");
            abc.nextLine();
            System.exit(0);
        }
        int lineB = abc.nextInt();                        // Second side
        System.out.println("Enter the third side:");
        if (!abc.hasNextInt()) {
            System.out.println("Exiting program");
            abc.nextLine();
            System.exit(0);
        }
        int lineC = abc.nextInt();                       // Third side
        if (lineA + lineB <= lineC || lineA + lineC <= lineB || lineC + lineB <= lineA) {
            System.out.println("That's impossible, exiting program");      // Check for impossible situations
            abc.nextLine();
            System.exit(0);
        } else if (lineA == lineC && lineA == lineB) {               // Equilateral if all 3 sides are the same
            System.out.println("Equilateral");
        } else if (lineA == lineC || lineA == lineB || lineC == lineB) {
            System.out.println("Isosceles");                            // Isosceles if 2 sides are the same
        } else {
            System.out.println("Scalene");                              // Scalene if not Isosceles or Equilateral
        }
    }
}
