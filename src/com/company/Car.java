package com.company;

public class Car extends Vehicle{

    public int getNumOfWheels(){

        return 4; //returns a fixed integer because a car always has 4 wheels.
    }

    public boolean hasWindshield(){

        return true; //returns a fixed boolean because a car always has a windshield.
    }
}
