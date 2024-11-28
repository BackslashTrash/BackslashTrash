public class testRectangles {
    public static void main(String[] args) {
        Rectangles.setNumRecsMade(0);

        Rectangles smallboi = new Rectangles();
        smallboi.setLength(6.3);
        smallboi.setWidth(3.4);

        Rectangles bigboi = new Rectangles();
        bigboi.setWidth(2);
        bigboi.setLength(2);

        Rectangles A = new Rectangles();
        Rectangles B = new Rectangles();

        System.out.println(B.jon.toString());

        System.out.println(smallboi.getArea());
        System.out.println(smallboi.getPerimeter());

        System.out.println(bigboi.getWidth());
        System.out.println(bigboi.getPerimeter());

        System.out.println("The number of rectangles is: " + Rectangles.getNumRecsMade());
        System.out.println(smallboi.equals(bigboi));
        System.out.println(A.equals(B));
    }
}
