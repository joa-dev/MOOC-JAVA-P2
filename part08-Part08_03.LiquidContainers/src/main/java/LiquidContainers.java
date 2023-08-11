
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.print("> ");
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (amount > 0) {
                if (command.equals("add")) {
                    if (first + amount <= 100) {
                        first += amount;
                    } else if (first + amount > 100) {
                        first = 100;
                    }
                }

                if (command.equals("move")) {
                    if (first - amount >= 0) {
                        second += amount;
                        if (second > 100) {
                            second = 100;
                        }
                        first -= amount;
                    } else if (first - amount < 0) {
                        second += first;
                        if (second > 100) {
                            second = 100;
                        }
                        first = 0;
                    }
                }
                
                if (command.equals("remove")) {
                    if (second - amount >= 0) {
                        second -= amount;
                    } else if (second - amount < 0) {
                        second = 0;
                    }
                }
            }

        }
    }

}
