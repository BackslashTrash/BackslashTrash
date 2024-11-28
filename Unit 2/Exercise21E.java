import java.util.Scanner;
public class Exercise21E {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        while (!abc.hasNextInt()) {                 // force correct user input
            System.out.println("Enter an int");
        }
        int A = abc.nextInt();
        System.out.println(strongNumber(A));
    }

    public static boolean strongNumber(int n) {
        int sum = 0, digit;
        for (int i = n; i > 0; i /= 10) {
            digit = i % 10;
            if (digit == 0) {               // 0 factorial is 1
                digit = 1;
            } else if (digit < 0) {
                digit = -1;             // negative factorial is negative 1
            } else {
                for (int k = digit - 1; k > 0; k--) {
                    digit = digit * k;            // calculate factorial
                }
            }
            sum = sum + digit;      // add all the factorials up
        }
        return sum == n;
    }
}
