import java.util.Scanner;
public class CollazConjecture {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        int k = -2;
        while (k <= 0) {
            System.out.println("Enter an integer greater than 0");
            while (!abc.hasNextInt()) {                         // force correct user input
                System.out.println("Enter an integer greater than 0");
                abc.nextLine();
            }
            k = abc.nextInt();
        }
        while (k >= 2) {
            if (k % 2 == 0) {                               // divide by 2 if number is even
                k /= 2;
                System.out.println(k);
            } else {
                k *= 3;                                     // times 3 plus 1 if number is odd
                k++;
                System.out.println(k);
            }
        }
    }
}
