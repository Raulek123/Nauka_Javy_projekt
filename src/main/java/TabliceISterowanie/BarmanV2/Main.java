package TabliceISterowanie.BarmanV2;

public class Main {
    public static void main(String[] args) {
        Barman barman = new Barman();
        Drink drink = barman.createDrink();
        barman.printDrink(drink);
    }
}
