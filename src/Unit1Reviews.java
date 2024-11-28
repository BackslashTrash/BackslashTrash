import java.util.InputMismatchException;
import java.util.Scanner;   // import scanner\\
public class Unit1Reviews {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        int k = -1;
        System.out.println("Enter a number greater than 0");
        do {
            try {                                       // try to assign k as the next int greater than 0
                k = abc.nextInt();
            } catch (InputMismatchException e) { // if the user entered something else, catch the error
                System.err.println("Try again, " + e);
            }
            if (k < 0) {
                abc.nextLine();
                System.out.println("Enter a number greater than 0");
            }
        } while (k < 0);

        if (k > 10) {       //this will check first
            System.out.println("it is greater than 10 less than 15");
            // this will print if k is greater than 10 and less than 15

            if (k > 15) //this will only be checked if the outer one is true
                System.out.println("it is greater than 15");
                //if it is greater than 10 and greater than 15 this will print

        } else {
            System.out.println("it is less than 10");
        }

    }
}
