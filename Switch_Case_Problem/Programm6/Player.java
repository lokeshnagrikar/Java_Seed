package Programm6;

public class Player {
    private int playerCode;
    private String playerName;
    private static int count = 0;

    public Player(int code, String name) {
        playerCode = code;
        playerName = name;
        count++;
    }

    public void printDetails() {
        System.out.println("Player Code: " + playerCode);
        System.out.println("Player Name: " + playerName);
    }

    public static int getCount() {
        return count;
    }

 

	public static void main(String[] args) {
        Player player1 = new Player(1, "John");
        Player player2 = new Player(2, "Mary");
        Player player3 = new Player(3, "David");

        player1.printDetails();
        player2.printDetails();
        player3.printDetails();

        System.out.println("Number of players created: " + Player.getCount());
    }
}