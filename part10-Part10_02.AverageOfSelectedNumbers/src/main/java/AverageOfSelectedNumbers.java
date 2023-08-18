
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        System.out.println("Input numbers, type \"end\" to stop.");
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }

            list.add(input);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String input = scanner.nextLine();
        double average = 0;
        
        if (input.equals("p")) {
            average = list.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(number -> number > 0)
                    .average()
                    .getAsDouble();
            
            System.out.println("Average of the positive numbers: " + average);
            
        } else if (input.equals("n")) {
            average = list.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(number -> number < 0)
                    .average()
                    .getAsDouble();
            
            System.out.println("Average of the negative numbers: " + average);
        }
    }
}
