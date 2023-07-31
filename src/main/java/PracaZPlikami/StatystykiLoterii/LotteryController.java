package PracaZPlikami.StatystykiLoterii;

import java.io.IOException;
import java.util.List;

public class LotteryController {
    public static void main(String[] args) throws IOException {
        Lottery lottery = new Lottery();
        List<Integer> numbers = lottery.getNumbers("C:\\AIdeaProjects\\Java\\PonowienieLekcji\\Cwiczenia\\ZadaniaZJava\\src\\main\\resources\\Lottery.csv", 2);
        lottery.getMapsNumber(numbers, 3);
    }
}
