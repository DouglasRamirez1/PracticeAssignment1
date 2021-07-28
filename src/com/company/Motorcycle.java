package com.company;

public class Motorcycle extends Vehicle{

    public int getNumOfWheels(){

        return 2; //Returns a fixed interger because a motorcycle always has 2 wheels.
    }

    public boolean hasWindshield(){

        return false; //Returns a fixed boolean because this motorcycle doesn't have a windshield.
    }
}
