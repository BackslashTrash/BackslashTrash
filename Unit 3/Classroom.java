public class Classroom extends Room{
    private int numTeachers;
    public Classroom() {
    this(0,0,false);
    }
    public Classroom(int numT, int numP, boolean isL) {
        super(0, false);
        this.numTeachers = numT;
    }
    public int getNumTeachers() {
        return numTeachers;
    }
    public void setNumTeachers(int numTeachers) {
        this.numTeachers = numTeachers;
    }

    @Override
    public String toString() {
        return "this room have " + numTeachers + " teachers " + getNumPeople() + " people and is locked? " + getIsLocked();
    }
}
