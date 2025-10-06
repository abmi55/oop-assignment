package org.example.Character;

import java.util.Random;

public class Boss extends Monster{

    public Boss(){
        super(" Odin ",3,150);
    }

    @Override
    public void attack(Character target) {
        //30% chans för specialattack
        if (Math.random() < 0.3){
            specialAttack(target);
        } else {
            Random random = new Random();
            //Vanlig attack som gör 15-20 skada+level+slump
            int damage = 15 + level + random.nextInt(3);
            System.out.println(name + " Attacks and does " + damage + "Damage!");
            target.takeDamage(damage);
        }
    }

    @Override
    public void specialAttack(Character target) {
        Random random = new Random();
        //Dubbel skada +
        int damage = (15 + level) * 2 + random.nextInt(3);
        System.out.println(" !!BOSS SPECIAL ATTACK!! " + name + " does " + damage + "damage!");
        target.takeDamage(damage);
    }
}
