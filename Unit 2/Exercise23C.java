import java.util.Scanner;
public class Exercise23C {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        while (!abc.hasNextDouble()) {
            abc.nextLine();
            System.out.println("Try again");
        }
        double cm = abc.nextDouble();
        System.out.println(imperialMeasurement(cm));
    }
    public static String imperialMeasurement(double centimeters) {
        double feet, inches, quarterinch;
        feet = centimeters / 30.48;
        feet = (int)feet;
        inches = (centimeters-(30.48 * feet))/2.54;
        inches = (int)inches;
        quarterinch = (centimeters - ((30.48*feet) + (2.54 * inches)))/0.635;
        quarterinch = (int) quarterinch;
        String result = centimeters + " cm is " + feet + " feet " +inches + " " + quarterinch + "/4 inches";
        return  result;
    }
}
