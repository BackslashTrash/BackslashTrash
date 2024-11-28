public class Parent {
    private int age;
    private String gender;
    private String hairColour;
    private String eyeColour;
    private boolean isAlive;

    public Parent() {
        this (20, "Male", "Black", "Blue", true);
    }
    public Parent(int age, String gender, String hairColour, String eyeColour, boolean isAlive) {
        this.age = age;
        this.gender = gender;
        this.hairColour = hairColour;
        this.eyeColour = eyeColour;
        this.isAlive = isAlive;
    }
    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getEyeColour() {
        return eyeColour;
    }

    public String getHairColour() {
        return hairColour;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public void setEyeColour(String eyeColour) {
        this.eyeColour = eyeColour;
    }

    public void setHairColour(String hairColour) {
        this.hairColour = hairColour;
    }

    @Override
    public String toString() {
        return age +" " + gender + " " + hairColour + " " + eyeColour + " " + isAlive;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Parent) {
            Parent p = (Parent)obj;
            return this.age == p.age
                    && this.gender.equals(p.gender)
                    && this.hairColour.equals(p.hairColour)
                    && this.eyeColour.equals(p.eyeColour)
                    && this.isAlive == p.isAlive;
        }
        return false;
    }

    public void yell() {
        System.out.println("AHHHHHHHHHHHHHhh");
    }

}
