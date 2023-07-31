package Kolekcje.Magazyn;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileCsv {

    public List<String> read(String name) throws IOException {
        List<String> result = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(name));
        String line;
        while ((line = bufferedReader.readLine()) != null){
            result.add(line);
        }
        return result;
    }
}

