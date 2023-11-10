public abstract class Coffee {
    String name;
    double waterRequired;
    double milkRequired;
    double coffeeRequired;

    Coffee(double water, double milk, double coffee, String nm){
        waterRequired = water;
        milkRequired = milk;
        coffeeRequired = coffee;
        name = nm;
    }

    public abstract void prepare();
}

