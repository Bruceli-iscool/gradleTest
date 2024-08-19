package org.example;

public class Car {
    final int cost;
    final int mileage;
    public Car(int price, int miles) {
        cost = price;
        mileage = miles;
    }
    // get resell price (inaccurate, this is a test project)
    public double sellPrice()  
    {
        return cost - (0.2 * mileage);
    }
    // getters
    public int price() 
    {
        return cost;
    }
    public int mileage() 
    {
        return mileage;
    }

}
