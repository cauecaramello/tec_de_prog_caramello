package Model;
import Service.Produto;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;


public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("INFORME O PREÇO: ");
        double precoMaximo = scanner.nextDouble();
        TreeSet<String> produtos = Produto.produtos(precoMaximo);
        System.out.println("\nPRODUTOS IMPERDÍVEIS:");
        produtos.forEach(System.out::println);
        TreeSet<String> promo = Produto.promoProd(precoMaximo);
        System.out.println("\nPRODUTOS EM PROMOÇÃO:");
        promo.forEach(System.out::println);





    }
}


