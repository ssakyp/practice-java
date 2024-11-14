package day_7;

public class Task2 {
    public static void main(String[] args) {
        Player player = new Player(90);
        Player player1 = new Player(80);
        Player player2 = new Player(70);
        Player player3 = new Player(60);
        Player player4 = new Player(50);
        Player.info();
        Player player5 = new Player(40);
        Player.info();
        player5.run();
        player5.run();
        player5.run();
        player5.run();
        player5.run();
        Player.info();
    }
}
