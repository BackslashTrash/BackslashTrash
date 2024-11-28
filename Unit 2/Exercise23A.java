import java.util.Scanner;
public class Exercise23A {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        String k = abc.nextLine();
        System.out.println(allD(k));
    }
    public static boolean allD(String k) {
        boolean alldigits = true;
        if (k.isEmpty() || k.isBlank()) {
            return false;
        }
        for(int i = 0; i < k.length(); i++) {
            if (!(k.charAt(i) < '0' || k.charAt(i) < '9')) {
                alldigits = false;
                break;
            }
        }
        return alldigits;
    }
}
