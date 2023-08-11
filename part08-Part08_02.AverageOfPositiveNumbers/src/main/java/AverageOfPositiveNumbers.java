
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 0;

        while (true) {
            int number = scanner.nextInt();
            if (number == 0 && counter > 0) {
                System.out.println(sum * 1.0 / counter);
                break;
            } else if (number == 0 && counter == 0) {
                System.out.println("Cannot calculate the average");
                break;
            } else if (number < 0) {
                continue;
            } else {
                sum += number;
                counter++;
            }

        }
    }
}
