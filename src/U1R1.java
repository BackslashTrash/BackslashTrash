import java.util.Scanner;

public class U1R1 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        int hours, minutes, seconds;
        System.out.println("Enter time in seconds");
        while (!abc.hasNextInt()) {
            System.out.println("Enter time in seconds");                // force correct user input
            abc.nextLine();
        }
        seconds = abc.nextInt();
        minutes = seconds/60;
        seconds = seconds % 60;             // calculate seconds
        hours = minutes/60;                    // calculate hours
        minutes = minutes % 60;             // calculate minutes
        System.out.println(hours + " hours " + minutes + " minutes " + seconds + " seconds");
    }
}
