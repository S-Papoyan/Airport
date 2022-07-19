package newProject.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileService {

    public static List<String> read(String path) throws IOException {

        return Files.readAllLines(Paths.get(path));
    }

    public static void write(String path, String text) throws IOException {

        Files.write(Path.of(path), text.getBytes(), StandardOpenOption.APPEND);

    }
}
