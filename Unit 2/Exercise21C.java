import java.util.Scanner;
import java.util.InputMismatchException;

public class Exercise21C {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        int A = 0;
        int B = 0;
        boolean repeat = true;
        do {
            try {
                A = abc.nextInt();
                B = abc.nextInt();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("try again");
            }
        } while (repeat);               // force correct user input
        System.out.println(isDivisible(A, B));
    }
    public static boolean isDivisible(int num, int div){
        return num % div == 0;      // return the bool value of if there is no remainders after the division
        }
}
