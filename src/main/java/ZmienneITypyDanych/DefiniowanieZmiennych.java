package ZmienneITypyDanych;

public class DefiniowanieZmiennych {
    public static void main(String[] args) {
        double a = 2.532;
        double b = 5;
        double c = 5;

        double add = add(a, b, c);
        System.out.printf("%.2f + %.2f + %.2f = %.2f", 3.0, 2.5, 6.4, (3.0 + 2.5 + 6.4));

        System.out.printf("\n%f + %f + %f = %.2f", a, b, c, add);
    }

    public static double add(double a, double b, double c){
        return a + b + c;
    };


}
