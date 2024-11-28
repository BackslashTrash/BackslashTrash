import java.util.Arrays;
import java.util.Scanner;
public class Digits17 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int digits,num = console.nextInt();
        String temp = "" + num;
        boolean isConsecutive = false;
        int length = temp.length();
        int k = length - 1;
        int[] myA = new int[length];
        for (int i = num; i > 0; i/=10) {
            digits = i % 10;
            myA[length-1] = digits;
            length--;
        }
        System.out.println(Arrays.toString(myA));
        while (k > 1) {
            if (myA[k] - myA[k-1] == 1 && myA[k-1] - myA[k-2] == 1) {
                isConsecutive = true;
                break;
            }
            k--;
        }
        System.out.println(isConsecutive);
    }
}
