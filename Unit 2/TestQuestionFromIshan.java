import java.util.Scanner;
public class TestQuestionFromIshan {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        String first = abc.nextLine();
        System.out.println(repetition(first, 2));
    }
    public static boolean repetition(String k, int p) {
        int length = 0;
        boolean notrepeat = false;
            for (int i = 0; i < k.length(); i++) {
                char joe = k.charAt(p);
                if (k.charAt(length) == joe) {
                    p++;
                    notrepeat = true;
                }
        }
        return notrepeat;
    }
}
