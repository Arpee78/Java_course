package exam_sv2_part2_sup.exams;

public class MultipleChoiceExam extends Exam {

    public static final double PASSING_PERCENT = 51.0;

    public MultipleChoiceExam(long studentId, String topic, int maxPoints) {
        super(studentId, topic, maxPoints);
    }

    public MultipleChoiceExam(long studentId, String topic) {
        super(studentId, topic);
    }

    @Override
    void calculateExamResult(int actualPoints) {
        checkActualPoint(actualPoints);
        if (100.0 * actualPoints / getMaxPoints() >= PASSING_PERCENT) {
            setExamResult(ExamResult.PASSED);
        } else {
            setExamResult(ExamResult.NOT_PASSED);
        }
    }

    private void checkActualPoint(int actualPoints) {
        if (actualPoints < 0 || actualPoints > getMaxPoints()) {
            throw new IllegalArgumentException("Wrong points");
        }
    }
}
