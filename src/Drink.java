public class Drink {
    private final String name;
    private final double volume;

    public Drink(String name, double volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName(){
        return name;
    }

    public double getVolume(){
        return volume;
    }
}
