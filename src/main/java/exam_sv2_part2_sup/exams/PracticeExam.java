package exam_sv2_part2_sup.exams;

import java.util.List;

public class PracticeExam extends Exam {

    public PracticeExam(long studentId, String topic, List<Integer> points) {
        super(studentId, topic);
        int maxPoints = calculateMaxPoints(points);
        validateMaxPoints(maxPoints);
        setMaxPoints(maxPoints);
    }

    private void validateMaxPoints(int maxPoints) {
        if (maxPoints < 10 || maxPoints > 150) {
            throw new IllegalArgumentException("Maximum points should be between 10 and 150! Actual:" + maxPoints);
        }
    }

    private int calculateMaxPoints(List<Integer> points) {
        int sum = 0;
        for (Integer i : points) {
            sum += i;
        }
        return sum;
    }

    @Override
    void calculateExamResult(int actualPoints) {
        double examResult = 100.0 * actualPoints / getMaxPoints();
        if (examResult < 51) {
            setExamResult(ExamResult.NOT_PASSED);
        } else if (examResult < 76) {
            setExamResult(ExamResult.OK);
        } else {
            setExamResult(ExamResult.PERFECT);
        }
    }
}
