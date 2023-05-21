//ex3 c)
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DynamicArrayTest02 {
    public static void main(String[] args) {
        List<Integer> lineLengths = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("textfile.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineLengths.add(line.length());
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        int size = lineLengths.size();
        if (size >= 2) {
            Collections.sort(lineLengths);
            Integer max = lineLengths.get(size - 1);
            Integer secondMax = lineLengths.get(size - 2);
            System.out.println("The numbers of the two longest lines: " + max + ", " + secondMax);
        }
    }
}
