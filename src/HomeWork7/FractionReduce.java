package HomeWork7;

public class FractionReduce {

    public static void reduce(FractionNumber drob){
        int a = drob.getNumerator();
        int b = drob.getDenumerator();
// Находим наибольший общий делитель (алгоритм найден в интернете)
        while (a != b){
            if (a > b){
                a = a - b;
            } else {
                b = b -a;
            }
        }
// Делим числитель и знаменатель на НОД и выводим результат на печать
        System.out.println(drob.getNumerator()+ "/" + drob.getDenumerator() + " = "
                + (drob.getNumerator() / a) + "/" + (drob.getDenumerator() /a));

    }
}
