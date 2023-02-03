package com.driver;

public class Boat {
    public String name;
    public int capacity;

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
    public String getVehicleName() {
        return this.name;
    }
    public int getVehicleCapacity() {
        return this.capacity;
    }
}
