import java.util.InputMismatchException;
import java.util.Scanner;

public class zavd3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            try {
                System.out.print("Введіть розмір масиву: ");
                int size = scanner.nextInt();
                double[] array = new double[size];

                for (int i = 0; i < size; i++) {
                    System.out.print("Введіть значення для елемента " + i + ": ");
                    array[i] = scanner.nextDouble();
                }

                System.out.println("Введений масив:");
                printArray(array);

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

    private static void printArray(double[] array) {
        for (double num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}