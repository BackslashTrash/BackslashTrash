import java.util.Scanner;

public class Exercise23B {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        String k = abc.nextLine();
        String longest = longestWord(k);
        System.out.println(longest);
    }
    public static String longestWord(String sentence) {
        int blankIndex;
        String longestword = "";
        do {
            blankIndex = sentence.indexOf(" ");
            if ((sentence.substring(0, blankIndex)).length() > longestword.length()) {
                longestword = sentence.substring(0, blankIndex);
            }
            sentence = sentence.substring(blankIndex+1); //removes the first word
        } while (sentence.contains(" "));

        if (longestword.length() < sentence.length()) {
            longestword = sentence;
        }
        return longestword;
    }
}
