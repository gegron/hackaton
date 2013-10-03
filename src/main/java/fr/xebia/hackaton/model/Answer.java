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
        put("Que boit la vache ?", "lait");
        put("De quelle couleur est le cheval blanc d'Henry 4", "blanc");

    }};

    public static String findAnswer(String question) {
        return answers.get(question);
    }
}
