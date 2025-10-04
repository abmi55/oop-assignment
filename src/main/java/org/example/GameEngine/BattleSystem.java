package org.example.GameEngine;

import org.example.Character.Hero;
import org.example.Character.Monster;

public class BattleSystem {

    public void startBattle(Hero hero, Monster monster){ //metod för starta striden
        System.out.println(" THE BATTLE BEGINS ");
        System.out.println(hero.getName() + " with level " + hero.getLevel() + " VS " + monster.getName());

        while (hero.isAlive() && monster.isAlive()){
        hero.attack(monster);

        if (!monster.isAlive()){ //om den är död
            System.out.println(monster.getName() + " died!! ");
            hero.gainxp(30);
            break;
        }
        // om den inte är död den gör en attack
        monster.attack(hero);

        if (!hero.isAlive()){
            System.out.println(hero.getName() + " died!! ");
            System.out.println(" THE GAME IS OVER ");
            break;
        }
            System.out.println("---- Status ----"); //Visar status efter varje attack runda
            System.out.println(hero.getName() + ": " + hero.getHp() + "/" + hero.getMaxHp() + " HP");
            System.out.println(monster.getName() + ": " + monster.getHp() + "/" + monster.getMaxHp() + " HP");
            System.out.println("-------------");
        }
    }
}
