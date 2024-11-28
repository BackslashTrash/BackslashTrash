public class U1R2 {
    public static void main(String[] args) {
        for (int i = 5; i < 101; i++) {
            if (i % 3 == 0 || i % 5 ==0) {                          // if it is divisible by 3 or 5
                System.out.print(i + " ");                       // prints out value
            }
        }
    }
}
