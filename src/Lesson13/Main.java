package Lesson13;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> freedj= new HashMap<>();
        freedj.put("Apple", 3);
        freedj.put("Orange", 3);
        freedj.put("Meat", 3);
        freedj.put("Fish", 3);

        for (String key:freedj.keySet()){
            System.out.println(key + ": " + freedj.get(key));
        }

    }
}
