package ProgramowanieObiektowe1.Barman;

public class Drink {
    private Ingredient ingredientOne;
    private Ingredient ingredientTwo;
    private Ingredient ingredientThree;
    private double sum = 0;

    public Drink(Ingredient ingredientOne, Ingredient ingredientTwo, Ingredient ingredientThree) {
        this.ingredientOne = ingredientOne;
        this.ingredientTwo = ingredientTwo;
        this.ingredientThree = ingredientThree;
    }

    public Ingredient getIngredientOne() {
        return ingredientOne;
    }

    public void setIngredientOne(Ingredient ingredientOne) {
        this.ingredientOne = ingredientOne;
    }

    public Ingredient getIngredientTwo() {
        return ingredientTwo;
    }

    public void setIngredientTwo(Ingredient ingredientTwo) {
        this.ingredientTwo = ingredientTwo;
    }

    public Ingredient getIngredientThree() {
        return ingredientThree;
    }

    public void setIngredientThree(Ingredient ingredientThree) {
        this.ingredientThree = ingredientThree;
    }


    public String sumQuantity() {
        sum = ingredientOne.getQuantity() + ingredientTwo.getQuantity() + ingredientThree.getQuantity();
        return (ingredientOne.getQuantity() / sum) + ", " + (ingredientTwo.getQuantity() / sum) +
                ", " + (ingredientThree.getQuantity() / sum);
    }

    @Override
    public String toString() {
        return ingredientOne.getName() + ", " + ingredientTwo.getName() + ", " + ingredientThree.getName()
                + " w porcjach " + sumQuantity() + ". Jego pojemność to: " + sum + " ml";
    }
}
