package org.example.GameEngine;

import org.example.Character.Boss;
import org.example.Character.Goblin;
import org.example.Character.Hero;
import org.example.Character.Monster;

public class EncounterSystem {
    private BattleSystem battleSystem;

    public EncounterSystem() {
        this.battleSystem = new BattleSystem();
    }
    public void randomEncounter(Hero hero){
        double random = Math.random();

        if (random < 0.70){
            //70% chans för vanlig monster
            System.out.println(" Ogre shows up! ");
            Monster Ogre = new Goblin();
            battleSystem.startBattle(hero,Ogre);
        } else if (random < 0.80) {
            //10% chans för Boss
            System.out.println(" The boss shows up! ");
            Monster Odin = new Boss();
            battleSystem.startBattle(hero,Odin);
        } else {
            //20% chans för säkerplats
            System.out.println("-----Safe zone-----");
            System.out.println(" No enemies here. ");
        }
    }
}
