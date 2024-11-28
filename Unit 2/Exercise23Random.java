import java.util.Scanner;
public class Exercise23Random {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        String first = abc.nextLine();
        String second = abc.nextLine();
        boolean repeatingA = true, repeatingB = true, finishedA = false, finishedB = false;
        int lengthA = 0, lengthB = 0;
        for (int i = 0; i < first.length(); i++) {
            for (int j = 0  ; j < first.length() - i; j++) {
                if (!finishedA) {
                    if (j == i && i != first.length()-1) {
                        continue;
                    } else {
                        lengthA = i+1;
                    }
                    if (repeatingA) {
                        if (first.charAt(i) != first.charAt(j)) {
                            repeatingA = false;
                        }
                    } else {
                        if (first.charAt(i) == first.charAt(j)) {
                            lengthA = j;
                            finishedA = true;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < second.length(); i++) {
            for (int j = 0  ; j < second.length() - i; j++) {
                if (!finishedB) {
                    if (j == i && i != second.length()-1) {
                        continue;
                    } else {
                        lengthB = i+1;
                    }
                    if (repeatingB) {
                        if (second.charAt(i) != second.charAt(j)) {
                            repeatingB = false;
                        }
                    } else {
                        if (second.charAt(i) == second.charAt(j)) {
                            lengthB = j;
                            finishedB = true;
                        }
                    }
                }
            }
        }
        System.out.println(lengthA + " " + lengthB);
        if(lengthA > lengthB) {
            System.out.println("A");
        } else if (lengthB > lengthA) {
            System.out.println("B");
        } else {
            System.out.println("Equal");
        }
    }
}