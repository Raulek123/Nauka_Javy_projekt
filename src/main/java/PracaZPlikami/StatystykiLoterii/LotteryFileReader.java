package PracaZPlikami.StatystykiLoterii;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class LotteryFileReader {

    List<Result> readResultsFromFile(String fileName) throws FileNotFoundException {
        List<Result> results = new ArrayList<>();
        Scanner scanner = new Scanner(new File(fileName));
        scanner.nextLine(); //pomijamy nagłówek pliku
        while (scanner.hasNextLine()) {
            String csvLine = scanner.nextLine();
            Result result = Result.fromCsv(csvLine);
            results.add(result);
        }
        return results;
    }

}