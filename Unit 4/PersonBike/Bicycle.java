package PersonBike;

class Bicycle {
    private String bikeType;
    private int gears;
    private static int numBike;

    public Bicycle() {
        this("Mountain bike", 15);
    }
    public Bicycle(String bType, int g) {
        this.bikeType = bType;
        this.gears = g;
    }
    public String getBikeType() {
        return bikeType;
    }
    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }
    public int getGears() {
        return gears;
    }
    public void setGears(int gears) {
        this.gears = gears;
    }
    public void setGears(double gears1) {
        this.gears = (int)gears1;
    }
    public static int getNumBike() {
        return numBike;
    }
    @Override
    public String toString() {
        return bikeType + ", " + gears;
    }
    @Override
    public boolean equals(Object o) {
        if (o instanceof Bicycle) {
            Bicycle d = (Bicycle)o;
            return d.bikeType.equals(this.bikeType) && d.gears == this.gears;
        }
        return false;
    }
}
