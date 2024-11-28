import java.util.Scanner;
class Testing {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        boolean run = true;
        while (run) {
            double result = 1;
            System.out.println("Enter a number:");
            while (!abc.hasNextInt()) {                         //force correct user input
                System.out.println("Enter a number");
                abc.nextLine();
            }
            int input = abc.nextInt();
            System.out.println("Enter another number:");
            while (!abc.hasNextInt()) {                             //force correct user input
                System.out.println("Enter an int");
                abc.nextLine();
            }
            int input2 = abc.nextInt();
            if (input2 == 0) {                                          //output 1 because all number to the power of 0 is 1
                System.out.println(1);
                abc.nextLine();
            } else if (input2 < 0) {
                input2 = Math.abs(input2);
                for (int i = 1; i <= input2; i++) {
                    result *= input;                                    // repeat the number of power times
                }
                System.out.println(1/result);                   // fraction for negative powers
            } else {
                for (int i = 1; i <= input2; i++) {
                    result *= input;
                }
                System.out.println(result);
            }
            System.out.println("again? type true or false");
            while(!abc.hasNextBoolean()) {
                System.out.println("type true or false");                   // ask for repeat
                abc.nextLine();
            }
            run = abc.nextBoolean();
        }
    }
}
