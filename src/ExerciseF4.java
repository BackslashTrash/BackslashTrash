import java.util.Scanner;

public class ExerciseF4 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter a number.");
        while (!abc.hasNextDouble()) {                      // Force correct input
            System.out.println("Enter a number:");
            abc.nextLine();
        }
        double Input1 = abc.nextDouble();                   //First user input
        abc.nextLine();
        System.out.println("Enter the second number:");
        while (!abc.hasNextDouble()) {                                  //Force correct input
            System.out.println("Enter the second number:");
            abc.nextLine();
        }
        double Input2 = abc.nextDouble();                           //Second user input
        abc.nextLine();
        System.out.println("Enter the third number.");
        while (!abc.hasNextDouble()) {                                 //Force correct user input
            System.out.println("Enter the third number.");
            abc.nextLine();
        }
        double Input3 =abc.nextDouble();                            //Third user input
        if (Input1 != 0 && Input2 != 0) {
            if (Input1 + Input2 == Input3
                    || Input1 - Input2 == Input3
                    || Input2 - Input1 == Input3
                    || Input2 * Input1 == Input3
                    || Input1 / Input2 == Input3
                    || Input2 / Input1 == Input3 ) { // Check for addition, multiplication, subtraction, and division for non-zero numbers.
                System.out.println("CONGRATULATIONS - YOU WON!!!");
            } else {
                System.out.println("Sorry, better luck next time.");
            }
        } else if (Input1 == 0 && Input2 != 0) {       // if one number is 0
            if (Input1 + Input2 == Input3
                    || Input1 - Input2 == Input3
                    || Input2 - Input1 == Input3
                    || Input2 * Input1 == Input3
                    || Input1 / Input2 == Input3) {
                System.out.println("CONGRATULATIONS - YOU WON!!!");
            } else {
                System.out.println("Sorry, better luck next time.");
            }
        } else if (Input2 == 0 && Input1 != 0) {              // If another number is 0
            if (Input1 + Input2 == Input3
                    || Input1 - Input2 == Input3
                    || Input2 - Input1 == Input3
                    || Input2 * Input1 == Input3
                    || Input2 / Input1 == Input3) {
                System.out.println("CONGRATULATIONS - YOU WON!!!");
            }  else {
                System.out.println("Sorry, better luck next time.");
            }
        } else {
            if (Input1 + Input2 == Input3) {             //if both are 0, check for addition only.
                System.out.println("CONGRATULATIONS - YOU WON!!!");
            } else {
                System.out.println("Sorry, better luck next time.");
            }
        }
    }
}
