import java.util.Scanner;
public class U1R7 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter an integer");
        while (!abc.hasNextInt()) {                                 // force correct user input
            System.out.println("Enter an integer");
            abc.nextLine();
        }
        boolean prime = false;
        int input = abc.nextInt();
        for (int i = input; i > 1; i--) {            //check every integer less than the input
            for (int k = 2; k < i; k++) {           //check every number for divisibility
                if (i % k == 0) {                       //check for non-prime number
                    prime = false;
                    break;
                } else {
                    prime = true;
                }
            }
            if (prime) {
                System.out.print(i + " ");          //prints prime number
            }
        }
    }
}