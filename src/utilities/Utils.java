package utilities;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Utils {
    public static List<String> readInput(String filename) throws IOException {
        Path fullPath = Path.of("src", "input", filename);
        String content = Files.readString(fullPath);
        return content.trim().lines().toList();
    }
}
