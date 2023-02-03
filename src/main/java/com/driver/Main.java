package com.driver;

public class Main {
    public static void main(String[] args) {
        F1 mercedes = new F1("mercedes", false);
        mercedes.move(40, 0);
        mercedes.accelerate(20);
        mercedes.steer(23);
        mercedes.steer(2);
        mercedes.accelerate(-60);
    }
}