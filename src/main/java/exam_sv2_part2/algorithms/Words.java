package exam_sv2_part2.algorithms;

import java.util.ArrayList;
import java.util.List;

public class Words {

    private List<String> words = new ArrayList<>();

    public List<String> getWords() {
        return words;
    }

    public void addWord(String word){
        if (!word.equals(word.toLowerCase())){
            throw new IllegalArgumentException("Word should be lower case!");
        }

        if (word.contains(" ")){
            throw new IllegalArgumentException("It should be one word!");
        }
        words.add(word);
    }

    public boolean isThereAWordTwice(){
        for (int i = 0; i < words.size()-1; i++) {
            for (int j = i+1; j < words.size(); j++) {
                if (words.get(i).equals(words.get(j))){
                    return true;
                }
            }
        }
        return false;
    }
}
