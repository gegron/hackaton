package fr.xebia.hackaton.model;

import java.util.HashMap;
import java.util.Map;

public class Answer {

    static Map<String, String> answers = new HashMap<String, String>() {{
        put("Quelle est ton Identity ? (cf dashboard)", "Gerome EGRON");
    }};

    public static String findAnswer(String question) {
        return answers.get(question);
    }
}
