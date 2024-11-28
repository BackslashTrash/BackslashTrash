import java.util.Scanner;
import java.util.InputMismatchException;

class ExerciseH3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean askAgain=true;
        int number=0;
        do{
            try{
                System.out.println("Enter an Integer: ");
                number=input.nextInt();
                askAgain=false;
            }
            catch (InputMismatchException e){
                System.err.println("Exception: " + e);
                input.nextLine();  //clear bad value by flushing the buffer
                System.out.println("You did not enter an integer. Please try again.");
            }
        } while (askAgain);
        System.out.println("Finally, you input the integer " + number + "!!!!!");
    }
}
