package methodvarargs.examstats;

public class ExamStats {

    private int maxPoints;

    public ExamStats(int maxPoints) {
        this.maxPoints = maxPoints;
    }

    public int getNumberOfTopGrades(int limitInPercent, int... results) {
        validateResults(results);
        int count = 0;
        int limit = maxPoints * limitInPercent / 100;

        for (int r : results) {
            if (r >= limit) {
                count++;
            }
        }
        return count;
    }

    private void validateResults(int[] results) {
        if (results == null || results.length == 0) {
            throw new IllegalArgumentException("Number of results must not be empty!");
        }
    }

    public boolean hasAnyFailed(int limitInPercent, int... results) {
        validateResults(results);
        int limit = maxPoints * limitInPercent / 100;
        for (int r : results) {
            if (r<limit){
                return true;
            }
        }
        return false;
    }
}
