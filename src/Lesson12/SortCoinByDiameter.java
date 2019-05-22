package Lesson12;

import Lesson11.Coin;

import java.util.Comparator;

public class SortCoinByDiameter implements Comparator<Coin> {

    @Override
    public int compare(Coin o1, Coin o2) {

        if (o1.getYear() != o2.getYear()){
            return o2.getYear() - o1.getYear();
        }

        if (o1.getNominal() != o2.getNominal()){
            return o2.getNominal() - o1.getNominal();
        }

        return o2.getDiameter() - o1.getDiameter();
    }
}
