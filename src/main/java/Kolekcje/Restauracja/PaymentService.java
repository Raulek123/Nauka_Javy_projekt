package Kolekcje.Restauracja;

public class PaymentService {

    public double maintenanceCost(double orderPrice) {
        double cost = 0;
        if(orderPrice < 100){
            cost = orderPrice * 0.15;
        } else {
            cost = orderPrice * 0.10;
        }
        return cost;
    }
}
