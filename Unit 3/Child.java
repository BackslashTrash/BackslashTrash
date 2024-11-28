public class Child extends Parent{
    public Child() {
        super(1, "Male", "Black", "Blue",true);

    }

    @Override
    public void yell() {
        System.out.println("aaaa");
    }
}
