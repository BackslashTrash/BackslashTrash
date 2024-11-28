import java.util.Scanner;
import java.util.InputMismatchException;
public class Palindrome {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        boolean repeat = true, repeat2 = true;
        int Number = 2;
        int remainder, k = 0, Number2 =0;
        while (repeat) {
            System.out.println("Enter a number:");
            do {
                try {
                    Number = abc.nextInt();
                    k = Number;                                         // force correct user input
                    repeat2=false;
                } catch (InputMismatchException e) {
                    abc.nextLine();
                    System.out.println("Try again " + e);
                }
            } while (repeat2);
            while (Number != 0) {
                remainder = Number % 10;                //make the number reverse
                Number2 = Number2*10 +remainder;
                Number /= 10;
            }
            if (Number2 == k) {                                 //Compare reversed number and original number
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            System.out.println("Again? Enter true or false:");
            while (!abc.hasNextBoolean()) {                                 // ask for repeat
                abc.nextLine();
                System.out.println("Enter only true or false");
            }
            repeat = abc.nextBoolean();
        }
    }
}