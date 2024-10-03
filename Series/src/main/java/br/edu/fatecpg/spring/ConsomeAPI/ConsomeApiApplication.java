package br.edu.fatecpg.spring.ConsomeAPI;

import br.edu.fatecpg.spring.ConsomeAPI.model.Filme;
import br.edu.fatecpg.spring.ConsomeAPI.model.Serie;
import br.edu.fatecpg.spring.ConsomeAPI.service.ConsomeApi;
import br.edu.fatecpg.spring.ConsomeAPI.service.ConverteDado;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ConsomeApiApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ConsomeApiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ConverteDado conversor = new ConverteDado();
        ConsomeApi consomeApi = new ConsomeApi();

        while (true) {
            System.out.println("\n1. Buscar Filme");
            System.out.println("2. Buscar Série");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite o nome do filme: ");
                    String filme = scanner.nextLine();
                    String json = consomeApi.retorna(filme);
                    try {
                        Filme filmes = conversor.retornarFilme(json);
                        if (filmes.nome() != null) {
                            System.out.println(filmes);
                        } else {
                            System.out.println("Nenhum filme encontrado com esse nome.");
                        }
                    } catch (JsonProcessingException e) {
                        System.out.println("Erro ao processar o JSON: " + e.getMessage());
                    }
                }
                case 2 -> {
                    System.out.print("Digite o nome da série: ");
                    String serie = scanner.nextLine();
                    String json = consomeApi.retorna(serie);
                    try {
                        Serie series = conversor.retornarSerie(json);
                        if (series.nome() != null) {
                            System.out.println(series);
                        } else {
                            System.out.println("Nenhuma série encontrada com esse nome.");
                        }
                    } catch (JsonProcessingException e) {
                        System.out.println("Erro ao processar o JSON: " + e.getMessage());
                    }
                }
                case 3 -> {
                    System.out.println("Saindo...");
                    return;
                }
                default -> System.out.println("Opção inválida.");
            }
        }
    }
}