import java.util.Scanner;
public class Exercise21D {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        while (!abc.hasNextInt()) {                 // force correct user input
            System.out.println("Enter an int");
        }
        int A = abc.nextInt();
        System.out.println(factorial(A));
    }
    public static int factorial(int n) {
        if (n == 0) {               // 0 factorial is 1
            return 1;
        } else if (n < 0) {
            return -1;             // negative factorial is negative 1
        } else {
            for (int i = n-1; i > 0; i--) {
                n = n*i;            // calculate factorial
            }
            return n;
        }
    }
}
