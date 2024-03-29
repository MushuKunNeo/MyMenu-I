package com.ocr.anthony;

public class Interaction {
    //static Scanner sc = new Scanner(System.in);
    /**
     * Display a question about a category in the standard input, get response and display it
     * @param category the category of the question
     * @param responses available responses
     * @return
     */
    public static int askSomething(String category, String[] responses) {
        System.out.println("Choix " + category);
        for (int i = 1; i <= responses.length; i++)
            System.out.println(i + " - " + responses[i - 1]);
        System.out.println("Que souhaitez-vous comme " + category + "?");
        int nbResponse;
        boolean responseIsGood;
        do {
            nbResponse = Order.sc.nextInt();
            responseIsGood = (nbResponse >= 1 && nbResponse <= responses.length);
            if (responseIsGood) {
                String choice = "Vous avez choisi comme " + category + " : " + responses[nbResponse - 1];
                Order.orderSummary += choice + "%n";
                System.out.println(choice);
            }
            else {
                boolean isVowel = "aeiouy".contains(Character.toString(category.charAt(0)));
                if (isVowel)
                    System.out.println("Vous n'avez pas choisi d'" + category + " parmi les choix proposés");
                else
                    System.out.println("Vous n'avez pas choisi de " + category + " parmi les choix proposés");
            }
        } while (!responseIsGood);
        return nbResponse;
    }


}
