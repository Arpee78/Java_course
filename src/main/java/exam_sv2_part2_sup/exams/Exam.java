package exam_sv2_part2_sup.exams;

public abstract class Exam {

    private long studentId;
    private String topic;
    private int maxPoints;

    private ExamResult examResult;

    public Exam(long studentId, String topic) {
        this(studentId,topic,100);
    }

    public Exam(long studentId, String topic, int maxPoints) {
        this.studentId = studentId;
        this.topic = topic;
        this.maxPoints = maxPoints;
    }

    public long getStudentId() {
        return studentId;
    }

    public String getTopic() {
        return topic;
    }

    public int getMaxPoints() {
        return maxPoints;
    }

    public void setMaxPoints(int maxPoints) {
        this.maxPoints = maxPoints;
    }

    public ExamResult getExamResult() {
        return examResult;
    }

    public void setExamResult(ExamResult examResult) {
        this.examResult = examResult;
    }

    abstract void calculateExamResult(int actualPoints);

}
