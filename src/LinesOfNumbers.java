public class LinesOfNumbers {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println();
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
        }
    }
}
