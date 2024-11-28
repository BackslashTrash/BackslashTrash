import java.util.Scanner;
public class U1R4 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter an int");
        while (!abc.hasNextInt()) {
            System.out.println("Enter an int");             // force correct user input
            abc.nextLine();
        }
        int input = abc.nextInt();
        for (int i = 1; i < input; i++) {                   //check every number squared until the user input
            if (i*i == input) {
                System.out.println("Yes");
                abc.nextLine();
            }
        }
    }
}
