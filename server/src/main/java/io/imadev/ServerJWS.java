package io.imadev;


import jakarta.xml.ws.Endpoint;

public class ServerJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8081/", new BanqueService());
        System.out.println("Server is running on http://localhost:8081/");
    }
}