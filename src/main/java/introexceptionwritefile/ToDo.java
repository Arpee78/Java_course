package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> todos = new ArrayList<>();
        System.out.println("Add meg az első todot: ");
        System.out.println("(Kilépés az \"x\" billentyűvel.)");

        String todo = scanner.nextLine();
        while (!todo.equals("x")) {
            todos.add(todo);
            todo = scanner.nextLine();
        }

        try {
            Files.write(Path.of("src/main/resources/todo.txt"),todos);
            System.out.println("A todos kiírása sikeres");
        } catch (IOException ioe){
            System.out.println("A todos kiírása sikertelen");
        }
    }
}
