import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        menu();
    }

    // Меню:
    public static void menu() {
        Scanner iSc = new Scanner(System.in);
        try {
            System.out.printf("Введите номер задания: ");
            int task = iSc.nextInt();
            System.out.printf("Введите длину списка: ");
            int length = iSc.nextInt();
            System.out.printf("Введите минимальное значение: ");
            int min = iSc.nextInt();
            System.out.printf("Введите максимальное значение: ");
            int max = iSc.nextInt();

            switch (task) {
                case 1:
                    System.out.println("\nЗадание № 1:\n");
                    task1(length, min, max);
                    break;
                case 2:
                    task2(length, min, max);
                    break;
                case 3:
                    System.out.println("Не обязательное. Не успел из-за загруженности на работе");
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

    // Метод создания списка случайных целых чисел:
    static ArrayList<Integer> randArray(int length, int min, int max) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            array.add(rand.nextInt(min, max));
        }
        return array;
    }

    // 1 Задан целочисленный список ArrayList. Найти минимальное, максимальное и
    // среднее арифметическое из этого списка.
    public static void task1(int length, int min, int max) {

        ArrayList<Integer> array = randArray(length, min, max);
        System.out.printf("Исходный список:\n%s\n", array.toString());
        Collections.sort(array);
        System.out.printf("Отсортированный список:\n%s\n", array.toString());
        System.out.printf("Минимальный элемент -> %d\n", array.get(0));
        System.out.printf("Максимальный элемент -> %d\n", array.get(array.size() - 1));
        Iterator<Integer> iter = array.iterator();
        double sum = 0;
        while (iter.hasNext()) {
            sum += iter.next();
        }
        System.out.printf("Cреднее арифметическое -> %.1f\n", sum / (double) array.size());
    }

    // 2 Пусть дан произвольный список целых чисел, удалить из него четные числа
    public static void task2(int length, int min, int max) {
        ArrayList<Integer> array = randArray(length, min, max);
        System.out.printf("Исходный список:\n%s\n", array.toString());
        Iterator<Integer> iter = array.iterator();
        while (iter.hasNext()) {
            if (iter.next() % 2 == 0) {
                iter.remove();
            }
        }
        System.out.printf("Итоговый список нечетных чисел:\n%s", array.toString());

    }

    // 3* Реализовать алгоритм сортировки слиянием
    // Формат сдачи: файл с расширением java или ссылка на гит 
    // (Доделать в свободное время. Не успел из-за загруженности на работе)

}
