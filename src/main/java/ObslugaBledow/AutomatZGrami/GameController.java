package ObslugaBledow.AutomatZGrami;

import java.util.Scanner;

public class GameController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GameMachine gameMachine = new GameMachine();
        System.out.println("Podaj tytuł gry");
        String gameTitle = sc.nextLine();
        System.out.println("Wpłać pieniądze");
        int pay = sc.nextInt();
        sc.nextLine();
        try {
            Game buy = gameMachine.buy(gameTitle, pay);
            result(pay, buy);
        }catch (GameNotFoundException | NotEnoughMoneyException e){
            System.err.println(e.getMessage());
        }
    }

    private static void result(int pay, Game buy) {
        int sum = buy.getPrice() - pay;
        if (sum == 0) {
            System.out.println("Odbierz grę: " + buy.getName());
        } else if (sum < 0) {
            System.out.println("Odbierz grę: " + buy.getName());
            System.out.println("Odbierz resztę: " + Math.abs(sum));
        } else {
            throw new NotEnoughMoneyException("The game cost is " + buy.getPrice() + ", you paid only " + pay);
        }
    }
}
