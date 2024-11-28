import java.util.Scanner;
public class Exercise21A {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        int k = 1;
        double input2 = 0;
        double input1 = 0;
        System.out.println("Enter a number");
        while (k < 3) {
            while (!abc.hasNextDouble()) {
                System.out.println("Enter a number");           // gets 2 user inputs
                abc.nextLine();
            }
            input1 = abc.nextDouble();
            k += 1;
            if (k == 2) {
                input2 = input1;
            }
        }
        double area = triangleArea(input1,input2);
        System.out.println(area);                           // prints area
    }
    public static double triangleArea(double base, double height)           //triangle method
    {
        return  base*height/2;
    }
}
