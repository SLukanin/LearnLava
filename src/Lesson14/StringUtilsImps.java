package Lesson14;

import java.util.ArrayList;

public class StringUtilsImps implements StringUtils {
    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        if(number1 == null || number2 == null){
            throw new NullPointerException("number1 == null || number2 == null");
        }
        double num1 = 0;
        double num2 = 0;
        try {
            num1 = Double.parseDouble(number1);
        } catch (Exception e){
            throw new NumberFormatException("Первый переменая - это не число, введите корректно");
        }

        try {
            num2 = Double.parseDouble(number2);
        } catch (Exception e){
            throw new NumberFormatException("Вторая переменая - это не число, введите корректно");
        }

        if (num2 == 0){
            throw new ArithmeticException("делить на 0 нельзя");
        }


        return num1 / num2;
    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        if (text == null || word == null){
            throw new NullPointerException("text == null || word == null");
        }
        String[] str = text.split(" ");
        ArrayList<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < str.length; i++){
            if (str[i].equals(word)){
                indexes.add(i);
            }
        }
        int[] result = new int[indexes.size()];

        for (int i = 0; i < result.length; i++){
            result[i] = indexes.get(i);
        }

        return result;
    }

    @Override
    public double[] findNumbers(String text) throws CustomException {
        // создаем массив числовых значнией из текста при помощи split,
        // в качестве разделитея используем любое нецифровое значение (регулярное выражение //D+)

        String[] str = text.split("\\D+");

        if(str.length == 0){
            throw new CustomException("Not found");
        }

        double[] result = new double[str.length];

        for (int i = 0; i < str.length; i++){
            result[i] = Double.parseDouble(str[i]);
        }

        for (Double d: result){
            System.out.println(d);
        }

        return result;
    }
}