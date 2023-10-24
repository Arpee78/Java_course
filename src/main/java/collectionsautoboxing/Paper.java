package collectionsautoboxing;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Paper {

    private Map<String, Integer> paper = new HashMap<>();

    public Map<String, Integer> getPaper() {
        return new HashMap<>(paper);
    }

    public void putFurtherPaper(String className, int kilograms) {
        if (!paper.containsKey(className)) {
            paper.put(className, 0);
        }
        paper.put(className, paper.get(className).intValue() + kilograms);
    }

    public String getWinnerClass() {
        String winner = "";
        int winnerValue = Integer.MIN_VALUE;
        for (String s : paper.keySet()) {
            if (paper.get(s) > winnerValue) {
                winnerValue = paper.get(s);
                winner = s;
            }
        }
        return winner;
    }

    public int getTotalWeight() {
        int result = 0;
        for (Integer i : paper.values()) {
            result += i;
        }
        return result;
    }
}
