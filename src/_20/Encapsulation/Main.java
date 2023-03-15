package _20.Encapsulation;

public class Main {

    public static void main(String[] args) {
/*        Player player = new Player();
        player.name = "Victor";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        player.loseHealth(20);
        System.out.println("Remaining health = " + player.healthRemaining());*/

        EnhancedPlayer enhancedPlayer1 = new EnhancedPlayer("Victor");
        System.out.println("Initial health is " + enhancedPlayer1.healthRemaining());

        EnhancedPlayer enhancedPlayer2 = new EnhancedPlayer("Victor", 200, "Sword");
        System.out.println("Initial health is " + enhancedPlayer2.healthRemaining());
    }
}