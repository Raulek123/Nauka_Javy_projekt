package Kolekcje.Magazyn;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        ReadFileCsv readFileCsv = new ReadFileCsv();
        List<String> list = readFileCsv.read("src/main/resources/data.csv");
        Map<String, Integer> maps = new HashMap<>();
        List<String[]> elements = new ArrayList<>();
        for (String element : list) {
            String[] split = element.split(";");
            elements.add(split);
        }

        for (String[] strings : elements) {
            String itemName = strings[0];
            int quantity = Integer.parseInt(strings[1]);
            maps.put(itemName, quantity);
        }

        for (Map.Entry<String, Integer> entry : maps.entrySet()) {
            String itemName = entry.getKey();
            int quantity = entry.getValue();
            double round = quantity / 10.0;
            int iloscGwiazdek = (int) Math.round(round);
            String gwiazdki = getGwiazdki(iloscGwiazdek);

            String formattedLine = String.format("%-40s (%d) %s", itemName, quantity, gwiazdki);
            System.out.println(formattedLine);
        }
    }

    private static String getGwiazdki(int iloscGwiazdek) {
        String name = "*";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iloscGwiazdek; i++) {
            sb.append(name);
        }
        return sb.toString();
    }
}
