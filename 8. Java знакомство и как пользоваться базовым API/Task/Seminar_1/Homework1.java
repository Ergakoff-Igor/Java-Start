import java.util.Scanner;

public class Homework2 {

    // Нахождение n-го треугольного числа при помощи цикла:
    static int triangularNumber(int num) {
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        return sum;
    }

    static int factorial(int n) {
        if (n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        /**********************************************************
         * Задание 1:
         * Вычислить n-ое треугольное число(сумма чисел от 1 до n),
         * n! (произведение чисел от 1 до n)
         ************************************************************/
        System.out.println("Задание № 1:\n");
        Scanner iSc = new Scanner(System.in);
        try {
        System.out.printf("Введите число n: ");
        int n = iSc.nextInt();
            if (n == 0) {
                System.out.printf("%d-е треугольное число -> %d \n", n, 0);
                System.out.printf("Факториал числа %d -> %d", n, 1);
            } 
            else if (n < 0) {
                System.out.printf("Число %d - отрицательное, что не соответствует условиям задачи", n);
            }
            else {
                System.out.printf("%d-е треугольное число -> %d \n", n, triangularNumber(n));
                System.out.printf("Факториал числа %d -> %d", n, factorial(n));
            }
            iSc.close();
        } catch (Exception e) {
            System.out.printf("Некорректный ввод");

            // TODO: handle exception
        }

    }
}
