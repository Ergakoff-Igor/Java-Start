import java.util.Arrays;
import java.util.Scanner;

public class Homework1 {
    /**
     * @param args
     */
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
                    System.out.printf("Введите число n: ");
                    int n = iSc.nextInt();
                    task1(n);
                    break;
                case 2:
                    task2();
                    break;
                default:
                    System.out.printf("Некорректный ввод");
                    break;
            }
        } catch (Exception e) {
            System.out.printf("Некорректный ввод");
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
        System.out.println("\nЗадание № 1:\n");
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
    /**
     * @param num
     * @return
     */
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
        System.out.println("\nЗадание № 2:\n");
        int[] array = new int[0];
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
                array = addElement(array.length, array, i);
            }
        }
        System.out.println(Arrays.toString(array));
    }

    // Метод добавления элемента в конец массива:
    public static int[] addElement(int n, int arr[], int x) {
        int newArr[] = new int[n + 1];
        for (int i = 0; i < n; i++)
            newArr[i] = arr[i];
        newArr[n] = x;
        return newArr;
    }
}
