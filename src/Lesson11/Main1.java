package Lesson11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        long startTime1 = System.currentTimeMillis();

        for (int i =0; i < 100000; i++){
            arrayList.add("qwerty" + i);
        }

        long startTime2 = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++){
            linkedList.add("qwerty" + i);
        }

        long endTime = System.currentTimeMillis();

        System.out.println("ArrayLiat.add: " + (startTime2 - startTime1));
        System.out.println("LinkedList.add: " + (endTime - startTime2));

        //---------------------------------

        long startTime3 = System.currentTimeMillis();

        for (int i =0; i < 100000; i++){
            arrayList.get(i);
        }

        long startTime4 = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++){
            linkedList.get(i);
        }
        long startTime5 = System.currentTimeMillis();

        System.out.println("ArrayLiat.get: " + (startTime4 - startTime3));
        System.out.println("LinkedList.get: " + (startTime5 - startTime4));


        for (int i =0; i < 100000; i++){
            arrayList.set(i,"qwe");
        }

        long startTime6 = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++){
            linkedList.set(i, "qwe");
        }

        long startTime7 = System.currentTimeMillis();

        System.out.println("ArrayLiat.set: " + (startTime6 - startTime5));
        System.out.println("LinkedList.set: " + (startTime7 - startTime6));

        for (int i =0; i < 100000; i++){
            arrayList.remove(i);
        }

        long startTime8 = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++){
            linkedList.remove(i);
        }

        long startTime9 = System.currentTimeMillis();


        System.out.println("ArrayLiat.remove: " + (startTime8 - startTime7));
        System.out.println("LinkedList.remove: " + (startTime9 - startTime8));





    }
}
