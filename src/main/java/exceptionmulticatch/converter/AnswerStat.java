package exceptionmulticatch.converter;

public class AnswerStat {

    private BinaryStringConverter binaryStringConverter;

    public AnswerStat(BinaryStringConverter binaryStringConverter) {
        this.binaryStringConverter = binaryStringConverter;
    }

    public BinaryStringConverter getBinaryStringConverter() {
        return binaryStringConverter;
    }

    public boolean[] convert(String string) {
        try {
            return binaryStringConverter.binaryStringToBooleanArray(string);
        } catch (NullPointerException | IllegalArgumentException e) {
            throw new InvalidBinaryStringException("", e);
        }
    }

    public int answerTruePercent(String answers) {
        int trueValue = 0;
        int falseValue = 0;
        boolean[] array = convert(answers);
        for (Boolean b : array) {
            if (b==true){
                trueValue++;
            } else{
                falseValue++;
            }
        }

        return (int) Math.round(100.0 * trueValue/(trueValue+falseValue));
    }
}
