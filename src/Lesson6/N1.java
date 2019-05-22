package Lesson6;

public class N1 {
    public static void main(String[] args) {
        String str = "London is the capital of the great britain";
        char[] strchar;
        strchar = str.toCharArray();

        // вывод через букву

        for (int i = 0; i < strchar.length; i += 2) {
            System.out.print(strchar[i] + " ");
        }

        System.out.println();
        System.out.println();

        // Выыодим задом наперед

        for (int i = strchar.length - 1; i >= 0; i--) {
            System.out.print(strchar[i]);
        }

        System.out.println();
        System.out.println();

        // Выводим на консоль по одному слову в строчке

        int k = 0;
        for (int i = str.indexOf(' '); i < strchar.length; i++) {
            if (str.charAt(i) == ' ') {
                System.out.println(str.substring(k, i));
                k = i + 1;
            }
        }
        System.out.println(str.substring(k));

        String[] words = str.split(" ");  // разбиение строки по символу пробел
        for (String subStr: words) System.out.println(subStr);

        String reverse = new StringBuffer(str).reverse().toString();

    }

}

//str.split(" ") //s - разбиение строки по символу

