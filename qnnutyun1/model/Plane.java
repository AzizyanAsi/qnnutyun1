package qnnutyun1.model;

public class Plane {
    private String model;
    private String country;
    private int year;
    private int hours;
    private boolean military;
    private double weight;
    private int  topSpeed;
    private  int seats;
    private double cost;

    //to string
    //print info



    public Plane(String model, String country, int year) {
        this.model = model;
        this.country = country;
        this.year = year;
    }
    @Override
    public String toString() {
        return String.format("model - %s\ncountry - %s\nyear - %d\nhours - %d\nisMilitary - %B\nweight - %f\ntopSpeed - %d\nseats - %d\ncost - %f ",
                model, country, year, hours, military, weight, topSpeed, seats, cost);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public boolean isMilitary() {
        return military;
    }

    public void setMilitary(boolean military) {
        this.military = military;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

}
