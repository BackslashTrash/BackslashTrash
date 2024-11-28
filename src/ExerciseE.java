import java.util.Scanner;

public class ExerciseE {

    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        int TermValue = 1; //First term
        int TermValue2 = 1;  // Second Term
        int end = 0;
        int repeat = 1;
        double limit;
        System.out.println("Welcome to Fibonacci Sequence limit calculator.");
        do {
            if (repeat == 1) {
                System.out.println("Please enter a limit that is a number.");
                if (abc.hasNextDouble()) {
                    double Temp = abc.nextDouble();
                    if (Temp > 0) {
                        limit = Temp;
                        while (TermValue < limit) {
                            TermValue += TermValue2;   // First term adds the second term
                            TermValue2 += TermValue;   // Second term adds the new first term
                        }
                        System.out.println(TermValue);
                        end = 1;
                    } else {
                        System.out.println("Please enter a number above 0.");
                    }
                } else {
                    abc.nextLine();
                }
            }
            while (end == 1) {
                System.out.println("Repeat? Please only type 1 for yes 0 for no.");
                abc.nextLine();
                if (abc.hasNextInt()) {
                    int Temp2 = abc.nextInt();
                    if (Temp2 == 1) {
                        end = 0;
                        repeat = Temp2;
                    } else {
                        System.out.println("Please enter an int");
                    }
                    if (Temp2 == 0) {
                        repeat = Temp2;
                        break;
                    }
                }
            }
        } while (repeat == 1);
    }
}