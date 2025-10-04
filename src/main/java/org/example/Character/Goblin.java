package org.example.Character;

import java.util.Random;

public class Goblin extends Monster{

    public Goblin(){
        super(" Ogre ", 1,30);
    }

    @Override
    public void attack(Character target) { //Implementering attack metod från character
        Random random = new Random();
        int damage = 5 + random.nextInt(6);
        System.out.println(name + "Attacks and does " + damage + "damage! ");
        target.takeDamage(damage);
    }

    @Override
    public void specialAttack(Character target) {
        attack(target);
    }
}
