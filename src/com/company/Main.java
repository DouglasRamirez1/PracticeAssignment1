package com.company;

public class Main
{
    public static void main(String[] args)
    {
        Car c = new Car();
        c.setColor("white");
        c.setSpeed(120);

        Motorcycle m = new Motorcycle();
        m.setColor("black");
        m.setSpeed(160);

        System.out.println(
            "I have a car! It is the color " + c.getColor()
                    + ", the max speed is " + c.getSpeed()
                    + ", the number of wheels it has is " + c.getNumOfWheels()
                    + ", and it having a windshield is " + c.hasWindshield());

        System.out.println(
                "I have a motorcycle! It is the color " + m.getColor()
                        + ", the max speed is " + m.getSpeed()
                        + ", the number of wheels it has is " + m.getNumOfWheels()
                        + ", and it having a windshield is " + m.hasWindshield());
    }
}
