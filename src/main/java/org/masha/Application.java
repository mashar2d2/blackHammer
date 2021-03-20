package org.masha;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import java.io.IOException;
import java.net.URI;

public class Application {
    public static final String BASE_URI = "http://localhost:8080/";

    public static HttpServer startServer() {
        final ResourceConfig jaxResources = new ResourceConfig().packages("org.masha");
        return GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URI), jaxResources);
    }

    public static void main(String[] args) throws IOException {
        HttpServer server = startServer();
    }
}
