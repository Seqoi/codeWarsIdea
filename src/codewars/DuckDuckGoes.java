package codewars;

public class DuckDuckGoes {
    public static String duckDuckGoose(Player[] players, int goose) {
        while (goose > players.length){
            goose = goose - players.length;
        }
        return players[goose - 1].name;
    }

}
