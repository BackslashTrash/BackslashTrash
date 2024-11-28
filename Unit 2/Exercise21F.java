import java.util.Scanner;
public class Exercise21F {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        while (!abc.hasNextInt()) {                 // force correct user input
            System.out.println("Enter an int");
        }
        int A = abc.nextInt();
        System.out.println(size(A));
    }
    public static int size(int n) {
        n = Math.abs(n);                //for negative values
        int count = 0;
        while (n > 0) {
            n /= 10;                            //add one for each digit
            count++;
        }
        return count;
    }
}
