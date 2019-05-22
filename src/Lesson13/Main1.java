package Lesson13;

public class Main1 {
    public static void main(String[] args) {
        Tournament tournament = new Tournament();
        tournament.addTeam("Спартак", 3);
        tournament.addTeam("Динамо", 9);
        tournament.addTeam("Челси", 7);
        tournament.addTeam("ЦСКА", 34);
        tournament.addTeam("Динамо", 6);


        tournament.printSortTable();
    }

}
