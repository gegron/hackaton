package fr.xebia.hackaton.model;

import java.util.HashMap;
import java.util.Map;

public class Answer {

    static Map<String, String> answers = new HashMap<String, String>() {{
        put("Quelle est ton Identity ? (cf dashboard)", "Gerome EGRON");
        put("Quelle langage utilise tu pour coder ton serveur", "Java");
        put("De quelle couleur est une robe de mariee", "Blanche");
        put("Quelle couleur est le contraire du noir", "blanc");
        put("Quel est le résultat d'addition de toutes les couleurs", "blanc");
        put("Que boit la vache ?", "de l'eau");
        put("De quelle couleur est le cheval blanc d'Henry 4", "blanc");
        put("quelle est la commande pour faire un save and quit dans VI ?", ":wq");
        put("de qui Indiana jones tient-il son nom ?", "du chien");
        put("qui sera le prochain batman ?", "ben affleck");
        put("Qui est le fondateur de Facebook ?", "mark zuckerberg");
        put("De quelle serie vient la phrase : live long and prosper", "star trek");
        put("Combien font 1 fois 3 ?", "3");
        put("Combien font 2 moins 0 ?", "2");
        put("Combien font 2 fois 1 ?", "2");

    }};

    public static String findAnswer(String question) {
        return answers.get(question);
    }
}
