public class CoffeeMachine {
    protected double agua;
    protected double leite;
    protected double graoCafe;

    public CoffeeMachine(double agua, double leite, double graoCafe) {
        this.agua = agua;
        this.leite = leite;
        this.graoCafe = graoCafe;
    }

    public void makeCoffee(Coffee coffee) throws NotEnoughException {
        System.out.println(coffee.name);
        this.takeCoffee(coffee.coffeeRequired);
        this.takeMilk(coffee.milkRequired);
        this.takeWater(coffee.waterRequired);
        coffee.prepare();
    }

    public double getWater() {
        return this.agua;
    }

    public double getMilk() {
        return this.leite;
    }

    public double getCoffee() {
        return this.graoCafe;
    }

    public String getResources() {
        return "ÁGUA:::" + toString(this.getWater()) + "\nCAFÉ:::" + toString(this.getCoffee()) + "\nLEITE:::" + toString(this.getMilk());
    }

    protected void setResources(double water, double milk, double coffee) {
        this.setWater(this.getWater() + water);
        this.setMilk(this.getMilk() + milk);
        this.setCoffee(this.getCoffee() + coffee);
        this.getResources();
    }

    private String toString(double resource) {
        return " " + resource + " ";
    }

    private void setWater(double newWater) {
        this.agua = newWater;
    }

    private void setMilk(double newMilk) {
        this.leite = newMilk;
    }

    private void setCoffee(double newCoffee) {
        this.graoCafe = newCoffee;
    }

    private void takeWater(double waterRequired) throws NotEnoughException {

        double water = this.getWater() - waterRequired;
        if (waterRequired < this.getWater()) {
            this.setWater(water);
            System.out.println("Separando a agua necessária...");
        } else {
            throw new NotEnoughException();
        }

    }

    private void takeMilk(double milkRequired) throws NotEnoughException {

        double milk = this.getMilk() - milkRequired;
        if (milkRequired < this.getMilk()) {
            this.setMilk(milk);
            System.out.println("Separando o leite necessário...");
        } else {
            throw new NotEnoughException();
        }
    }

    private void takeCoffee(double coffeeRequired) throws NotEnoughException {

        double coffee = this.getCoffee() - coffeeRequired;
        if (coffeeRequired < this.getCoffee()) {
            this.setCoffee(coffee);
            System.out.println("Separando o cafe necessário...");
        } else {
            throw new NotEnoughException();
        }

    }

}
