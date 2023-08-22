package introexceptiontrycatchtrace;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Winner {

    private List<String> names = new ArrayList<>();

    public List<String> getNames() {
        return names;
    }

    public void addName(String name){
        names.add(name);
    }

    public String getWinner() {
        Random random = new Random();
        int winnerIndex = random.nextInt(names.size());
        String winner = names.get(winnerIndex);
        return winner.toUpperCase();
    }

}
