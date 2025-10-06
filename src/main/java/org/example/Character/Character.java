package org.example.Character;

public abstract class Character {

// protected variabler för inkapsling
    protected String name;
    protected int level;
    protected int maxHp;
    protected int hp;
    protected int xp;

    //konstruktor
    public Character(String name, int level, int maxHp) {
        this.name = name;
        this.level = level;
        this.maxHp = maxHp;
        this.hp = maxHp;
        this.xp = 0;

    }
    //abstract metod
    public abstract void attack(Character target);

    //metod för funktionalitet
    public void takeDamage(int damage){
        this.hp -= damage;
        if (this.hp < 0) //Hp ska inte gå under 0
            this.hp = 0;
}

public boolean isAlive() {
    return hp > 0;
}
//Getters och setters metoderna
    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getXp() {
        return xp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }
}
