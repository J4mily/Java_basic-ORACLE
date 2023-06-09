public class JFo_8_Game {
    private static int gameIdCounter = 1;

    private int gameId;
    private int temperature;
    private JFo_8_Team awayTeam;
    private JFo_8_Team homeTeam;
    private int awayScore;
    private int homeScore;



    public int getGameId() {
        return this.gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public int getTemperature() {
        return this.temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public JFo_8_Team getAwayTeam() {
        return this.awayTeam;
    }

    public void setAwayTeam(JFo_8_Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public JFo_8_Team getHomeTeam() {
        return this.homeTeam;
    }

    public void setHomeTeam(JFo_8_Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public int getAwayScore() {
        return this.awayScore;
    }

    public void setAwayScore(int awayScore) {
        this.awayScore = awayScore;
    }

    public int getHomeScore() {
        return this.homeScore;
    }

    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }

    public JFo_8_Game(JFo_8_Team awayTeam, JFo_8_Team homeTeam, int awayScore, int homeScore, int temperature) {
        this.gameId = gameIdCounter++;
        this.awayTeam = awayTeam;
        this.homeTeam = homeTeam;
        this.awayScore = awayScore;
        this.homeScore = homeScore;
        this.temperature = temperature;
    }

    // Getters

    // ...
}
