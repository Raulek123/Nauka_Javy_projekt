package TabliceISterowanie.PrecyzjaLiczb;

import java.math.BigDecimal;
import java.util.Scanner;

public class PrecyzjaLiczb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        BigDecimal number = sc.nextBigDecimal();

        if (number.compareTo(BigDecimal.valueOf(0)) > 0) {
            for (BigDecimal i = BigDecimal.ZERO; i.compareTo(number) <= 0; i = i.add(BigDecimal.valueOf(0.1))) {
                if (i.compareTo(number) < 0) {
                    System.out.print(i + ", ");
                } else {
                    System.out.print(i + ".");
                }
            }
        } else {
            for (BigDecimal i = BigDecimal.ZERO; i.compareTo(number) >= 0; i = i.subtract((BigDecimal.valueOf(0.1)))) {
                if (i.compareTo(number) > 0) {
                    System.out.print(i + ", ");
                } else {
                    System.out.print(i + ".");
                }
            }
        }
    }
}
