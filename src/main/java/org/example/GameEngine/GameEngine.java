package org.example.GameEngine;

import org.example.Character.Hero;
import org.example.Menu.HeroStatus;
import org.example.Menu.MenuManager;

public class GameEngine {
    private Hero hero;
    private MenuManager menuManager;
    private EncounterSystem encounterSystem;
    private HeroStatus heroStatus;

    public GameEngine(){ //Konstruktor
        this.menuManager = new MenuManager();
        this.encounterSystem = new EncounterSystem();
        this.heroStatus = new HeroStatus();
    }

    public void StartGame(){ //metod för start
        System.out.println(" Welcome to my text game ");

        runGame();
    }

    private void runGame() {

        boolean isPlaying = true;
        while (isPlaying){
            //inreloop för sålänge hero inte är död eller har inte vunnit
            while (hero.isAlive() && !hero.hasWon()){
                int choice = menuManager.MainMenu();
                menuManager.handleMenuChoice(choice);
                if (hero.hasWon()){
                System.out.println(" Congrats!! You won the game!!");
                break;
                }
            }
            if (!hero.isAlive()){
                System.out.println(" Kratos died in the battle!! ");
                int restartchoice = menuManager.GameOverMenu();
                menuManager.handleGameOverMenuChoice(restartchoice);

                if (restartchoice == 1){
                    this.hero = new Hero("Kratos");
                    System.out.println(" Welcome back Kratos!!");
                } else {
                    System.out.println(" Bye, see you soon!!");
                    isPlaying = false;
                }
            }
        }
    }
}

