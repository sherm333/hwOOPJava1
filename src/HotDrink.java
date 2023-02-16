public class HotDrink extends Drink{
    int temperature;
    int cost;

    public HotDrink(String name, double volume, int temperature, int cost){
        super(name, volume);
        this.temperature = temperature;
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return  "\n\ndrink = " + super.getName() +
                "\nvolume = " + super.getVolume() +
                "\ntemperature = " + temperature +
                "\nprice = " + cost ;
    }
}
