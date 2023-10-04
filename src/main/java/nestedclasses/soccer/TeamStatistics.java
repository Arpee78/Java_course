package nestedclasses.soccer;

public class TeamStatistics {

    private String teamName;
    private Games games;
    private int goalsFor;
    private int goalsAgainst;
    private int points;

    public TeamStatistics(String teamName) {
        this.teamName = teamName;
        this.games = new Games();
    }


    public void played(int plusGoalsFor, int plusGoalsAgainst) {
        games.played++;
        if (plusGoalsFor > plusGoalsAgainst) {
            games.won++;
            points += 3;
        } else if (plusGoalsFor < plusGoalsAgainst) {
            games.lost++;
        } else {
            games.tied++;
            points++;
        }
        goalsFor += plusGoalsFor;
        goalsAgainst += plusGoalsAgainst;
    }

    @Override
    public String toString() {
        return teamName + " " +
                games + " " +
                games.won + " " +
                games.tied + " " +
                games.lost + " " +
                goalsFor + " - " +
                goalsAgainst + ", " +
                points;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getPlayed() {
        return games.played;
    }

    public int getWon() {
        return games.won;
    }

    public int getTied() {
        return games.tied;
    }

    public int getLost() {
        return games.lost;
    }

    public int getGoalsFor() {
        return goalsFor;
    }

    public int getGoalsAgainst() {
        return goalsAgainst;
    }

    public int getPoints() {
        return points;
    }


    public static class Games {

        private int played;
        private int won;
        private int tied;
        private int lost;
    }

}
