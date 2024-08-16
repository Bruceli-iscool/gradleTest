public class Car {
    final int cost;
    final int mileage;
    public Car(int price, int mileage) {
        cost = price;
        super.mileage = mileage;
    }
    // get resell price (inaccurate, this is a test project)
    public int sellPrice() 
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