package TabliceISterowanie.Romb;

import java.util.Scanner;

public class Romb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą");
        int number = sc.nextInt();
        String znak = "*";

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < number; k++) {
                System.out.print(znak);
            }
            System.out.println();
        }
    }
}
