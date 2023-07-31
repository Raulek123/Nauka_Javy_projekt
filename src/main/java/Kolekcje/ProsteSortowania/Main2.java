package Kolekcje.ProsteSortowania;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        Player playerOne = new Player("Zorikson", 45);
        Player playerTwo = new Player("Ciasny", 30);
        Player playerThree = new Player("Peja", 50);

        Player[] players = {playerOne, playerTwo, playerThree};

        List<Player> playerList = new java.util.ArrayList<>(Arrays.stream(players).toList());
        playerList.sort(Comparator.comparing(Player::getScore).reversed());
        playerList.sort(Comparator.comparing(Player::getPseudonim));
        playerList.forEach(System.out::println);

    }
}
