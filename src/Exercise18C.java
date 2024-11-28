import java.util.Scanner;
public class Exercise18C {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        boolean rep = true;
        int cal = 0;
        System.out.println("Enter a word:");
        String ipt = abc.nextLine();                //ask for the word
        System.out.println("How many times?");
        while (rep) {                // ask for amount
            while (!abc.hasNextInt()){
                System.out.println("Enter an int");
                abc.nextLine();
            }
            cal = abc.nextInt();
            if (cal < 1) {                                    // checks for negative integer
                System.out.println("Enter a positive integer");
                abc.nextLine();
            } else {
                rep = false;
            }
        }
        for (int i = 1; i <= cal; i++) {
            System.out.print(ipt + " ");              // prints the message the amount user assigned
        }
    }
}
