package fr.xebia.hackaton.server;

import fr.xebia.hackaton.model.Answer;
import spark.Request;
import spark.Response;
import spark.Route;

import static spark.Spark.get;
import static spark.Spark.setPort;

public class HackathonServer {
    private static final String PORT = System.getenv("PORT");

    public static void main(String[] args) {
        setPort(new Integer(PORT));

        get(new Route("/") {
            @Override
            public Object handle(Request request, Response response) {
                String q = request.queryMap("q").value();
                String answer = Answer.findAnswer(q);

                System.out.println("Question: " + q);
                System.out.println("Reponse: " + answer);

                return answer;
            }
        });

        get(new Route("/hello") {
            @Override
            public Object handle(Request request, Response response) {
                return "Hello World!";
            }
        });

    }

    private static Object sendOkResponse(Response response, String body) {
        response.status(200);
        response.body(body);
        response.type("text/xml");

        return response;
    }

}
