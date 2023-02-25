package com.driver;

public class Boat implements WaterVehicle {
    private String name;
    private int seats;

    public void setName(String name) {
        this.name = name;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getName() {
        return name;
    }


    public int getSeats() {
        return seats;
    }
    public Boat(String name,int seats){
        this.name=name;
        this.seats=seats;
    }

    @Override
    public String getVehicleName() {
        return getName();
    }

    @Override
    public int getVehicleCapacity() {
        return getSeats();
    }
}
