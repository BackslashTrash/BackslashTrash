import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter two words");
        String first = abc.nextLine();
        String second = abc.nextLine();
        System.out.println(similar(first,second));
    }
    public static int similar(String a, String b) {
        int count = 0;
        if (a.contains(" ") && b.contains(" ")) {
            count++;
        }
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if(a.charAt(i) == b.charAt(j)) {
                    b = b.replace(b.charAt(j),' ');
                    count++;
                }
            }
        }
        return count;
    }
}
