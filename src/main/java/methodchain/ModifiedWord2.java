package methodchain;

public class ModifiedWord2 {

    public String modify(String word) {
        String result = word.toUpperCase().substring(0,1).concat("x").concat(word.toUpperCase().substring(2,3)).concat("y");
        return result;
    }
}
