package Kolekcje.Restauracja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {
    private List<Dish> orderList = new ArrayList<>();
    private List<Integer> numbersOrder = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    private PaymentService paymentService = new PaymentService();

    public void getOrder() {
        getMenu();
        loadingOrder();
        summary();
    }

    private void summary() {
        double costMaintenance = paymentService.maintenanceCost(valueOrders());
        double sum = costMaintenance + valueOrders();
        System.out.printf("Do zapłaty: %.2f, w tym: \n", sum);
        System.out.println("Koszt dań: " + valueOrders());
        System.out.printf("Koszt obsługi: %.2f", costMaintenance);
    }

    public double valueOrders() {
        double sum = 0;
        for (Dish dish : Dish.values()) {
            if (numbersOrder.contains(dish.getId())) {
                sum += dish.getPrice();
            }
        }
        return sum;
    }

    private void loadingOrder() {
        System.out.println("Zamów wybrane potrawy, wymieniając ich numery po przecinku:");
        String line = sc.nextLine();
        String[] split = line.split(",");
        for (String number : split) {
            numbersOrder.add(Integer.parseInt(number.trim()));
        }
    }

    private static void getMenu() {
        System.out.println("Witamy w naszej restauracji");
        System.out.println("Dzisiejsze Menu:");
        for (Dish value : Dish.values()) {
            System.out.println(value.getId() + ", " + value.getDescription() + ", " + value.getPrice() + "zł");
        }
    }
}
