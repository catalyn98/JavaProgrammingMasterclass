package _20.Encapsulation;

public class Player {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        health = health - damage;
        if(health <= 0) {
            System.out.println("Player knocked out of game");
        }
    }

    public void restoreHealth(int extraHealth) {
        health =+ extraHealth;
        if(health > 100) {
            System.out.println("Player restored to 100%");
            health = 100;
        }
    }

    public int healthRemaining() {
        return health;
    }

}
