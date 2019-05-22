package Lesson11;

import java.util.HashSet;
import java.util.Iterator;

public class Main22 {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(3);
        numbers.add(5);
        numbers.add(9);
        numbers.add(2);
        numbers.add(45);
        numbers.add(34);

        for (Iterator<Integer> iter = numbers.iterator(); iter.hasNext();){
            System.out.println(iter.next());
        }

    }
}
