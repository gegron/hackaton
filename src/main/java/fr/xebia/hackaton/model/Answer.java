package fr.xebia.hackaton.model;

import java.util.HashMap;
import java.util.Map;

public class Answer {

    static Map<String, String> answers = new HashMap<String, String>() {{
        put("Quelle est ton Identity ? (cf dashboard)", "Gerome EGRON");
        put("Quelle langage utilise tu pour coder ton serveur", "Java");
    }};

    public static String findAnswer(String question) {
        return answers.get(question);
    }
}
