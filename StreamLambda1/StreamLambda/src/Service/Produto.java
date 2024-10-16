package Service;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;


public class Produto {
    private String title;
    private int price;

    public static TreeSet<String> produtos(double precos) throws IOException, InterruptedException {
        ConsomeApi api = new ConsomeApi();
        String jsonResponse = api.consomeApi();
        Gson gson = new Gson();
        List<Produto> preco = gson.fromJson(jsonResponse,new TypeToken<List<Produto>>(){}.getType());
        return preco.stream()
                .filter(p -> p.price < precos)
                .map(n ->  "Produto: " + n.title + " - Preço: R$" + n.price)
                .collect(Collectors.toCollection(TreeSet::new));
    }
    public static TreeSet<String> promoProd(double preco1) throws IOException, InterruptedException {
        ConsomeApi api = new ConsomeApi();
        String jsonResponse = api.consomeApi();
        Gson gson = new Gson();
        List<Produto> promo = gson.fromJson(jsonResponse,new TypeToken<List<Produto>>(){}.getType());
        return promo.stream()
                .filter(p -> p.price <= preco1)
                .map(n ->  "PRODUTO: " + n.title.toUpperCase() + " - PREÇO: R$" + n.price)
                .collect(Collectors.toCollection(TreeSet::new));
    }
}
