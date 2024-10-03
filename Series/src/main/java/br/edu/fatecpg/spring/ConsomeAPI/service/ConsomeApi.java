package br.edu.fatecpg.spring.ConsomeAPI.service;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class ConsomeApi {
    public String responseHttp(String url) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

    public String retorna(String link) throws IOException, InterruptedException {
        String encodedLink = URLEncoder.encode(link, StandardCharsets.UTF_8);
        return this.responseHttp("https://www.omdbapi.com/?t=" + encodedLink + "&apikey=7c065cf1");
    }
}