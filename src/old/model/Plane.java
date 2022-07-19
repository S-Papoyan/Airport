package old.model;
public class Plane {

    private String model;
    private String country;
    private int year = 2021;
    private long hours = 10000;
    private boolean isMilitary;
    private int weight = 160000;
    private byte wingspan = 45;
    private int topSpeed = 1000;
    private int seats = 1;
    private double cost = 0;

    public Plane() {}

    public Plane(String model, String country, int year, long hours, boolean isMilitary,
                 int weight, byte wingspan, int topSpeed, int seats, double cost) {

        if (model != null) {this.model = model;}
        if (country != null) {this.country = country;}
        if (year > 1903) {this.year = year;}
        if (hours > 0 && hours < 10000) {this.hours = hours;}
        this.isMilitary = isMilitary;
        if (weight > 10000 && weight < 160000) {this.weight = weight;}
        if (wingspan > 10 && wingspan < 45) {this.wingspan = wingspan;}
        if (topSpeed > 0 && topSpeed < 1000) {this.topSpeed = topSpeed;}
        if (seats > 0) {this.seats = seats;}
        if (cost > 0) {this.cost = cost;}
    }

    public String getModel() {return model;}
    public String getCountry() {return country;}
    public int getYear() {return year;}
    public long getHours() {return hours;}
    public boolean isMilitary() {return isMilitary;}
    public int getWeight() {return weight;}
    public byte getWingspan() {return wingspan;}
    public int getTopSpeed() {return topSpeed;}
    public int getSeats() {return seats;}
    public double getCost() {return cost;}

    public void print() {
        System.out.println("Model: " + model);
        System.out.println("Country: " + country);
        System.out.println("Year: " + year);
        System.out.println("Hours: " + hours);
        System.out.println("Is military: " + (isMilitary ? "Yes" : "No"));
        System.out.println("Weight: " + weight);
        System.out.println("Wingspan: " + wingspan);
        System.out.println("Top speed: " + topSpeed);
        System.out.println("Number of seats: " + seats);
        System.out.println("Cost of the plane: " + cost);
    }
}
