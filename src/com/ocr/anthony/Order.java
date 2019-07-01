package com.ocr.anthony;

import java.util.Scanner;

public class Order {
    /**
     * Display all available menus in the restaurant.
     */
    public void displayAvailableMenu() {
        System.out.println("Choix Menu Wok :");
        System.out.println("1- Poulet ");
        System.out.println("2- Boeuf ");
        System.out.println("3- Végétarien ");
        System.out.println("Choisissez votre Menu");
    }
    /**
     * Display a selected menu.
     * @param nbMenu The selected menu.
     */
    public void displaySelectedMenu(int nbMenu) {
    switch (nbMenu) {
        case 1:
            System.out.println("Vous avez choisi comme menu : poulet");
            break;
        case 2:
            System.out.println("Vous avez choisi comme menu : boeuf");
            break;
        case 3:
            System.out.println("Vous avez choisi comme menu : végétarien");
            break;
        default:
            System.out.println("Vous n'avez pas choisi de menu parmi les choix proposés");
            break;
        }
    }

    /** Run Asking process for a Menu */
    public void runMenu() {
        this.displayAvailableMenu();
        Scanner sc = new Scanner(System.in);
        int nb = sc.nextInt();
        this.displaySelectedMenu(nb);
        /**
        Scanner Side_Scan = new Scanner(System.in);
        int No_Side = sc.nextInt();
        this.displaySelectedSide(); */
    }

    /**
     * Sélectionner un type de side, (et si choix parmit tout le rest.. très logique...)
     * @param SideNo
     * @param AllSideTrue
     */
    public void displaySelectedSide(int SideNo, boolean AllSideTrue) {
        if (AllSideTrue) {
        switch (SideNo) {
            case 1:
                System.out.println("Vous avez choisi comme accompagnement : légumes frais");
                break;
            case 2:
                System.out.println("Vous avez choisi comme accompagnement : frites");
                break;
            case 3:
                System.out.println("Vous avez choisi comme accompagnement : riz");
                break;
            default:
                System.out.println("Vous n'avez pas choisi d'accompagnement parmi les choix proposés");
                break;
        }
    } else {
        switch (SideNo) {
            case 1:
                System.out.println("Vous avez choisi comme accompagnement : riz");
                break;
            case 2:
                System.out.println("Vous avez choisi comme accompagnement : pas de riz");
                break;
            default:
                System.out.println("Vous n'avez pas choisi d'accompagnement parmi les choix proposés");
                break;
        }
    }

    }

    public void displaySelectedDrink(int No_Drink) {
        switch (No_Drink){
            case 1:
                System.out.println("Vous avez choisi une eau plate !");
                break;
            case 2:
                System.out.println("Vous avez choisi une eau gazeuse !");
                break;
            case 3:
                System.out.println("Vous avez choisi un breizh cola !");
                break;
            default:
                System.out.println("Vous n'avez pas choisi de boisson !");
                break;
        }

    }
}