import java.util.Scanner;
public class ExerciseH2 {
    public static void main (String[] args) {
        Scanner abc = new Scanner(System.in);    // creating new scanner
        boolean run = true;
        while (run) {                                                   // make sure it is always looping
            System.out.println("Enter time in hours:");
            while (!abc.hasNextInt()) {
                abc.nextLine();
                System.out.println("Enter time in hours:");
            }
            int hours = abc.nextInt();              //ask for user input
            if (hours > -1 && hours < 25) {
                if (hours == 24) {                      // if the hour is 24, print 0 am
                    System.out.println("It is 0 a.m");
                    abc.nextLine();
                } else if (hours > 12) {            // if the hour is greater than 12
                    hours = hours % 12;
                    System.out.println("It is " + hours + " p.m");    // print pm
                    abc.nextLine();
                } else {
                    hours = hours % 12;
                    System.out.println("It is " + hours + " a.m");     // else print am
                    abc.nextLine();
                }
            } else {
                abc.nextLine();
            }
        }
    }
}
