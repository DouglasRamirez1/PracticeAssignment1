package com.company;

public class Main
{
    public static void main(String[] args)
    {
        Car car = new Car();
        car.setColor("white");
        car.setSpeed(120);

        Motorcycle m = new Motorcycle();
        m.setColor("black");
        m.setSpeed(160);

        System.out.println(
            "I have a car! It is the color " + car.getColor()
                    + ", the max speed is " + car.getSpeed()
                    + ", the number of wheels it has is " + car.getNumOfWheels()
                    + ", and it having a windshield is " + car.hasWindshield());

        System.out.println(
                "I have a motorcycle! It is the color " + m.getColor()
                        + ", the max speed is " + m.getSpeed()
                        + ", the number of wheels it has is " + m.getNumOfWheels()
                        + ", and it having a windshield is " + m.hasWindshield());
    }
}
