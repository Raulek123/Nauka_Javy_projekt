package Kolekcje.ProsteSortowania;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Player playerOne = new Player("Zorikson", 45);
        Player playerTwo = new Player("Ciasny", 30);
        Player playerThree = new Player("Peja", 50);

        Player[] players = {playerOne, playerTwo, playerThree};
        System.out.println("Nieposortowana:");
        for (Player player : players) {
            System.out.println(player);
        }

        System.out.println();

        Arrays.sort(players);
        System.out.println("Posortowana:");
        for (Player player : players) {
            System.out.println(player);
        }

        System.out.println();

        Arrays.sort(players, new Player.PlayerNameComparator());
        System.out.println("Posortowana po pseudonimie:");
        for (Player player : players) {
            System.out.println(player);
        }
    }
}
