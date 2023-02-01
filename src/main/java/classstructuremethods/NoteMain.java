package classstructuremethods;

public class NoteMain {

    public static void main(String[] args) {

        Note note = new Note();
        note.setName("Joe");
        note.setTopic("Jó téma");
        note.setText("Jó szöveg");
        System.out.println(note.getNoteText());
    }
}
