package fr.xebia.hackaton.model;


import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class AnswerTest {

    @Test
    public void should_answer_question1() throws Exception {
        String answer = Answer.findAnswer("Quelle est ton Identity ? (cf dashboard)");
        assertThat(answer).isEqualTo("Gerome EGRON");

    }

    @Test
    public void should_answer_question2() throws Exception {
        String answer = Answer.findAnswer("Quelle langage utilise tu pour coder ton serveur");
        assertThat(answer).isEqualTo("Java");


    }

    @Test
    public void should_answer_question3() throws Exception {
        String answer = Answer.findAnswer("De quelle couleur est une robe de mariee");
        assertThat(answer).isEqualTo("Blanche");


    }

    @Test
    public void should_answer_plus_question() {
        // Given


        // When
        String answer = Answer.findAnswer("Quelle est la valeur decimal de Ox4c");

        // Then
        System.out.println(answer);
    }

}
