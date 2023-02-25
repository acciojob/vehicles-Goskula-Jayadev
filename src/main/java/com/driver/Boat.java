package com.driver;

public class Boat implements WaterVehicle {
    private String name;
    private int seats;

    public String getName() {
        return name;
    }


    public int getSeats() {
        return seats;
    }
    Boat(String name,int seats){
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
