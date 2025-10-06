package org.example.GameEngine;

import org.example.Character.Hero;

import java.util.Scanner;

public class MenuManager {
    private Scanner scanner;
    private EncounterSystem encounterSystem;
    private HeroStatus heroStatus;

    public MenuManager() {
        this.scanner = new Scanner(System.in);
        this.encounterSystem = new EncounterSystem();
        this.heroStatus = new HeroStatus();
    }

    public int mainMenu() {
        System.out.println(" Game Menu ");
        System.out.println("1. Start the game ");
        System.out.println("2. Show Kratos status");
        System.out.println("3. End the Game");
        System.out.print(" Please choose a alternative ");

        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }

    public int gameOverMenu() {
        System.out.println(" GAME OVER ");
        System.out.println("1. Play again ");
        System.out.println("2. End the game ");
        System.out.println(" Please choose a alternative ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }

    public void handleMenuChoice(int choice, Hero hero) {
        switch (choice){
            case 1:
                encounterSystem.randomEncounter(hero);
                break;
            case 2:
                heroStatus.showHeroStatus(hero);
                break;
            case 3:
                System.out.println(" You quit the game!! ");
                System.exit(0);
                break;
            default:
                System.out.println(" Invalid choice, try again!! ");
        }
    }
}

