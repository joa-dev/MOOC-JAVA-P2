
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        
        List<Integer> numbers = new ArrayList<>();
        
        while(true) {
            String input = scanner.nextLine();
            
            if(input.equals("end")) {
                break;
            }
            
            numbers.add(Integer.valueOf(input));
        }
        
        System.out.println(positive(numbers));
        
    }
    
    public static List<Integer> positive(List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> number > 0)
                //.collect(Collectors.toList());
                .collect(Collectors.toCollection(ArrayList::new));
    }

}
