package util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileHandler {
    public static String[][] parseWithSpaces(String filePath) throws IOException {
        String inputFileString = new String(Files.readAllBytes(Paths.get("store")));
        String[] lines = inputFileString.split("\n");
        String[][] result = new String[lines.length - 1][];
        for(int i = 0; i < lines.length-1; i++)
            result[i] = lines[i+1].split("\\s+");
        return result;
    }
}
