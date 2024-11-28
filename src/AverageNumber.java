import java.util.Scanner;
public class AverageNumber {
    public static void main (String[] args) {
        Scanner abc = new Scanner(System.in);
        int k =0;
        int i =0;
        double avg;
        System.out.println("Enter your reps");
        while (!abc.hasNextInt()) {
            System.out.println("Retry");                    // Force correct user input
            abc.nextLine();
        }
        int l = abc.nextInt();                                      // Count the number of inputs
        System.out.println("Enter your numbers");
        while (abc.hasNext()) {
            if (abc.hasNextInt()) {
                k +=abc.nextInt();                  //calculate sum
                i++;
                if (i == l) {
                    break;
                }
            }
            else {
                System.out.println("Wrong");
                abc.next();
            }
        }
        avg = (double)k/l;                  //calculate average
        System.out.println(avg);
    }
}
