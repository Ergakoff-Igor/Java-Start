import java.util.ArrayList;
import java.util.Scanner;

public class Homework1 {

    public static void main(String[] args) {
        menu();
    }

    // Меню:
    public static void menu() {
        Scanner iSc = new Scanner(System.in);
        try {
            System.out.printf("Введите номер задания: ");
            int task = iSc.nextInt();

            switch (task) {
                case 1:
                    System.out.println("\nЗадание № 1:\n");
                    System.out.printf("Введите число n: ");
                    int n = iSc.nextInt();
                    task1(n);
                    break;
                case 2:
                    System.out.println("\nЗадание № 2:\n");
                    task2();
                    break;
                case 3:
                    System.out.println("\nЗадание № 3:\n");
                    System.out.printf("Введите первое число: ");
                    Double num1 = iSc.nextDouble();
                    System.out.printf("Введите арифметический знак: ");
                    String operand = iSc.next();
                    System.out.printf("Введите второе число: ");
                    Double num2 = iSc.nextDouble();
                    task3(num1, operand, num2);
                    break;
                default:
                    System.out.println("Некорректный ввод");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Некорректный ввод");
        } finally {
            iSc.close();
        }
    }

    /**********************************************************
     * Задание 1:
     * Вычислить n-ое треугольное число(сумма чисел от 1 до n),
     * n! (произведение чисел от 1 до n)
     ************************************************************/
    public static void task1(int n) {
        if (n == 0) {
            System.out.printf("%d-е треугольное число -> %d \n", n, 0);
            System.out.printf("Факториал числа %d -> %d", n, 1);
        } else if (n < 0) {
            System.out.printf("Число %d - отрицательное, что не соответствует условиям задачи", n);
        } else {
            System.out.printf("%d-е треугольное число -> %d \n", n, triangularNumber(n));
            System.out.printf("Факториал числа %d -> %d", n, factorial(n));
        }
    }

    // Нахождение n-го треугольного числа при помощи цикла:
    public static int triangularNumber(int num) {
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        return sum;
    }

    // Нахождение факториала числа n при помощи рекурсии:
    public static int factorial(int n) {
        if (n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    /**********************************************************
     * Задание № 2:
     * Вывести все простые числа от 1 до 1000
     ************************************************************/
    public static void task2() {
        ArrayList<Integer> array = new ArrayList<Integer>();
        int max = 1000;
        for (int i = 2; i <= max; i++) {
            boolean isPrimeNumber = true;
            // Проверка, является ли число простым:
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber) {
                array.add(i);
            }
        }
        System.out.printf("Простые числа от 1 до %d:\n%s", max, array.toString());
    }

    /**********************************************************
     * Задание № 3:
     * Реализовать простой калькулятор
     ************************************************************/
    public static void task3(Double a, String oper, Double b) {
        switch (oper) {
            case "+":
                System.out.printf("Сумма %.1f и %.1f -> %.1f \n", a, b, sum(a, b));
                break;
            case "-":
                System.out.printf("Разность %.1f и %.1f -> %.1f \n", a, b, deduction(a, b));
                break;
            case "*":
                System.out.printf("Произведение %.1f и %.1f -> %.1f \n", a, b, multiplication(a, b));
                break;
            case "/":
                System.out.printf("%.1f разделить на %.1f -> %.1f \n", a, b, division(a, b));
                break;
            default:
                break;
        }
    }

    public static Double sum(Double a, Double b) {
        return a + b;
    }

    public static Double deduction(Double a, Double b) {
        return a - b;
    }

    public static Double multiplication(Double a, Double b) {
        return a * b;
    }

    public static Double division(Double a, Double b) {
        return a / b;
    }
}
