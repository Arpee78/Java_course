package stringseparate;

import java.util.List;

public class Codes {

    public String getCodesStartWithLetter(List<String> codes) {
        StringBuilder sb = new StringBuilder();

        for (String c: codes) {
            if (Character.isLetter(c.charAt(0))){
                if (!sb.isEmpty()){
                    sb.append(", ");
                }
                sb.append(c);
            }
        }
        return "Betűvel kezdődő kódok: " +  sb;
    }
}
