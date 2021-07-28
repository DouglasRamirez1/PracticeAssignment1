package com.company;

public class Main
{
    public static void main(String[] args)
    {
        Year y = new Year();
        Color c = new Color();
        brand b = new brand();
        Type t = new Type();
        System.out.println("My vehicle is a " + t.getType()
                + " from the year " + y.getYear()
                + " of the brand " + b.getBrand()
                + " and is the color " + c.getColor() + ".");
    }

}
