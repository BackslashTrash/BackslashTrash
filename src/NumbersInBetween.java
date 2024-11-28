import java.util.InputMismatchException;
import java.util.Scanner;
public class NumbersInBetween {
    public static void main(String[] args) {
        int Number = 0, Number2 = 0;
        boolean repeat2 = true;
        Scanner abc = new Scanner(System.in);
        do {
            try {
                Number = abc.nextInt();// force correct user input
                Number2 = abc.nextInt();
                repeat2=false;
            } catch (InputMismatchException e) {
                abc.nextLine();
                System.out.println("Try again " + e);
            }
        } while (repeat2);
        if (Number > Number2) {
            for (int i = Number2; i <= Number; i++) {       // if one number is greater than the other
                System.out.print(i + ", ");                           // start the loop from the smaller one
            }
        } else if (Number2 > Number) {
            for (int i = Number; i <= Number2; i++) {       // same for this
                System.out.println(i + ", ");
            }
        } else {
            System.out.println("They are the same");    //if they are the same
        }
    }
}
