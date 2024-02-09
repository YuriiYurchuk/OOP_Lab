import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        Main program = new Main();
        program.run();
    }

    private void run() {
        double x = 1.426;
        double y = -1.220;
        double z = 3.5;
        double resultA = calculateA(x, y);
        double resultB = calculateB(z);
        print(resultA, resultB);
        printDateTime();
    }

    private double calculateA(double x, double y) {
        return (2 * Math.cos(x - Math.PI / 6)) / (0.5 + Math.pow(Math.sin(y), 2));
    }

    private double calculateB(double z) {
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