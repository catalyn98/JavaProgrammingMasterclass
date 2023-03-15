package _20.Encapsulation;

public class EnhancedPlayer {
    private String namePlayer;
    private int healthPercentage;
    private String weapon;

    public EnhancedPlayer(String name) {
        this(name, 100, "Sword");
    }

    public EnhancedPlayer(String name, int health, String weapon) {
        this.namePlayer = name;
        if(health <= 0) {
            this.healthPercentage = 1;
        } else if (health > 100) {
            this.healthPercentage = 100;
        } else {
            this.healthPercentage = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        healthPercentage = healthPercentage - damage;
        if(healthPercentage <= 0) {
            System.out.println("Player knocked out of game");
        }
    }

    public void restoreHealth(int extraHealth) {
        healthPercentage =+ extraHealth;
        if(healthPercentage > 100) {
            System.out.println("Player restored to 100%");
            healthPercentage = 100;
        }
    }

    public int healthRemaining() {
        return healthPercentage;
    }
}
