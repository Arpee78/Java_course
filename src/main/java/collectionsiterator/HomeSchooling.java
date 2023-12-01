package collectionsiterator;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HomeSchooling {

    private List<OnlineLesson> lessons = new ArrayList<>();

    public List<OnlineLesson> getLessons() {
        return new ArrayList<>(lessons);
    }

    public void addNewLesson(OnlineLesson lesson) {
        int index = lessons.size();
        for (int i = 0; i < lessons.size() - 1; i++) {
            LocalDateTime before = lessons.get(i).getStartTime();
            LocalDateTime after = lessons.get(i + 1).getStartTime();
            LocalDateTime lessonTime = lesson.getStartTime();
            if (before.isBefore(lessonTime) && after.isAfter(lessonTime)) {
                index = i + 1;
            }
        }
        lessons.add(index, lesson);
    }

    public List<OnlineLesson> getLessonsByTitle(String title) {
        List<OnlineLesson> result = new ArrayList<>();
        Iterator<OnlineLesson> iterator = lessons.iterator();
        while(iterator.hasNext()){
            OnlineLesson lesson = iterator.next();
            if (lesson.getLessonTitle().equals(title)){
                result.add(lesson);
            }
        }
        return result;
    }

    public void removeLesson(LocalDateTime startTime) {
        for (Iterator<OnlineLesson> i = lessons.iterator(); i.hasNext();) {
            OnlineLesson lesson = i.next();
            if (lesson.getStartTime().equals(startTime)) {
                i.remove();
            }
        }
    }
}
