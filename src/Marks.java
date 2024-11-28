import java.util.Scanner;
import java.util.InputMismatchException;
public class Marks {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        boolean repeat = true;
        double input1 = 0;
        double input2 = 0;
        do {
            try {
                input1 = abc.nextDouble();
                input2 = abc.nextDouble();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Try again");
            }
        } while (repeat);

        System.out.println("Enter an operator: +, -, *, /, % ");

        String op = abc.next();

        switch (op) {
            case "+" -> System.out.println(input1 + input2);
            case "-" -> System.out.println(input1 - input2);
            case "*" -> System.out.println(input1 * input2);
            case "/" -> System.out.println(input1 / input2);
            case "%" -> System.out.println(input1 % input2);
            default -> System.out.println("Enter an operator");
        }
    }
}
