package Lesson11;

import java.util.HashSet;

public class Main3 {
    public static void main(String[] args) {
        Coin coin1 = new Coin(5, 1900, 10);
        Coin coin2 = new Coin(5, 1900, 10);
        Coin coin3 = new Coin(10, 1915, 12);
        Coin coin4 = new Coin(25, 2001, 15);
        Coin coin5 = new Coin(50, 1960, 14);

        HashSet<Coin> coins = new HashSet<>();
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);

        for (Coin c: coins) {
            System.out.println(c);
        }

    }
}
