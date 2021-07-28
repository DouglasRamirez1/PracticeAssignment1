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

        String message = "It's color is %s, the speed is %d. The number of wheels is %d. Does it have a windshield? %b";

        String carMessage = String.format(
            "I have a car! " + message, car.getColor(), car.getSpeed(), car.getNumOfWheels(), car.hasWindshield());

        String motorcycleMessage = String.format(
            "I have a motorcycle! " + message, m.getColor(), m.getSpeed(), m.getNumOfWheels(), m.hasWindshield());

        System.out.println(carMessage);
        System.out.println(motorcycleMessage);
    }
}
