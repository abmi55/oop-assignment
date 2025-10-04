package Weapon;

public class Weapon {
    private String name;
    private int damage;

    // Skapar nytt vapen, vapens namn, vapens grundskada
    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }
}
