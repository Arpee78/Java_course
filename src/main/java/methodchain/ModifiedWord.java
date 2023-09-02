package methodchain;

public class ModifiedWord {

    private String word = null;

    public void setWord(String word) {
        this.word = word;
    }

    public String modify(String word) {
        ModifiedWord modifiedWord = new ModifiedWord();
        modifiedWord.setWord(word);
        String result = modifiedWord.modifyFirst().modifySecond().modifyThird().modifyFourth().build();
        return result;
    }

    public ModifiedWord modifyFirst() {
        String newChar = String.valueOf(word.charAt(0)).toUpperCase();
        word = newChar + word.substring(1,4);
        return this;
    }

    public ModifiedWord modifySecond() {
        word = word.substring(0, 1) + "x" + word.substring(2,4);
        return this;
    }

    public ModifiedWord modifyThird() {
        String newChar = String.valueOf(word.charAt(2)).toUpperCase();
        word = word.substring(0, 2) + newChar + word.substring(2,4);
        return this;
    }

    public ModifiedWord modifyFourth() {
        word = word.substring(0, 3) + "y";
        return this;
    }

    public String build(){
        return word;
    }
}
