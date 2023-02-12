
/**
 * Seminar_1
 * //
 */
import java.util.Scanner;

public class Seminar1 {
    /**
     */
    public static void main(String[] args) {
        
        Scanner iSc = new Scanner(System.in, "ibm866");
        System.out.printf("Первое число: ");
        int a = iSc.nextInt();
        System.out.printf("Второе число: ");
        int b = iSc.nextInt();
        System.out.printf("%d + %d = %d", a, b, a + b);
        iSc.close();

        // int[] array = new int[] { 1, 1, 0, 1, 1, 1 };
        // int count = 0;
        // int max = 0;
        // for (int i : array) {
        //     if (i == 1) {
        //         count++;
        //         if (count > max)
        //             max = count;
        //     } else
        //         count = 0;
        // }
        // System.out.printf("Максимальное количество подряд идущих единиц: %d", max);
    }

}

/*
 * package Seminar1;
 * 
 * import java.text.*;
 * import java.time.LocalTime;
 * import java.util.Date;
 * import java.util.Scanner;
 * 
 * 
 * public class Main {
 * public static <SimpleDateFormatter> void main(String[] args) {
 * System.out.println("Hello world!");
 * 
 * Date dateNow = new Date();
 * SimpleDateFormat formatForDateNow = new
 * SimpleDateFormat("E yyyy.MM.dd 'и время' hh:mm:ss a zzz");
 * System.out.println("Текущая дата " + formatForDateNow.format(dateNow));
 * 
 * Scanner scanner = new Scanner(System.in);
 * System.out.print("Ваше имя?: ");
 * String userName = scanner.next();
 * System.out.println("Привет, "+userName);
 * 
 * int hour = LocalTime.now().getHour();
 * 
 * if (hour>=5 && hour<12){
 * System.out.print("Доброе утро, ");
 * } else if (hour>=12 && hour<18) {
 * System.out.print("Добрый день, ");
 * } else if (hour>=18 && hour<23) {
 * System.out.print("Добрый вечер, ");
 * } else{
 * System.out.print("Доброй ночи, ");
 * }
 * System.out.println(userName);
 * }
 * }
 */