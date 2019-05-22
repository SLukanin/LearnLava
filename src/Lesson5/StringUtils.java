package Lesson5;

public class StringUtils {
    public static String reverse12(String str){
        String revere = new StringBuffer(str).reverse().toString();
        return revere;
    }

    public static void printGlasnye(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'y'){
                result += str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
