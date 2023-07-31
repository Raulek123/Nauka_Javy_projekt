package Kolekcje.Restauracja;

public enum Dish {
    PIZZA_MARGHERITA (1, "Pizza Margherita", 24.99),
    PIZZA_MAFIOZO (2, "Pizza Mafiozo", 29.99),
    SPAGHETTI_BOLOGNESE (3, "Spaghetti Bolognese", 31.99);

    private final int id;
    private final String description;
    private final double price;

    Dish(int id, String description, double price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
}
