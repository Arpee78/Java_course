package exam_sv3_part1_sup.teams;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Team {

    private String teamName;
    private List<Player> players = new ArrayList<>();

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public List<Player> getPlayers() {
        return new ArrayList<>(players);
    }

    public boolean addPlayer(Player player) {
        if (players.size() < 18) {
            players.add(player);
            return true;
        }
        return false;
    }

    public int countBirthBefore(LocalDate date) {
        int sum = 0;
        for (Player actual : players) {
            if (actual.getDateOfBirth().isBefore(date)) {
                sum++;
            }
        }
        return sum;
    }

    public boolean isPlayerWithNameInTeam(String name) {
        for (Player actual: players ) {
            if (actual.getName().equals(name)){
                return true;
            }
        }
        return false;
    }

}
