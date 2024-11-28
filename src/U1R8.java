import java.util.Scanner;
public class U1R8 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter an integer");
        while (!abc.hasNextInt()) {                                 // force user input
            System.out.println("Enter an integer");
            abc.nextLine();
        }
        int number = abc.nextInt();
        int digits = number;
        int sum = 0;
        double number2;
        for (int i = 1; i < number; i++) {                          // determines the number of digits
            digits /= 10;
            if (digits < 1) {                                                // divide by 10 until input is less than 1
                digits = i;
                break;
            }
        }
        System.out.println(digits);
        number2 = Math.pow(10, digits-1);       //number of digit - 1 for the amount of 10s need to be multiplied

        for (int m = digits; m > 0; m--) {
            sum = sum + number/(int)number2;   //divide by multiples of 10
            number = number % (int)number2;     //remainder becomes the numerator
            number2 /= 10;                                      //changes multiples of 10 to the next digit place
        }
        System.out.println(sum);                         //prints the sum
    }
}