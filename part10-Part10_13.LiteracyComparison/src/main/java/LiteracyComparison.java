
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {

    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<>();
        try {
            Files.lines(Paths.get("literacy.csv")).forEach(line -> lines.add(line));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        lines.stream()
                .map(line -> line.split(","))
                .sorted((x, y) -> x[5].compareTo(y[5]))
                .forEach(parts -> System.out.println(parts[3] + " (" + parts[4] + ")," + parts[2].replace(" (%)", "") + ", " + parts[5]));
    }
}
