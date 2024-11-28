import java.util.Scanner;
public class PalindromeWords {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter a word or a number:");
        String work = abc.nextLine();
        work = work.replaceAll(" ", "");
        int length = work.length(), first = 0, last = length -1;
        boolean palindrome = true;
        for (int i = 1; i <= length/2; i++) {
            if (work.charAt(first) == work.charAt(last)) {
                first++;
                last--;
            } else {
                palindrome = false;
                break;
            }
        }
        if (palindrome) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}