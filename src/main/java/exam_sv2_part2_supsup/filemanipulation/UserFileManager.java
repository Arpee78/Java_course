package exam_sv2_part2_supsup.filemanipulation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class UserFileManager {

    private List<User> users = new ArrayList<>();

    public List<User> getUsers() {
        return new ArrayList<>(users);
    }

    public void readUsersFromFile(Path path) {
        try {
            processLines(Files.readAllLines(path));
        } catch (IOException e) {
            throw new IllegalStateException("Can't read file!", e);
        }
    }

    private void processLines(List<String> lines) {
        for (String s : lines) {
            String[] parts = s.split(" ");
            users.add(new User(parts[0], Integer.parseInt(parts[1]), parts[2]));
        }
    }

    public void writeMaleHumansToFile(Path path) {
        List<String> result = collectUsers();

        try {
            Files.write(path, result);
        } catch (IOException e) {
            throw new IllegalArgumentException("Cannot wrtie file", e);
        }
    }

    private List<String> collectUsers() {
        List<String> result = new ArrayList<>();
        for (User u : users) {
            String userNameInEmail = u.getEmail().split("@")[0].toLowerCase();
            if (u.getUserName().toLowerCase().equals(userNameInEmail)) {
                result.add(u.getUserName());
            }
        }
        return result;
    }
}
