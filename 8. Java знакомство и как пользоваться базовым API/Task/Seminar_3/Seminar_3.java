import java.util.ArrayList;
import java.util.Random;
import java.util.*;
/**
 * Seminar_3
 */
public class Seminar_3 {

    public static void main(String[] args) {
        // Задание 1:
        // Даны следующие строки, cравнить их с помощью == и метода equals() класса Object
        // String s1 = "hello";
        // String s2 = "hello";
        // String s3 = s1;
        // String s4 = "h" + "e" + "l" + "l" + "o";
        // String s5 = new String("hello");
        // String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[] { 'h', 'e', 'l', 'l', 'o' });

        System.out.println(s1 == s2);
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1 == s5);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s5));
        System.out.println(s1.equals(s6));

        // Задание 2:
        // Заполнить список десятью случайными числами. 
        // Отсортировать список методом sort() и вывести его на экран.
        // Вариант 1:
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(rand.nextInt(0,100));
        }
        for (int item: list) {
            System.out.println(item);
        }

        // Вариант 2:
        package task;





        List<Integer> list = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(0, 100));
        }

        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
        Collections.sort(list);

        for (int i : list) {
            System.out.print(i + " ");
        }

        // Задание 2.1:
        // Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
        // Вывести название каждой планеты и количество его повторений в списке.
        // Задание 2.2:
        // Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.

        // Вариант 1:
        List<String> planet = Arrays.asList("Марс", "Земля", "Венера", "Меркурий", "Марс", "Юпитер", "Сатурн");
        Collections.sort(planet);
        int count=1;
        for (int i = 2; i < planet.size(); i++) {
            if (planet.get(i).equals(planet.get(i-1))){
                count++;
            }else{
                System.out.println(planet.get(i-1) + " - " + count);
                count=1;
            }
        }

        // Вариант 1:
        ArrayList<String> planets = new ArrayList<>(Arrays.asList("Mars",
                "Uranus",
                "Earth",
                "Saturn",
                "Mars",
                "Uranus",
                "Earth",
                "Saturn",
                "Pluton",
                "Pluton",
                "Pluton",
                "Jupiter"));

        Collections.sort(planets);
        int count = 1;

        for (int i = 1; i < planets.size(); i++) {
            if (planets.get(i - 1).equals(planets.get(i))) {
                count++;
            } else {
                System.out.println(planets.get(i - 1) + " " + count);
                count = 1;
            }
        }
        for (int i = 1; i < planets.size(); i++) {
            if (planets.get(i-1).equals(planets.get(i))) {
                planets.remove(i);
                i--;
            }
        }

        Iterator<String> iter = planets.iterator();

        while (iter.hasNext()){
            iter.next();
            iter.remove();
        }

        System.out.println(planets);


        // Задание 3:
        // Создать список типа ArrayList<String>.
        // Поместить в него как строки, так и целые числа. 
        // Пройти по списку, найти и удалить целые числа.

        // Задание 4:
        // Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так, 
        // что на 0й позиции каждого внутреннего списка содержится название жанра, 
        // а на остальных позициях - названия книг. Напишите метод для заполнения данной структуры.


                List<ArrayList<String>> list = new ArrayList<>();
        
                ArrayList<String> eList = new ArrayList<>();
                eList.add("басни");
                eList.add("мартышка и очки");
        
                list.add(eList);
        
                for (List<String> item : list) {
                    if (item.get(0).equals("басни")) {
                        System.out.println(item);
                    }
                }

    }

    }
