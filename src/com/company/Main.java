package com.company;

public class Main
{
    public static void main(String[] args)
    {
        Car c = new Car();
        c.setColor("white");            //provides the color string to Vehicle.java
        c.setSpeed(120);                //provides the speed integer to Vehicle.java

        Motorcycle m = new Motorcycle();
        m.setColor("black");            //provides the color string to Vehicle.java
        m.setSpeed(160);                //provides the speed integer to Vehicle.java

        System.out.println(
            "I have a car! It is the color " + c.getColor() //calls getColor to return the string we provided with the object.
                    + ", the max speed is " + c.getSpeed() //calls getSpeed to return the integer we provided with the object.
                    + ", the number of wheels it has is " + c.getNumOfWheels() //calls getNumofWheels from Car.java to return an interger.
                    + ", and it having a windshield is " + c.hasWindshield()); //calls hasWindshield from Car.java to return a boolean.

        System.out.println(
                "I have a motorcycle! It is the color " + m.getColor() //calls getColor to return the color we provided with the object.
                        + ", the max speed is " + m.getSpeed() //calls getSpeed to return the integer we provided with the object.
                        + ", the number of wheels it has is " + m.getNumOfWheels() //calls getNumofWheels from Motorcycle.java to return an interger.
                        + ", and it having a windshield is " + m.hasWindshield()); //calls hasWindshield from Motorcycle.java to return a boolean.
    }
}
