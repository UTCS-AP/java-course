package util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileHandler {
    private static String storePath = "store";

    public static String[][] parseWithSpaces(String filePath) throws IOException {
        String inputFileString = new String(Files.readAllBytes(Paths.get(FileHandler.storePath)));
        String[] lines = inputFileString.split("\n");
        String[][] result = new String[lines.length - 1][];
        for(int i = 0; i < lines.length-1; i++)
            result[i] = lines[i+1].split("\\s+");
        return result;
    }

    public static void writeStore(String newStoreContent) throws IOException {
        Files.write(
                Paths.get(FileHandler.storePath), newStoreContent.getBytes(),
                StandardOpenOption.WRITE,
                StandardOpenOption.TRUNCATE_EXISTING
        );
    }
}
