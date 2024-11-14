package day_7;

public class Player {
    private int stamina;
    private final int MAX_STAMINA = 100;
    private final int MIN_STAMINA = 0;
    private static int countPlayers;

    public int getStamina() {
        return stamina;
    }

    public void run() {
        if (this.stamina == 0){
            countPlayers--;
            return;
        }

        this.stamina -= 10;
    }

    public Player(int stamina) {
        this.stamina = stamina;

        if(countPlayers < 6)
            countPlayers++;
    }

    public static void info(){
        if(countPlayers < 6)
            System.out.println("The number of players are not enough " + (6-countPlayers) + " players required.");
        else
            System.out.println("The field is full.");
    }
}
