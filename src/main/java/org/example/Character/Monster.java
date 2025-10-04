package org.example.Character;

public abstract class Monster extends Character{


    public Monster(String name, int level, int maxHp) {
        super(name, level, maxHp);
    }

    public abstract void specialAttack(Character target);
}
