class ClassCode17 {
    public static void main(String[] args){
        /*
         * This program uses switch case
         * @author Ms. Jin
         */

        char block = 'C';


        // Tell the user the start time of the period
        switch (block){
            case 'A' -> System.out.println("Day 1 at 8:40am");
            case 'B' -> System.out.println("Day 1 at 10:05am");
            case 'C' -> System.out.println("Day 1 at 12:10pm");
            case 'D'-> System.out.println("Day 1 at 1:35pm");
            default ->  System.out.println("ERROR");  // if block is not A, B, C, or D

        }


        String grade = "A";
        switch (grade){
            case "a", "A" -> {
                System.out.println("Hello");
                System.out.println("Your percent mark is 80-100");
            }
            case "b", "B"-> System.out.println("Your percent mark is 70-79");
            default -> System.out.println("Invalid entry");
        }
    }
}
