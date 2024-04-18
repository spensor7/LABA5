import java.util.Scanner;

public class zavd1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Введіть висоту та довжину вектора паралелограма:");
            System.out.print("Висота: ");
            double height = readDouble(scanner);
            System.out.print("Довжина вектора: ");
            double length = readDouble(scanner);

            double area = calculateParallelogramArea(height, length);
            System.out.println("Площа паралелограма: " + area);

            System.out.print("Бажаєте продовжити? (Так/Ні): ");
            String choice = scanner.next();
            if (!choice.equalsIgnoreCase("Так")) {
                exit = true;
            }
        }
        scanner.close();
    }

    private static double readDouble(Scanner scanner) {
        while (true) {
            try {
                return Double.parseDouble(scanner.next());
            } catch (NumberFormatException e) {
                System.out.println("Введено неправильне значення. Спробуйте ще раз.");
            }
        }
    }

    private static double calculateParallelogramArea(double height, double length) {
        return height * length;
    }
}