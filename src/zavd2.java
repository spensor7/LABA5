import java.util.InputMismatchException;
import java.util.Scanner;

public class zavd2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            try {
                System.out.println("Введіть три числа:");
                System.out.print("Число 1: ");
                double num1 = scanner.nextDouble();
                System.out.print("Число 2: ");
                double num2 = scanner.nextDouble();
                System.out.print("Число 3: ");
                double num3 = scanner.nextDouble();

                double min = findMinimum(num1, num2, num3);
                System.out.println("Найменше число: " + min);

                System.out.print("Бажаєте продовжити? (Так/Ні): ");
                String choice = scanner.next();
                if (!choice.equalsIgnoreCase("Так")) {
                    exit = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Введено неправильне значення. Спробуйте ще раз.");
                scanner.nextLine(); // Очистка буфера вводу
            }
        }
        scanner.close();
    }

    private static double findMinimum(double num1, double num2, double num3) {
        return Math.min(Math.min(num1, num2), num3);
    }

    public void FQ() {
    }
}