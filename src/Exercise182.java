import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercise182 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        int k = -1;
        do {
            try {
                k = abc.nextInt();              //force correct user input
            } catch (InputMismatchException e) {
                abc.nextLine();
                System.out.println("Enter a positive integer");
            }
        } while (k < 0);
        for (int i = k; i > 0; i--) {
            if (k % i == 0) {               //print if it is a factor
                System.out.print(i + ", ");
            }
        }
    }
}

