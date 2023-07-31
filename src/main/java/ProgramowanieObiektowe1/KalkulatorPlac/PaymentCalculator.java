package ProgramowanieObiektowe1.KalkulatorPlac;

public class PaymentCalculator {
    private final static int MONTHS_OF_THE_YEAR = 12;
    private final static int COST_ZUS = 12000;
    private final static double INCOME_TAX = 0.2;

    public int nettoYearPayment(Employee employee) {
        return employee.getSalary() * MONTHS_OF_THE_YEAR;
    }

    public double bruttoYearPayment(Employee employee) {
        return  (MONTHS_OF_THE_YEAR * (employee.getSalary() + INCOME_TAX * employee.getSalary()) + COST_ZUS);
    }
}
