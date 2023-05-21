//ex3 b)
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DynamicArrayTest {
    public static void main(String[] args) {
        DynamicArray<Integer> lineLengths = new DynamicArray<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("textfile.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineLengths.add(line.length());
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        int size = lineLengths.getSize();
        if (size >= 2) {
            Integer max = lineLengths.getMax();
            Integer secondMax = lineLengths.getSecondMax();
            if (max != null && secondMax != null) {
                System.out.println("The numbers of the two longest lines: " + max + ", " + secondMax);
            }
        }
    }
}
