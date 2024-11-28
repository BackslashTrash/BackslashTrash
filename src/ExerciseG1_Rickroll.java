import java.util.Scanner;

public class ExerciseG1_Rickroll {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        int yes = 0;
        while (yes == 0) {
            System.out.println("Rickroll or not, type 1 for yes, type anything for no");
            if (!abc.hasNextInt()) {
                System.out.println("Thank you for using the program, see you next time.");
                System.exit(0);
            }
            yes = abc.nextInt();
            if (yes == 1) {
                System.out.println("How many times");
                while (!abc.hasNextInt()) {
                    abc.nextLine();
                    System.out.println("Enter a number");
                }
                int times = abc.nextInt();
                for (int i = 1; i<=times; i++) {
                    System.out.println("Never Gonna Give You Up, Never Gonna Let You Down.");
                }
            } else {
                break;
            }
        }
    }
}

