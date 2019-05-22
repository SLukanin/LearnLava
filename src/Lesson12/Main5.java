package Lesson12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("asdasdasd");
        list.add("gkfjasjf");
        list.add("asdasdas");
        list.add("ppp`,");
        list.add("zxczcxvc");

        // Старндартная сортировка от меньшего к большему
        //Collections.sort(list);

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                // сортируем в обратном порядке, поменяли местами аргументы o2 и o1
                return o2.compareTo(o1);
            }
        });

        for (String s:list){
            System.out.println(s);
        }
    }
}
