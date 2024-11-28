import java.util.Scanner;
public class Exercise18B {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        int input = 0;
        double userinput;
        double sum = 0;
        System.out.println("Enter 10 doubles");
        while (input < 10) {
            while (!abc.hasNextDouble()) {
                System.out.println("Enter a double");
                abc.nextLine();
            }
            userinput = abc.nextDouble();
            sum = sum + userinput;
            input +=1;
        }
        System.out.println(sum);
    }
}
