package fr.xebia.hackaton.server;

import spark.Request;
import spark.Response;
import spark.Route;

import static spark.Spark.get;
import static spark.Spark.setPort;

public class HackathonServer {
    private static final String PORT = System.getenv("PORT");

    public static void main(String[] args) {
        setPort(new Integer(PORT));

        get(new Route("/hello") {
            @Override
            public Object handle(Request request, Response response) {
                return "Hello World!";
            }
        });
    }

}
