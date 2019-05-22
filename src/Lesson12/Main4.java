package Lesson12;

import Lesson11.Coin;

import java.util.Comparator;
import java.util.TreeSet;

public class Main4 {
        public static void main(String[] args) {
            Coin coin1 = new Coin(5, 1900, 11);
            Coin coin2 = new Coin(5, 1900, 10);
            Coin coin3 = new Coin(10, 1915, 12);
            Coin coin4 = new Coin(25, 2001, 15);
            Coin coin5 = new Coin(50, 1960, 14);

            //  сщздаем внутренний безымянный класс

            TreeSet<Coin> coins = new TreeSet<>(new Comparator<Coin>() {
                @Override
                public int compare(Coin o1, Coin o2) {
                    if (o1.getYear() != o2.getYear()){
                        return o1.getYear() - o2.getYear();
                    }

                    if (o1.getNominal() != o2.getNominal()){
                        return o1.getNominal() - o2.getNominal();
                    }

                    return o1.getDiameter() - o2.getDiameter();
                }
            });

            coins.add(coin1);
            coins.add(coin2);
            coins.add(coin3);
            coins.add(coin4);
            coins.add(coin5);

            for (Coin k : coins) {
                System.out.println(k);
            }


        }

    }

