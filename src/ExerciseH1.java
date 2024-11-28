public class ExerciseH1 {
    public static void main (String[] args) {
        int number = 1;
        while (number < 101) {
            System.out.print(number + " ");
            if (number % 10 == 0) {
                System.out.println();
            }
            number += 1;

        }
    }
}
