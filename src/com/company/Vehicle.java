package com.company;

public class Vehicle {
    private String color; //private members
    private int speed;

    public void setColor(String color){
        this.color = color; //sets the string argument to match the private member.
    }

    public String getColor(){

        return color; //retrieves the string to print to the console.
    }

    public void setSpeed(int speed){

        this.speed = speed; //sets the int argument to match the private member.
    }

    public int getSpeed(){

        return speed; //retrieves the int to print to the console
    }
}
