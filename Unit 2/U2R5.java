public class U2R5 {
    public static void main(String[] args) {
        printPrime(12);
    }
    public static void printPrime(int k) {
        k = Math.abs(k);
        boolean isPrime = true;
        for(int i = 2; i < k; i++) {
            for (int j = 2; j < i; j++) {
                if (i == 2) {
                    System.out.print(i + " ");
                } else if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime){
                System.out.print(i + " ");
            }
            isPrime = true;
        }
    }
}
