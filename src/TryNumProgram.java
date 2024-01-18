import java.util.Random;
import java.util.Scanner;

public class TryNumProgram {

    public static void main(String[] args) {

            Random random = new Random();
            int numberToGuess = random.nextInt(11);
            int attempts = 0;
            int maxAttempts = 4;

            System.out.println("Відгадайте число від 0 до 10.");

            Scanner scanner = new Scanner(System.in);

            while (attempts < maxAttempts) {
                System.out.print("Ваше число: ");
                try {
                    int guess = scanner.nextInt();
                    if (guess < numberToGuess) {
                        System.out.println("Загадане число більше.");
                    } else if (guess > numberToGuess) {
                        System.out.println("Загадане число менше.");
                    } else {
                        System.out.println("Вітаю! Ви вгадали число!");
                        return;
                    }
                    attempts++;
                } catch (Exception e) {
                    System.out.println("Будь ласка, введіть ціле число.");
                    scanner.nextLine();
                }
            }

            System.out.println("Ви вичерпали всі спроби. Загадане число було " + numberToGuess);
        }
    }









