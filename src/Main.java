public class Main {
    public static void main(String[] args) {

        HotDrink firstDrink = new HotDrink("Кофе", 0.3, 65, 100);
        HotDrink secondDrink = new HotDrink("Чай", 0.2,85, 80);
        HotDrink thirdDrink = new HotDrink("Какао", 0.3, 70, 130);
        HotDrinksVendingMachine hdvm = new HotDrinksVendingMachine();
        hdvm.addHotDrinks(firstDrink);
        hdvm.addHotDrinks(secondDrink);
        hdvm.addHotDrinks(thirdDrink);

        System.out.println(hdvm.getHotDrinks());

        hdvm.shopHotDrinks();

    }
}