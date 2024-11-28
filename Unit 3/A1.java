
//example

public class A1 {
    //Declaring and initializing instance variables.
    private String colour;
    private int length;

    public A1() {
        this.colour ="Grey";
        this.length = 73;
    }
    // Default constructor

    public A1(String cl, int legt) {
        colour = cl;
        length = legt;
    }
    //Overloaded constructor

    public void setColour(String c) {
        this.colour = c;
    }

    public void setLength(int l) {
        this.length = l;
    }

    public void yell() {
        System.out.println("AHHHHHHH!!!!");
    }

    public String makeString() {
        return colour + " " + length;
    }
}
