package org.example.Menu;

import org.example.Character.Hero;

public class HeroStatus {
//Visar hero status
    public void showHeroStatus(Hero hero){
        System.out.println("----Kratos Status----");
        System.out.println(" NAME: " + hero.getName());
        System.out.println(" LEVEL: " + hero.getLevel());
        System.out.println(" HP: " + hero.getHp() + "/" + hero.getMaxHp());
        System.out.println(" XP: " + hero.getXp());
        System.out.println(" WEAPON: " + hero.getWeapon().getName() + " Damage: " + hero.getWeapon().getDamage());
    }
}
