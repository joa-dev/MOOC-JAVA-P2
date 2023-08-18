
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();
        while(true) {
            String line = scanner.nextLine();
            
            if (line.equals("")) {
                break;
            }
            
            inputs.add(line);
        }
        
        inputs.stream()
                .forEach(line -> System.out.println(line));
    }
}
