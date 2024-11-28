public class Alien{
    //instance variables
    private int position; //MAKE VARIABLE PRIVATE
    private boolean isAlive; //MAKE VARIABLE PRIVATE
    private int points; //MAKE VARIABLE PRIVATE

    //constructor
    public Alien(int pos, boolean isA, int p){
        position = pos;
        isAlive = isA;
        points = p;
    }

    //instance methods
    public void moveRight(){
        position = position+1;
    }

    //getter and setter methods for isAlive
    public boolean getIsAlive(){
        return isAlive;
    }

    public void setIsAlive(boolean isA){
        isAlive = isA;
    }

    //ADD GETTER AND SETTER METHODS FOR position

    //ADD GETTER AND SETTER METHODS FOR points
    public int getPosition() {
        return position;
    }
    public void setPosition(int position1) {
        position = position1;
    }
}
