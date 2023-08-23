package exam_sv3_part1_sup.teams;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class League {

    private List<Team> teams;

    public League(List<Team> teams) {
        this.teams = teams;
    }

    public List<Team> getTeams() {
        return new ArrayList<>(teams);
    }

    public Team findTeamWithPlayer(String name) {

        for (Team actualTeam : teams) {
            if (actualTeam.isPlayerWithNameInTeam(name)) {
                return actualTeam;
            }
        }
        return null;
    }
}
