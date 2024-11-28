import java.util.Scanner;
public class Exercise21B {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        int k = 1;
        int input2 = 0;
        int input1 = 0;
        int input3 = 0;
        System.out.println("Enter a number");
        while (k < 4) {
            while (!abc.hasNextInt()) {
                System.out.println("Enter a number");           // gets 3 user inputs
                abc.nextLine();
            }
            input1 = abc.nextInt();
            k += 1;
            if (k == 2) {
                input2 = input1;
            } else if (k == 3) {
                input3 = input1;
            }
        }
        double area = average(input1, input2, input3);
        System.out.println(area);                           // prints area
    }
    public static double average(int n1, int n2, int n3)
    {
        return  (double)(n1+n2+n3)/3;
    }
}
