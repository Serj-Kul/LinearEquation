//import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Serj on 3/6/2017.
 */
public class LinearEquation {
    public static void main(String[] args) {
        System.out.println("Решение линейного уравнения вида a*x + b = 0, " +
                            "где a, b — некоторые числа (a ≠ 0), x — неизвестное.");
        Scanner input = new Scanner(System.in);
//        input.useLocale(Locale.US);

        System.out.println("Введите первый аргумент (a):");
        double a = readDouble(input, "Введите первый аргумент a!");

        System.out.println("Введите первый аргумент (b):");
        double b = readDouble(input, "Введите первый аргумент b!");

        System.out.println("a = " + a + ", b = " + b);
        LinearEq(a, b);
    }


    // Метод решения линейного уравнения
    private static void LinearEq (double a, double b) {
        if (a == 0 & b == 0) {
            System.out.println("x - любое");
        } else if (a == 0 & b != 0) {
            System.out.println("Решений нет");
        } else {
            System.out.println("x = " + (-b / a));
        }
    }

    // Метод проверки ввода аргументов
    private static double readDouble (Scanner input, String message) {
        while(true) {
            if (input.hasNextDouble()) {
                return input.nextDouble();
            } else {
                System.out.println("Вы ввели не число! " + message);
                input.next();
            }
        }
    }
}
