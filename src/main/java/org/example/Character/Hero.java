package org.example.Character;

import Weapon.Weapon;

import java.util.Random;

public class Hero extends Character {
    private Weapon weapon;

    //skapar ny hjälte
    public Hero(String name) {
        super(" Kratos ", 1,100);//Anropar Characters kunstruktorn
        this.weapon = new Weapon("Blades of chaos",10);
    }
    public Weapon getWeapon(){
        return weapon;
    }

    @Override
    public void attack(Character target) {
        int baseDamage = weapon.getDamage() + level;
        Random random = new Random();

        int damage = baseDamage + random.nextInt(5);//lägger till lite slumpmässigt skada på heros base damage
        System.out.println(name + "Attacks with " + weapon.getName() + " and does " + damage + " damage");
        target.takeDamage(damage);
    }

    public void gainxp(int amount) { //Metod för att hero ska få xp och kontorllerar level upp
        this.xp += amount; //öka xp med amount
        System.out.println(name + " Gets " + amount + "XP");
        checkLevelUp();
    }

    private void checkLevelUp() { //hjälpmetod för checklevelup och level up vilkor
        while (xp >= 100 && level < 10){
            level++;
            maxHp += 20;
            hp = maxHp;
            xp -= 100;
            System.out.println(name + " leveled up to " + level + " and max HP increase to " + maxHp +"!!");
        }
    }
}
