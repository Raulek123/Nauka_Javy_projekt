package PracaZPlikami.StatystykiLoterii;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Lottery {
    public List<Integer> list = new ArrayList<>();
    public Map<Integer, Integer> maps = new HashMap<>();

    public List<Integer> getNumbers(String fileName, int winningNumbers) throws IOException {
        List<Integer> numbers = new ArrayList<>();
        BufferedReader bf = new BufferedReader(new FileReader(fileName));
        String line;
        bf.readLine();
        while ((line = bf.readLine()) != null) {
            String[] splitSeparator = line.split(",");
            String[] split = splitSeparator[winningNumbers].split(" ");
            for (int i = 0; i < split.length; i++) {
                numbers.add(Integer.valueOf(split[i]));
            }
        }
        return numbers;
    }

    public void getMapsNumber(List<Integer> numbers, int famous) {
        for (Integer number : numbers) {
            maps.put(number, maps.getOrDefault(number, 0) + 1);
        }
        maps.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .limit(famous)
                .forEach(System.out::println);
    }
}
