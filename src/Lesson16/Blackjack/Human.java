package Lesson16.Blackjack;

import java.util.Scanner;

public class Human extends Player {
    @Override
    public boolean doAction() {
        System.out.println("Ваши действия?");
        System.out.println("any key: не брать карту");
        System.out.println("1: взять карту");
        Scanner sc = new Scanner(System.in);
        String humanInput = sc.nextLine();
        if (humanInput.equals("1")){
            return true;
        }
        this.setContinue(false);
        return false;
    }

    @Override
    public String toString() {
        return "Human " + getPoints();
    }
}
