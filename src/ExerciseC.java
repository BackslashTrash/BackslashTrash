import java.util.Scanner;

public class ExerciseC {
    public static void main(String[] args) {

        Scanner abc = new Scanner(System.in);
        System.out.println("What is the price?");
        double price = abc.nextDouble();
        System.out.println(price * 1.13);
        //PART A: INTEGER DIVISION
        System.out.println("Enter the number of students:");
        int SNum = abc.nextInt();
        System.out.println(SNum/25);
        abc.close();
    }
}
