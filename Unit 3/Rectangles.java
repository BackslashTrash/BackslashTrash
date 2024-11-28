
public class Rectangles {
    private int length;
    private int width;
    private static int numRecsMade;
    private final int RECTANGLE_ID;

    Soccerplayer jon = new Soccerplayer();


    public Rectangles() {
        this(1,1);
    }
    public Rectangles(int len, int wid){
        this.length = len;
        this.width = wid;
        numRecsMade++;
        RECTANGLE_ID = numRecsMade;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getLength() {
        return length;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "length=" + length + ", width=" + width;
    }

    public static int getNumRecsMade() {
        return numRecsMade;
    }
    public static void setNumRecsMade(int numRecsMade) {
        Rectangles.numRecsMade = numRecsMade;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Rectangles) {
            Rectangles d = (Rectangles) o;
            return this.length==d.length && this.width==d.width;
        }
        return false;
    }
    public int getArea() {
        return length*width;
    }
    public int getPerimeter() {
        return length + length + width + width;
    }
    public void setWidth(double width1) {
        this.width = (int)width1;
    }
    public void setLength(double length1) {
        this.length = (int)length1;
    }
}
