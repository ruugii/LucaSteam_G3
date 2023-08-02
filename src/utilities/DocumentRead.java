package utilities;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DocumentRead {
    public static ArrayList<String> read (String path) {
        Path path1 = Paths.get(path);
        System.out.println();
        ArrayList<String> ToReturn = new ArrayList<>();
        try {
            List<String> line = Files.readAllLines(path1, StandardCharsets.UTF_8);
            for (int i = 0; i < line.size(); i++) {
                ToReturn.add(line.get(i));
            }
        } catch (IOException ex){
            ex.printStackTrace();
            System.err.println("I/O error: " + ex);
        }
        return ToReturn;
    }
}
