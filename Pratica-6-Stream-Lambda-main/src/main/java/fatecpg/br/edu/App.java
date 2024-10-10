package fatecpg.br.edu;
import fatecpg.br.edu.service.Comment;
import fatecpg.br.edu.service.CommentAdapter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        try {
                  // Criar o cliente HTTP
            HttpClient client = HttpClient.newHttpClient();

            // URL da API
            String url = "https://jsonplaceholder.typicode.com/comments";

            // Criar a requisição
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new java.net.URI(url))
                    .GET() // Método GET
                    .build();

            // Enviar a requisição e obter a resposta
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Configurar GSON com o adaptador
            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.registerTypeAdapter(Comment.class, new CommentAdapter());
            Gson gson = gsonBuilder.create();

            // Converter JSON para lista de comentários
            List<Comment> comments = gson.fromJson(response.body(), new TypeToken<List<Comment>>(){}.getType());

            // Filtrar comentários e preparar o e-mail
            List<Comment> filteredComments = comments.stream()
                    .filter(comment -> comment.body().length() > 20) 
                    .collect(Collectors.toList());

            // Exibir os comentários filtrados
            filteredComments.forEach(comment -> {
                System.out.println();
                System.out.println("Nome: " + comment.name());
                System.out.println("E-mail: " + comment.email());
                System.out.println("Comentário: " + comment.body());
                System.out.println("--------------------------------------");
            });


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

