package ProgramowanieObiektowe1.Barman;

public class Barman {

    public Drink createDrink(String nameOne, int quantityOne, String nameTwo, int quantityTwo,
                             String nameThree, int quantityThree) {
        return new Drink(new Ingredient(nameOne, quantityOne), new Ingredient(nameTwo, quantityTwo),
                new Ingredient(nameThree, quantityThree));
    }

    public void printDrink(Drink drink) {
        System.out.println(drink);
    }
}
