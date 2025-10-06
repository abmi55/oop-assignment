package org.example.GameEngine;

import org.example.Character.Hero;

public class GameEngine {
    private Hero hero;
    private MenuManager menuManager;
    private EncounterSystem encounterSystem;
    private HeroStatus heroStatus;

    public GameEngine(){ //Konstruktor
        this.menuManager = new MenuManager();
        this.hero = new Hero("Kratos");
    }

    public void startGame(){ //metod för start
        System.out.println(" Welcome to my text game ");

        runGame();
    }

    private void runGame() {

        boolean Playing = true;
        while (Playing){
            //inreloop för sålänge hero inte är död eller har inte vunnit
            while (hero.isAlive() && !hero.hasWon()){
                int choice = menuManager.mainMenu();
                menuManager.handleMenuChoice(choice, hero);
                if (hero.hasWon()){
                System.out.println(" Congrats!! You won the game!!");
                break;
                }
            }
            //Gameover hantering
            if (!hero.isAlive()){
                System.out.println(" Kratos died in the battle!! ");
                int restartchoice = menuManager.gameOverMenu();

                if (restartchoice == 1){
                    this.hero = new Hero("Kratos");
                    System.out.println(" Welcome back Kratos!!");
                } else {
                    System.out.println(" Bye, see you soon!!");
                    Playing = false;
                }
        }
        }
    }
}

