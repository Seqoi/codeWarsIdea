package codewars;

public class DuckDuckGoes {
    public static Player duckDuckGoose(Player[] players, int goose) {
        Player duckDuckCome = "";
        while (goose > players.length){
            goose = goose - players.length;
        }
             duckDuckCome = players[(goose - 1)];

        return duckDuckCome;
    }

}
