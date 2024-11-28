import java.util.Scanner;
public class Exercise21G {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        while (!abc.hasNextInt()) {                 // force correct user input
            System.out.println("Enter an int");
        }
        int A = abc.nextInt();
        System.out.println(armstrongNumbers(A));
    }

    public static boolean armstrongNumbers(int n) {
        int size = size(n), digits, sum = 0;
        for (int i = n; i > 0; i/=10) {
            digits = i % 10;
            sum += power(digits, size);
        }
        return sum == n;                //finds out the sum
    }

    public static int power(int num1, int num2) {       //calculate the power
        int total = num1;
        for (int j = 1; j < num2; j++) {
            total *= num1;
        }
        return total;
    }
    public static int size(int n) { //finds the length
        n = Math.abs(n);                //for negative values
        int count = 0;
        while (n > 0) {
            n /= 10;                            //add one for each digit
            count++;
        }
        return count;
    }
}
