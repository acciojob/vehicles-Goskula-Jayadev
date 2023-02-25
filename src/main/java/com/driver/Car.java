package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;

    public static void setCurrentGear(int currentGear) {
        Car.currentGear = currentGear;
    }

    private static int currentGear;

    public static int getCurrentGear() {
        return currentGear;
    }

    private int seats;

    public int getSeats() {
        return seats;
    }

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        //Hint: Car extends Vehicle
        super(name);
        this.gears=gears;
        this.currentGear=1;
        this.wheels=wheels;
        this.type=type;
        this.isManual=isManual;
        this.seats=seats;

    }

    public void changeGear(int newGear){

        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){

        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }
}
