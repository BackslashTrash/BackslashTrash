
public class U1R3 {
    public static void main(String[] args) {
        int i = 9;                              //first value
        String output = "" + i;
        for (i = 9; i > 0; i--) {
            System.out.println(output);
            int print = i - 1;                      //calculate second digit
            output = output + print;        //second value
        }
    }
}
