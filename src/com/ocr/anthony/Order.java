package com.ocr.anthony;

import java.util.Scanner;

public class Order {

    static Scanner sc = new Scanner(System.in);
    static String orderSummary = "";

    /** Run Asking process for a Menu */
    public void runMenu() {
        //this.displayAvailableMenu();
        int NO_Menu = askMenu();
        //do {
            //NO_Menu = sc.nextInt();
            //this.displaySelectedMenu(NO_Menu);
            switch (NO_Menu) {
                case 1:
                    askSide(true);
                    askDrink();
                    break;
                case 2:
                    askSide(true);
                    break;
                case 3:
                    askSide(false);
                    askDrink();
                    break;
            }
        //} while(NO_Menu < 1 || NO_Menu > 3);
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

    /**
     * Run asking process for several menus.
     */
    public void runMenus() {
        System.out.println("Combien souhaitez vous commander de menu ?");
        int menuQuantity = sc.nextInt();
        orderSummary = "Résumé de votre commande :%n";
        for (int i = 0; i < menuQuantity; i++) {
            orderSummary += "Menu " + (i + 1) + ":%n";
            runMenu();
        }
        System.out.println("");
        System.out.println(String.format(orderSummary));
    }
//        int counter = 0;

/*        while (counter < menuQuantity) {
            runMenu();
            counter = counter + 1;
        }*/



    /**
     * Display a question about menu in the standard input, get response and display it
     * @return
     */
    public int askMenu() {
        String[] menus = {"poulet", "boeuf", "végétarien"};
        //int Nb_Menu = Interaction.askSomething("menu", menus);
        return Interaction.askSomething("menu", menus);
    }

    /**
     * Display a question about side in the standard input, get response and display it
     */
    public void askSide(boolean allSidesEnable) {
        if (allSidesEnable) {
            String[] responsesAllSide = {"légumes frais", "frites", "riz"};
            Interaction.askSomething("accompagnement", responsesAllSide);
        } else {
            String[] responsesOnlyRice = {"riz", "pas de riz"};
            Interaction.askSomething("accompagnement", responsesOnlyRice);
        }
    }

    /**
     * Display a question about drink in the standard input, get response and display it
     */
    public void askDrink() {
        String[] responsesDrink = {"eau plate", "eau gazeuse", "soda"};
        Interaction.askSomething("boisson", responsesDrink);
    }
}

