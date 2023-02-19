import java.io.FileWriter;

// // Дано четное число N (>0) и символы c1 и c2. 
// // Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.

// /**
//  * Seminar2
//  */
// public class Seminar2 {

//     public static void main(String[] args) {

//     }

//     // Дано четное число N (>0) и символы c1 и c2. 
//     // Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.

//     public static void task1(int N, char c1, char c2) {
//         // if (N<=0) return;
//         StringBuilder result = new StringBuilder();
//         while (N > 0) {
//             result.append(c1);
//             N--;
//             if (N == 0)
//                 break;
//             result.append(c2);
//             N--;
//         }
//         System.out.println(result);
//     }

//     public static String createStringForNumber(int n, char c1, char c2) {
//         String result = "";
//         for (int i = 0; i < n; i++) {
//             if (i % 2 == 0)
//                 result += c1;
//             else
//                 result += c2;
//         }
//         return result;
//     }

//     public static StringBuilder stringLength(int n, char c1, char c2) {

//         StringBuilder result = new StringBuilder();
//         for (int i = 0; i < n; i++) {
//             result.append(c1);
//             result.append(c2);
//         }
//         return result;


//     }
//     // Задание 2:

//     public static boolean isPalindrome(String str) {
//         str = str.replaceAll("\\s", "");
//         String reverseStr = "";
//         for (int i = str.length() - 1; i >= 0; i--) {
//             reverseStr += str.charAt(i);
//         }
//         return str.equals(reverseStr);
//     }

//     public static void palindrom(String incomingString){
//         StringBuilder invertString = new StringBuilder(incomingString).reverse();
//         if (incomingString.equals(invertString.toString())){
//             System.out.printf("Строка %s - палиндром\n",incomingString);
//         }else {
//             System.out.printf("Строка %s - не палиндром\n",incomingString);
//         }
//     }


//     static boolean isPalindrome(String str) {
//         char[] strX = str.toCharArray();
//         int y = strX.length - 1;
//         for (int i = 0; i < strX.length/2; i++) {
//             if (strX[i] != strX[y - i]){

//                 return false;
//             }
//         }
//         return true;
//     }


//     public static boolean isPalindrom(String string){
//         boolean b = true;
//         for (int i = 0; i < string.length(); i++) {
            
//             if (string.charAt(i) != string.charAt(string.length() - 1 -i)){
//                 b = false;
//             } else {
//                 b = true;
//             }
//         }
//         return b;
//     }

//     public static boolean palindrom(String incomingString){
//         return  (incomingString.equals(new StringBuilder(incomingString).reverse().toString()));
//     }
// // Задание 4
//     // Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, 
//     // который запишет эту строку в простой текстовый файл, обработайте исключения.
//     // Создать фал:
// //        File newFile = new File("123/conf1.jpeg");
// //        try {
// //            newFile.createNewFile();

// // Мой:
// public static StringBuilder stringLength(int max, String text) {

//     StringBuilder result = new StringBuilder();
//     for (int i = 0; i < max; i++) {
//         result.append(text);
//         result.append('\n');
//         return result;
//     }




    
//     try (FileWriter fw = new FileWriter("file.txt", false)) {
//         fw.write("line 1");

//         fw.flush();
//         } catch (IOException ex) {
//         System.out.println(ex.getMessage());
//         }
//         } 
//        // 2
//         public static String get100TEST(){
//             StringBuilder content = new StringBuilder();
//             for (int i = 0; i < 100; i++) {
//                 content.append("TEST\n");
//             }
//             return content.toString();
//         }
//         public static void setMyFile(){
    
//             try {
//                 FileWriter writer = new FileWriter("TEST.txt");
//                try {
//                    writer.write(get100TEST());
//                }catch (IOException e){
//                    throw new RuntimeException(e);
//                } finally {
//                    writer.close();
//                }
//             } catch (IOException e) {
//                 throw new RuntimeException(e);
//             }
//         }
//     }   

//     // Логирование:
//     // public class MainClass {
//     //     private static final Logger logger = Logger.getLogger("");
//     // //    private static final Logger logger = Logger.getLogger(Lesson_6.MainClass.class.getName());
//     //     public static void main(String[] args) throws IOException {
    
//     //        LogManager.getLogManager().readConfiguration(new FileInputStream("logging.prop"));
//     //
//     //        logger.setLevel(Level.ALL);
//     //        logger.getHandlers()[0].setLevel(Level.ALL);
//     //
//     //        logger.getHandlers()[0].setFormatter(new Formatter() {
//     //            @Override
//     //            public String format(LogRecord record) {
//     //                return record.getLevel() + "\t" + record.getMessage() + "\t " + record.getMillis() + "\n";
//     //            }
//     //        });
//     //        logger.getHandlers()[0].setFilter(new Filter() {
//     //            @Override
//     //            public boolean isLoggable(LogRecord record) {
//     //                return record.getMessage().startsWith("J");
//     //            }
//     //        });
//     ////
//     //        Handler fileHandler = new FileHandler("mylog.log", true);
//     //        fileHandler.setLevel(Level.ALL);
//     //        fileHandler.setFormatter(new SimpleFormatter());
//     //        logger.addHandler(fileHandler);
//     ////
//     //        logger.log(Level.SEVERE, "Java");
//     //        logger.log(Level.INFO, "C#");
//     //        logger.log(Level.CONFIG, "Python");
//     //        logger.log(Level.FINE, "JS");
    
//             // OFF
//             // SEVERE - важные ошибки
//             // WARNING - ошибка
//             // INFO - информация
//             // CONFIG - параметры
//             // FINE - кастомный уровень 1
//             // FINER - кастомный уровень 2
//             // FINEST - кастомный уровень 3
//             // ALL
    
    
//         //     Calculator calculator = new Calculator();
//         //     System.out.println(calculator.add(2, 2));
    
    
//         // }


//         //        String[] lits = file.list(new FilenameFilter() {
// //            @Override
// //            public boolean accept(File dir, String name) {
// //                return name.startsWith("t");
// //            }
// //        });
// //
// //        for (String o : lits) {
// //            System.out.println(o);
// //        }
    
// // Задание 5:
// // Напишите метод, который вернет содержимое текущей папки в виде массива строк. 
// // Напишите метод, который запишет массив, возвращенный предыдущим методом в файл. 
// // Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, оно должно записаться в лог-файл.

// public static String[] getCurrentFolderContent() {
//     File dir = new File(".");
//     return dir.list();
// }
// public static void writeToFile(String[] content) {
//     try {
//         FileWriter fw = new FileWriter("currentFolder.txt");
//         for (String s : content) {
//             fw.write(s + "\n");
//         }
//         fw.close();
//     } catch (IOException e) {
//         try {
//             FileWriter log = new FileWriter("log.txt");
//             log.write("Error occurred while writing to file: " + e.getMessage());
//             log.close();
//         } catch (IOException e2) {
//             System.out.println("Error occurred while writing to log file: " + e2.getMessage());
//         }
//     }
// }

// public static void getMyListFiles() {
//     File dir = new File("C:\\MASTER\\Seminars");
//     StringBuilder listFiles = new StringBuilder();
//     if (dir.isDirectory()) {
//         for (File item : dir.listFiles()) {
//             listFiles.append(item.getName() + '\n');
//         }
//     }
//     try {
//         FileWriter writer = new FileWriter("C:\\MASTER\\Seminars\\filelist.txt");
//         try {
//             writer.write(listFiles.toString());
//         } catch (IOException e) {
//             throw new RuntimeException(e);
//         } finally {
//             writer.close();
//         }
//     } catch (IOException e) {
//         throw new RuntimeException(e);
//     }
// }


package Lesson_3;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        File file = new File("C:/Users/Artem/Desktop/РќРѕРІР°СЏ РїР°РїРєР° (3)/5");
//        file.mkdirs();

//        File file = new File("123");
//////
////        String[] lits = file.list();
////
////        for (String o : lits) {
////            System.out.println(o);
////        }
////        System.out.println(lits);
//
//        String[] lits = file.list(new FilenameFilter() {
//            @Override
//            public boolean accept(File dir, String name) {
//                return name.startsWith("t");
//            }
//        });
//
//        for (String o : lits) {
//            System.out.println(o);
//        }

//        File newFile = new File("123/conf1.jpeg");
//        try {
//            newFile.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        File newFile = new File("123/conf1.txt");
//        System.out.println(newFile.getPath());
////        try {
////            newFile.createNewFile();
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
//        if (newFile.exists()) {
//            System.out.println("file exists");
//        }

//        long t = System.currentTimeMillis();


//        try (FileInputStream in = new FileInputStream("123/test.txt")) {
//
//            int x;
//            while ((x = in.read()) > -1) {
//                System.out.print((char)x);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try (FileInputStream in = new FileInputStream("123/test.txt")) {
//            byte[] arr = new byte[512];
//            int x;
//            while ((x = in.read(arr)) > 0) {
//                System.out.print(new String(arr, 0, x, "UTF-8"));
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("Р’СЂРµРјСЏ " + (System.currentTimeMillis() - t));


//
//        try (FileInputStream in = new FileInputStream("123/4/test.txt")) {
//            byte[] arr = new byte[512];
//            int x;
//            while ((x = in.read(arr)) > 0) {
//                System.out.print(new String(arr, 0, x, "UTF-8"));
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println();
//        System.out.println(System.currentTimeMillis() - t);

//
//        System.out.println(System.currentTimeMillis() - t);







//        try (InputStreamReader isr = new InputStreamReader(new FileInputStream("123/test.txt"), "UTF-8")) {
//            int x;
//            while ((x = isr.read()) != -1) {
//                System.out.println((char) x);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        BufferedReader br = null;
//        FileReader fr = null;
//
//        try {
//            fr = new FileReader("123/test.txt");
//            br = new BufferedReader(fr);
//            String currentLine;
//
//            while ((currentLine = br.readLine()) != null) {
//                System.out.println(currentLine);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//        PipedInputStream in = null;
//        PipedOutputStream out = null;
//
//        in = new PipedInputStream();
//        out = new PipedOutputStream();
//        out.connect(in);


//        ArrayList<InputStream> ail = new ArrayList<>();
//        ail.add(new FileInputStream("123/test1.txt"));
//        ail.add(new FileInputStream("123/test2.txt"));
//        ail.add(new FileInputStream("123/test3.txt"));
//
////        for (InputStream  a : ail ) {
////            System.out.println(a);
////        }
//
//        SequenceInputStream in = new SequenceInputStream(Collections.enumeration(ail));
//
//        int x;
//        while ((x = in.read()) != -1) {
//            System.out.print((char) x);
//        }
//
//        in.close();

//        try (RandomAccessFile raf = new RandomAccessFile("123/test1.txt", "rw")) {
//            raf.seek(2);
//            System.out.println((char) raf.read());
//            raf.seek(1);
//            System.out.println((char) raf.read());
//            raf.seek(0);
//            System.out.println((char) raf.read());
//        }

//        Book book = new Book("Jungle book");
//        Students s = new Students(1, "Bob");
//        s.setBook(book);
//////
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("stud.ser"));
//        oos.writeObject(s);
//        oos.close();
//
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("stud.ser"));
//        Students s1 = (Students)ois.readObject();
//        ois.close();
//        s1.info();

    }


    public static String[] getCurrentFolderContent() {
        File dir = new File(".");
        return dir.list();
    }
    public static void writeToFile(String[] content) {
        try {
            FileWriter fw = new FileWriter("currentFolder.txt");
            for (String s : content) {
                fw.write(s + "\n");
            }
            fw.close();
        } catch (IOException e) {
            try {
                FileWriter log = new FileWriter("log.txt");
                log.write("Error occurred while writing to file: " + e.getMessage());
                log.close();
            } catch (IOException e2) {
                System.out.println("Error occurred while writing to log file: " + e2.getMessage());
            }
        }
    }


    public static void getMyListFiles() {
        File dir = new File("C:\\MASTER\\Seminars");
        StringBuilder listFiles = new StringBuilder();
        if (dir.isDirectory()) {
            for (File item : dir.listFiles()) {
                listFiles.append(item.getName() + '\n');
            }
        }
        try {
            FileWriter writer = new FileWriter("C:\\MASTER\\Seminars\\filelist.txt");
            try {
                writer.write(listFiles.toString());
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                writer.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}