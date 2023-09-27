package exam_sv3_part2_sup.abstractions;

import java.util.ArrayList;
import java.util.List;

public class StreamingPlatform {

    private List<Content> contents = new ArrayList<>();

    public List<Content> getContents() {
        return new ArrayList<>(contents);
    }

    public void addContent(Content content) {
        contents.add(content);
    }

    public Content findLongestContent() {
        if (contents.isEmpty()) {
            throw new IllegalStateException("Streaming platform is empty!");
        }
        Content longest = contents.get(0);
        for (Content c : contents) {
            if (c.getLength()>longest.getLength()){
                longest = c;
            }
        }
        return longest;
    }
}
