import java.util.Scanner;

public class ExerciseF2 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = abc.nextInt();
        if (number > 99999 || number < 10000) {
            System.out.println("Invalid Input");
        } else if (number == 34567) {
            System.out.println("You have won $1,000,000");
        } else {
            System.out.println("Better luck next time!");
        }
    }
}
