import java.util.Scanner;
import java.util.InputMismatchException;
public class Enrichment2 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        int aFinal = 100;
        int bFinal = 100;
        int a = 0;
        int b = 0;
        int rounds = 0;
        boolean repeatAsk = true;
        boolean repeatAsk2 = true;
        do {
            try {
                System.out.println("Enter a number between 1 and 15 inclusive:");
                rounds = abc.nextInt();                                     // force correct user input
                if (rounds <= 15 && rounds >= 1) {
                    repeatAsk = false;
                }
            }
            catch (InputMismatchException e){
                abc.nextLine();
                System.err.println("Try again " + e);
            }
        } while (repeatAsk);

        for (int i = 1; i <= rounds; i++) {
            do {
                try {                                               //force correct user input
                    a = abc.nextInt();
                    b = abc.nextInt();
                    if (a <= 6 && a > 0 && b <= 6 && b > 0) {
                        repeatAsk2 = false;
                    } else {
                        abc.nextLine();
                        System.out.println("Enter a number between 1 and 6 inclusive.");
                    }
                } catch (InputMismatchException e) {
                    abc.nextLine();
                    System.out.println("Enter an int");
                }
            } while (repeatAsk2);
            if (a > b) {                            // comparing 2 inputs
                bFinal -= a;
            } else if (b > a) {
                aFinal -= b;
            }
        }
        System.out.println("Antonia's points: "+ aFinal);
        System.out.println("David's points: "+ bFinal);
    }
}