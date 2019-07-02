package com.ocr.anthony;

import java.util.Scanner;

public class Order {

    Scanner sc = new Scanner(System.in);

    /** Run Asking process for a Menu */
    public void runMenu() {
        this.displayAvailableMenu();
        int NO_Menu;
        do {
            NO_Menu = sc.nextInt();
            this.displaySelectedMenu(NO_Menu);
            switch (NO_Menu) {
                case 1:
                    displayAvailableSide(true);
                    int nbSide;
                    do {
                        nbSide = sc.nextInt();
                        displaySelectedSide(nbSide, true);
                    } while (nbSide  <1 || nbSide > 3);
                        displayAvailableDrink();
                        int nbDrink;
                    do{
                        nbDrink = sc.nextInt();
                        displaySelectedDrink(nbDrink);
                    } while (nbDrink  < 1 || nbDrink > 3);
                    break;
                case 2:
                    displayAvailableSide(true);
                    do {
                        nbSide = sc.nextInt();
                        displaySelectedSide(nbSide, true);
                    } while (nbSide < 1 || nbSide > 3);
                    break;
                case 3:
                    displayAvailableSide(false);
                    do{
                        nbSide = sc.nextInt();
                        displaySelectedSide(nbSide, false);
                    } while (nbSide < 1 || nbSide > 2);
                    displayAvailableDrink();
                    do {
                        nbDrink = sc.nextInt();
                        displaySelectedDrink(nbDrink);
                    }while (nbDrink  < 1 || nbDrink > 3);
                    break;
            }
        } while(NO_Menu < 1 || NO_Menu > 3);
        /**
        Scanner Side_Scan = new Scanner(System.in);
        int No_Side = sc.nextInt();
        this.displaySelectedSide(); */
    }

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

    /**
     * Display all available sides depending on all sides enable or not.
     * All sides = vegetables, frites and rice
     * No all sides = rice or not
     * @param allSideEnable enable display for all side or not
     */
    public void displayAvailableSide(boolean allSideEnable) {
        System.out.println("Choix accompagnement");
        if (allSideEnable) {
            System.out.println("1 - légumes frais");
            System.out.println("2 - frites");
            System.out.println("3 - riz");
        } else {
            System.out.println("1 - riz");
            System.out.println("2 - pas de riz");
        }
        System.out.println("Que souhaitez-vous comme accompagnement ?");
    }

     /**
     * Display all available drinks in the restaurant
     */
    public void displayAvailableDrink() {
        System.out.println("Choix boisson");
        System.out.println("1 - eau plate");
        System.out.println("2 - eau gazeuse");
        System.out.println("3 - soda");
        System.out.println("Que souhaitez-vous comme boisson ?");
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

    public void runMenus() {
        System.out.println("Combien souhaitez vous commander de menu ?");
        int menuQuantity = sc.nextInt();

        for(int i = 0 ; i < menuQuantity; i++){
            runMenu();
        }
//        int counter = 0;

/*        while (counter < menuQuantity) {
            runMenu();
            counter = counter + 1;
        }*/
    }
}