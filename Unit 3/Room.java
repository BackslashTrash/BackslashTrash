public class Room{

    //instance variables
    private int numPeople; //current number of people in the room
    private boolean isLocked; //true = it is locked, false = not locked

    //constructor
    public Room() {
        this(0, false);
    }

    public Room(int n, boolean isL){
        numPeople = n;
        isLocked = isL;
    }

    //instance methods
    public int getNumPeople(){
        return numPeople;
    }

    public void setNumPeople(int n){
        if(n >= 0){
            numPeople = n;
        }
    }

    public boolean getIsLocked() {
        return this.isLocked;
    }

    @Override
    public String toString(){
        return "The room has "+numPeople+" people, and is it locked? " +isLocked;
    }
}
