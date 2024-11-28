import java.util.Scanner;
public class MakeSomething1 {
    public static void main(String[] args) {
        rickroll();
        Scanner abc = new Scanner(System.in);
        System.out.println("hi," + john());
        System.out.println("Enter a number");
        while (!abc.hasNextDouble()) {
            System.out.println("Enter a number");
            abc.nextLine();
        }
        double m = abc.nextDouble();
        random(m);
        while (!abc.hasNextDouble()) {
            System.out.println("Enter a number greater than 1");
            abc.nextLine();
        }
        int l = abc.nextInt();
        int p =0;
        while (p < 1) {
            while (!abc.hasNextDouble()) {
                System.out.println("Enter a number");
                abc.nextLine();
            }
            p = abc.nextInt();
        }
        System.out.println(power(l,p));
    }
    public static void rickroll() {
        System.out.println("Never Gonna Give You Up");
        System.out.println("Never Gonna Let You Down");
        System.out.println("Never Gonna Run Around And Desert You");
    }
    public static void random(double k) {
        for(int i = 0; i < 6; i++) {
            System.out.print(k);
        }
    }
    public static int power(int num1, int num2) {
        int total =num1;
        for (int j = 1; j < num2; j++) {
            total *= num1;
        }
        return total;
    }
    public static int john() {
        return 1+1;
    }
}
