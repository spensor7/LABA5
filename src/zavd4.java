import java.util.InputMismatchException;
import java.util.Scanner;

public class zavd4 {

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

                double max = findMax(array);
                System.out.println("Найбільше число в масиві: " + max);

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

    private static double findMax(double[] array) {
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}