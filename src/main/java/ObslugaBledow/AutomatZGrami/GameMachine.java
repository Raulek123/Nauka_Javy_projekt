package ObslugaBledow.AutomatZGrami;

import java.util.Map;

public class GameMachine {
    private Map<String, Game> games = Map.of("GTA V", new Game("GTA V", 99),
            "Legend of Zelda", new Game("Legend of Zelda", 129),
            "Wiedźmin III", new Game("Wiedźmin III", 79));

    public Game buy(String gameTitle, int money) {
        for (Map.Entry<String, Game> entry : games.entrySet()) {
            if (entry.getKey().equalsIgnoreCase(gameTitle)) {
                return entry.getValue();
            }
        }
        throw new GameNotFoundException("Game not found: " + gameTitle);
    }
}
