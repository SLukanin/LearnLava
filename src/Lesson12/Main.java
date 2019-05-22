package Lesson12;

import Lesson11.Coin;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Coin coin1 = new Coin(5, 1900, 11);
        Coin coin2 = new Coin(5, 1900, 10);
        Coin coin3 = new Coin(10, 1915, 12);
        Coin coin4 = new Coin(25, 2001, 15);
        Coin coin5 = new Coin(50, 1960, 14);
        TreeSet<Coin> coins = new TreeSet<>();

        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);

        for (Coin k:coins){
            System.out.println(k);
        }

    }
}
