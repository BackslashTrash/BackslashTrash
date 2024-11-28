///////// DOG CLASS ////////////////////////
class Dog{
    private int age;
    private String name;
    private String breed;
    //instance variables
    //#1 make variables for int age, String name, and String breed

    //constructor
    public Dog(int age_, String name_, String breed_){
        //#2 assign each parameter to each instance variable
        this.age = age_;
        this.name=name_;
        this.breed=breed_;



    }


    //instance methods
    //#3 write a method called bark that prints a barking sound like "ruff". There are no parameters.
    public void bark() {
        System.out.println("ruff");
    }


    //#4 write a method called toString that returns a String describing the dog (basically, return a String with the dog's instance variables). There are no parameters.
    public String displayString() {
        return this.name + this.breed + this.age;
    }

}
