package HomeWork5;

import java.util.Arrays;

public class SomeUtils {

    String color;


    // Печать минимального числа из трех


    public static void printMinNum(int a, int b, int c) {
        int min;
        if (a < b && a < c) {
            min = a;
        } else if (b < a && b < c) {
            min = b;
        } else {
            min = c;
        }
        System.out.println("Минимальное число: " + min);
    }

    // Печатает количество символов в тексте


    public static void printTextLength(String str) {
        System.out.println("Количество символов в тексте = " + str.length());
    }

    // Печатает максимальное число из трех

    public static void printMaxNum(int a, int b, int c) {
        int max = 0;
        if (a > b && a > c) {
            max = a;
        } else if (b > a && b > c) {
            max = b;
        } else {
            max = c;
        }
        System.out.println("Максимальное число: " + max);
    }

    // Выводит текст по строкам

    public static void printTextPoStrokam(String text) {
        String[] words = text.split(" ");
        for (String i : words) {
            System.out.println(i);
        }

    }


    // Возвращает массив гласных букв из текста


    public static char[] returnVowelLetters(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o'
                    || text.charAt(i) == 'u' || text.charAt(i) == 'y') {
                result.append(text.charAt(i));
            }
        }
        return result.toString().toCharArray();
    }


    //Печатаем букву из текста, максимально близко расположенную к началу алфавиту


    public static void printFistsAlphabetLetter(String text) {

        char[] ch = text.toLowerCase().toCharArray();

        Arrays.sort(ch);

        for (int i = 0; i < ch.length; i++) {

            // проверяем, являтся ли символ алфавитным

            if ((ch[i] >= 'a' && ch[i] <= 'z') || (ch[i] >= 'а' && ch[i] <= 'я')) {
                System.out.println("Ближайший к началу алфавита символ - " + ch[i]);
                break;
            } else if (i == ch.length -1){
                System.out.println("В тексте отсутствуют алфавитные символы");
            }
        }
    }

    public static void firstSymbol(String text){
        String alphabet = "abcdefghij";
        String textToLower = text.toLowerCase();
        int[] indexes = new int[text.length()];
        for (int i = 0; i < alphabet.length(); i++){
            char current = text.charAt(i);
            int index = alphabet.indexOf(current);
            indexes[i] = index;
        }
        int min = indexes[0];


    }

}







