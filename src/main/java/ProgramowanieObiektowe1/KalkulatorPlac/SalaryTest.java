package ProgramowanieObiektowe1.KalkulatorPlac;

public class SalaryTest {
    public static void main(String[] args) {
        Employee employee = new Employee("Jan", "Kowalski", 3000);
        PaymentCalculator paymentCalculator = new PaymentCalculator();
        System.out.println(paymentCalculator.nettoYearPayment(employee));
        System.out.println(paymentCalculator.bruttoYearPayment(employee));
    }
}
