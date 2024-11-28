import java.util.Scanner;

public class ExerciseF1 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("Please enter an int");
            if (abc.hasNextInt()) {
                int temp = abc.nextInt();
                if (temp % 2 == 0) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
            } else {
                abc.nextLine();
            }
        }
    }
}
