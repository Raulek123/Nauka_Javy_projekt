package TabliceISterowanie.BarmanV2;

import java.util.Scanner;

public class Barman {
    private int count;
    public Drink createDrink() {
        return new Drink(getUserComposition());
    }

    public void printDrink(Drink drink) {
        System.out.println("Drink składa się z " + count + " składników:");
        for (Ingredient ingredient : drink.getIngredients()) {
            System.out.println(ingredient.toString());
        }
    }

    private Ingredient[] getUserComposition() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ilość składników:");
        count = sc.nextInt();
        sc.nextLine();
        Ingredient[] composition = new Ingredient[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Podaj nazwę składnika:");
           String name = sc.nextLine();
            System.out.println("Podaj ilość składnika");
            int quantity = sc.nextInt();
            sc.nextLine();
            composition[i] = new Ingredient(name, quantity);
        }
        return composition;
    }
}
