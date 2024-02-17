import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    private double x = 1.426;
    private double y = -1.220;
    private double z = 3.5;
    private final Scanner scanner;

    public static void main(String[] args) {
        Main program = new Main();
        program.run();
    }

    public Main() {
        scanner = new Scanner(System.in);
    }

    private void run() {
        print(calculateA(), calculateB());
        printDateTime();
        System.out.println("Змінити значення x, y, та z? (1 - Так, 0 - Ні): ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.print("x = ");
            x = scanner.nextDouble();
            System.out.print("y = ");
            y = scanner.nextDouble();
            System.out.print("z = ");
            z = scanner.nextDouble();
            print(calculateA(), calculateB());
        }
    }

    private double calculateA() {
        return (2 * Math.cos(x - Math.PI / 6)) / (0.5 + Math.pow(Math.sin(y), 2));
    }

    private double calculateB() {
        return 1 + z * z / (3 + z * z / 5);
    }

    private void print(double resultA, double resultB) {
        System.out.println("A = " + resultA);
        System.out.println("B =  " + resultB);
    }

    private void printDateTime() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Поточна дата: " + formattedDateTime);
    }
}
