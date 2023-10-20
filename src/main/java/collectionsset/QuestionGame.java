package collectionsset;

import java.util.*;

public class QuestionGame {

    private List<RightAnswer> rightAnswers;

    public QuestionGame(List<RightAnswer> rightAnswers) {
        this.rightAnswers = rightAnswers;
    }

    public List<RightAnswer> getRightAnswers() {
        return new ArrayList<>(rightAnswers);
    }

    public Set<String> drawWinners() {
        Set<String> winners = new HashSet<>();

        while (winners.size() < 5) {
            if (rightAnswers.isEmpty()) {
                throw new IllegalArgumentException("Not enough right answers!");
            }
            int number = new Random().nextInt(rightAnswers.size());
            winners.add(rightAnswers.get(number).getNameOfSolver());
            rightAnswers.remove(number);
        }
        return winners;
    }

}
