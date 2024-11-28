import java.util.Scanner;
public class ExerciseF3 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter a number.");
        while (!abc.hasNextDouble()) {                      // Force correct input
            System.out.println("Enter a number:");
            abc.nextLine();
        }
        double Input1 = abc.nextDouble();                   //First user input
        abc.nextLine();
        System.out.println("Enter another number:");
        while (!abc.hasNextDouble()) {                                  //Force correct input
            System.out.println("Enter another number:");
            abc.nextLine();
        }
        double Input2 = abc.nextDouble();                           //Second user input
        if (Input1 > Input2) {                                                  // Comparing inputs
            System.out.println(Input1 + " is larger");            // Outputs results
        } else if (Input1 == Input2) {
            System.out.println("They are the same");
        } else {
            System.out.println(Input2 + " is larger");
        }
    }
}
