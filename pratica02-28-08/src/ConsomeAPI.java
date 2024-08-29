import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsomeAPI {
    public static String request(String url) throws IOException, InterruptedException {
        //Client, Request, Response
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                //.uri(URI.create("https://viacep.com.br/ws/"+cep+"/json/"))
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
    public static String buscaCEP(String cep) throws IOException, InterruptedException {
        String url = "https://viacep.com.br/ws/"+cep+"/json/";
        return request(url);
    }
    public static String buscaHorario() throws IOException, InterruptedException {
        String url = "https://worldtimeapi.org/api/timezone/America/Sao_Paulo";
        return request(url);
    }
}
