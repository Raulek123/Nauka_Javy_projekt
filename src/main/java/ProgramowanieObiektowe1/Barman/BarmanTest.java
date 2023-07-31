package ProgramowanieObiektowe1.Barman;

public class BarmanTest {
    public static void main(String[] args) {
        Barman barman = new Barman();
        Drink drink = barman.createDrink("Sok ananasowy", 100, "Likier Malibu",
                50, "Mleko kokosowe", 100);
        barman.printDrink(drink);
    }
}
