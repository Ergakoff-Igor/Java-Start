public class Homework2 {
    public static void main(String[] args) {
        addPoint("Добрый день Как дела Все хорошо");
    }


    static void addPoint(String text) {
        System.out.printf("Исходный текст: \n%s\n", text);
        text = text.replaceAll("\\s{1,}([А-ЯЁ])", ". $1");
        char point = '.';
        if (text.charAt(text.length() - 1) != point) {
            text += point;
        }
        System.out.printf("Итоговый текст: \n%s", text);
    }
}
