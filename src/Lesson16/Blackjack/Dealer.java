package Lesson16.Blackjack;

public class Dealer extends Player {
    @Override
    public boolean doAction() {
        int countPoints = 0;
        for (Card card: hand){
            countPoints = countPoints + card.getPoints();
        }

        if (countPoints < 16){
            return true;
        }
        this.setContinue(false);
        return false;
    }
}
