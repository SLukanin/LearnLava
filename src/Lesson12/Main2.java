package Lesson12;

import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(8);
        numbers.add(1);
        numbers.add(-17);
        numbers.add(47);
        numbers.add(4);

        for (int n: numbers){
            System.out.println(n);
        }
    }
}
