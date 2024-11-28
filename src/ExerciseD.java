import java.util.Scanner;

class ExerciseD {
    public static void main(String[] args) {

        /*   Remove comments one at a time, and run the program. Try changing the values on some lines */

        System.out.println("Part A: Basic Operations");

        System.out.println(6+9); //addition

        System.out.println(5-2); //subtraction

        System.out.println(5*2); //multiplication

        System.out.println(5/2); //Integer division - note that this truncates (cuts off) the decimal

        System.out.println(5.0/2); //Float division - note that this gives a decimal answer

        System.out.println(6%9); //Modulo - the remainder when 6 is divided by 9

        System.out.println(1+(5+2)*3); //Order of Operation is followed (left to right, following BEDMAS)



        System.out.println("Part B: Addition vs Concatenation");

        System.out.println("We can put"+"two Strings together with concatenation using +");

        System.out.println(100 + 100); //We can do addition with +, as well

        System.out.println("10" + 50); //This addition is a String + int, so + is concatenation, not addition

        System.out.println("10" + 3 + 4); //Again, "10" + 3 is String + int, so  "10" + 3 = "103".
        //Next "103" + 4 involves a String, so it is concatenation, not addition:  "103" + 4 = "1034"

        System.out.println("10" + (3 + 4)); //Adding brackets changes the order of operation: "10" + (3 + 4) = "10" + 7 because we do 3+4 first, and then
        //Next "10" + 7 = "107"

        System.out.println((3 + 4) + "10"); //Evaluate in your head, and then run the line of code to check if you are correct.

        System.out.println(3 + 4 + "10"); //Again, evaluate in your head, and then run the line of code to check if you are correct.



        System.out.println("Part C: Special Operators");

        int a = 6;

        System.out.println("a += 3 is " + (a += 3)); // a += 3 is the same as a = a + 3

        a++; //adds 1 to current value of a, prints on next line
        System.out.println("Printing a after a++: " + a);

        System.out.println("Printing a++ will print before doing a++ gives: " + a++); //This prints a and then adds one, so if we print on the next line, it is one more:
        System.out.println("Printing a on the next line "+a);

        System.out.println("a -= 4 is " + (a -= 4)); // same as a = a - 4

        a--;//decrease a by one
        System.out.println("Doing a-- and then print a: " + a); //decrease a by one
        Scanner abc = new Scanner(System.in);

        System.out.println("Enter your number:");
        int Number = abc.nextInt();
        if (Number < 65) {        //Calculate the number on the ASCII table if it only had uppercase letters.
            Number = Number + 78; // add 78 to not change the position
            Number = Number % 65; // gets the number's position relative to 65 because the alphabet starts at 65
            Number = Number % 26; // locate the position of the number on the alphabet
            Number = Number + 65; // add 65 to match the ASCII table
        }
        else {
            Number = Number % 65;
            Number = Number % 26;
            Number = Number + 65;
        }
        System.out.println((char)Number);

    }
}
