import java.util.Scanner;
public class U1R6 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        boolean solution = false;
        while (!solution) {
            System.out.println("Enter a number to add to.");
            while (!abc.hasNextInt()) {
                System.out.println("Enter an integer");                 // force user input
                abc.nextLine();
            }
            int add = abc.nextInt();
            System.out.println("Enter a number to multiply to.");
            while (!abc.hasNextInt()) {
                System.out.println("Enter an integer");             // force user input
                abc.nextLine();
            }
            int multiply = abc.nextInt();

            for (int i = 0; i<add; i++) {                               // checking every number
                for (int m = 0; m<multiply; m++) {
                    if (i + m == add && i * m == multiply) {        //checking addition and multiplication
                            System.out.println(i + " " + m);
                            solution = true;
                    }
                }
            }
            if (!solution) {
                System.out.println("No solution");
                abc.nextLine();
            }
        }
    }
}