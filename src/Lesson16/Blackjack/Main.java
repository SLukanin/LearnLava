package Lesson16.Blackjack;

public class Main  {
    public static void main(String[] args) {
        System.out.println("Новая игра");
        Dealer dealer = new Dealer();
        Human human = new Human();
        Computer computer = new Computer();
        Game game = new Game();
        game.addPlayer(computer);
        game.addPlayer(human);
        game.doFirstDeal();
        human.printHand();
        while (game.needDoRound()) {
            game.doRound();
            human.printHand();
        }

        game.printResult();
        game.printWinner();

    }
}
