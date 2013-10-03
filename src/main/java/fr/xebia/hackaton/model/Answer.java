package fr.xebia.hackaton.model;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        put("Combien font 1 plus 0 ?", "1");
        put("Combien font 2 plus 3 ?", "5");
        put("Combien font 4 fois 2 ?", "8");
        put("Combien font 3 plus 4 ?", "7");
        put("Combien font 0 plus 4 ?", "4");
        put("Combien font 0 moins 1 ?", "-1");
        put("Combien font 1 moins 0 ?", "1");
        put("Combien font 2 moins 1 ?", "1");
        put("Combien font 4 plus 4 ?", "8");
        put("Combien font 0 plus 1 ?", "1");


    }};

    public static String findAnswer(String question) {

        Pattern plusPattern = Pattern.compile("Combien font (.*) plus (.*) \\?");
        Pattern moinsPattern = Pattern.compile("Combien font (.*) moins (.*) \\?");
        Pattern foisPattern = Pattern.compile("Combien font (.*) fois (.*) \\?");

        Matcher plusMatcher = plusPattern.matcher(question);
        Matcher moinsMatcher = moinsPattern.matcher(question);
        Matcher foisMatcher = foisPattern.matcher(question);

        if (plusMatcher.find()) {
            int i = Integer.parseInt(plusMatcher.group(1)) + Integer.parseInt(plusMatcher.group(2));

            return "" + i;
        }

        if (moinsMatcher.find()) {
            int i = Integer.parseInt(moinsMatcher.group(1)) - Integer.parseInt(moinsMatcher.group(2));

            return "" + i;
        }

        if (foisMatcher.find()) {
            int i = Integer.parseInt(foisMatcher.group(1)) * Integer.parseInt(foisMatcher.group(2));

            return "" + i;
        }

        return answers.get(question);
    }

    private static Integer multiply(Integer i1, Integer i2) {
        return i1 * i2;
    }
}
