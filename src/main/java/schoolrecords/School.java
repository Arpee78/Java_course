package schoolrecords;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class School {

    private List<Subject> subjects = new ArrayList<>();
    private List<Tutor> tutors = new ArrayList<>();

    public School(Path path) {
        readLines(path);
    }

    private void readLines(Path path) {
        try {
            loadLines(Files.readAllLines(path));
        } catch (IOException ioe) {
            throw new IllegalStateException("Can't load subjects and tutors from file.", ioe);
        }
    }

    private void loadLines(List<String> lines) {
        for (String s : lines) {
            String[] parts = s.split(";");
            loadSubject(parts[0]);
            loadTutor(parts[0], parts[1]);
        }
    }

    private void loadSubject(String subjectName) {
        for (Subject s : subjects) {
            if (s.getName().equals(subjectName)) {
                return;
            }
        }
        subjects.add(new Subject(subjectName));
    }

    private void loadTutor(String subjectName, String tutorName) {
        Tutor tutor = null;
        for (Tutor t : tutors) {
            if (t.getName().equals(tutorName)) {
                tutor = t;
            }
        }
        if (tutor==null){
            tutor = new Tutor(tutorName,new ArrayList<>());
            tutors.add(tutor);
        }
        if (!tutor.isTutorTeachingSubject(subjectName)){
            Subject subject = findSubjectByName(subjectName);
            tutor.addSubject(subject);
        }
    }

    public Tutor findTutorByName(String tutorName) {
        for (Tutor t : tutors) {
            if (t.getName().equals(tutorName)) {
                return t;
            }
        }
        throw new IllegalArgumentException("Can't find tutor with this name!");
    }

    public Subject findSubjectByName(String subjectName) {
        for (Subject s : subjects) {
            if (s.getName().equals(subjectName)) {
                return s;
            }
        }
        throw new IllegalArgumentException("Can't find subject with this name!");
    }
}
