package PersonBike;

public class Person implements Comparable{
    private String firstName;
    private String lastName;
    private static int numPeople;
    private Bicycle myBike = new Bicycle();

    public Person() {
        this(null,null);
    }
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Person(String firstName, String lastName, Bicycle bike) {
        this.firstName = firstName;
        this.lastName = lastName;
        myBike = bike;
        numPeople++;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public static int getNumPeople() {
        return numPeople;
    }
    @Override
    public int compareTo(Object o) {
        int result = 0;
        if (o instanceof Person) {
            Person p = (Person)o;
            result = this.lastName.compareTo(p.lastName);
            if (result == 0) {
                return 0;
            } else if (result > 0) {
                return 1;
            } else {
                return -1;
            }
        }   
        return -2147483647;
    }
    public String getBike() {
        return myBike.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person p = (Person)obj;
            return p.getFirstName().equals(this.getFirstName())
                    && this.getLastName().equals(p.getLastName())
                    && this.getBike().equals(p.getBike());
        }
        return false;
    }
}
