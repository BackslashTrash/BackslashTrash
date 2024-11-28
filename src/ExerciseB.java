//Keyboard Input

import java.util.Scanner; //we need this line to be able to get input from the keyboard

class ExerciseB {
    public static void main(String[] args) {
        /*  ~~~~~ Lesson ~~~~~ */
        Scanner console = new Scanner(System.in); //makes a Scanner called console to listen to keyboard input
        System.out.println("Write your name and press enter:"); //prints instructions to the user
        String name = console.nextLine(); //saves the user's keyboard input to a variable message
        System.out.print("Welcome, ");
        System.out.println(name);

        //You can also input integers and doubles
        System.out.println("How old are you?");
        int age = console.nextInt(); //declare an int variable, get the user input and assign to the age
        System.out.print(name);
        System.out.print(" is age ");
        System.out.println(age);

        console.nextLine(); //after using nextInt() or nextDouble(), write this line to clear the value and prepare for the next String
        System.out.println("What is your favorite animal?");
        String Animal = console.nextLine();
        System.out.println("Your favorite animal is " + Animal);
        System.out.println("What is 10+3?");
        int answer = console.nextInt();
        
    }
}