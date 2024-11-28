import java.util.Scanner;

public class ExerciseF {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        double Mark;
        int end = 0;
        while (end == 0) {
            System.out.println("Please enter your mark:");     // Ask for user input
            if (abc.hasNextDouble()) {                         // Check if the input is correct
                double Temp = abc.nextDouble();
                if (Temp > 0) {
                    Mark = Temp;
                    if (Mark >= 80) {
                        System.out.println("Level 4");        // Level 4
                        abc.nextLine();
                    }
                    if (Mark >= 70 && Mark < 80) {
                        System.out.println("Level 3");         // Level 3
                        abc.nextLine();
                    }
                    if (Mark >= 60 && Mark < 70) {
                        System.out.println("Level 2");        // Level 2
                        abc.nextLine();
                    }
                    if (Mark >= 50 && Mark < 60) {
                        System.out.println("Level 1");        // Level 1
                        abc.nextLine();
                    }
                    if (Mark < 50) {
                        System.out.println("Level 0");        // Level 0
                        abc.nextLine();
                    }
                } else {
                    System.out.println("Your mark must be positive.");
                    abc.nextLine();
                }
            } else {
                System.out.println("Please enter a number.");
                abc.nextLine();
            }
        }
    }
}