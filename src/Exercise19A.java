import java.util.Scanner;
class Exercise19A {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter your level.");
        while (!abc.hasNextInt()) {
            System.out.println("Enter your level.");
            abc.nextLine();
        }
        int level =abc.nextInt();
        switch (level) {
            case 1 -> System.out.println("50 - 59");
            case 2 -> System.out.println("60 - 69");
            case 3 -> System.out.println("70 - 79");
            case 4 -> System.out.println("80 - 100");
            default -> System.out.println("u failed");
        }
    }
}
