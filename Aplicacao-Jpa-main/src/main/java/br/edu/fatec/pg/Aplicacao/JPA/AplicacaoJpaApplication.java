package br.edu.fatec.pg.Aplicacao.JPA;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import br.edu.fatec.pg.Aplicacao.JPA.services.*;
import br.edu.fatec.pg.Aplicacao.JPA.models.*;
import org.springframework.context.annotation.Bean;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Scanner;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

@SpringBootApplication
public class AplicacaoJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AplicacaoJpaApplication.class, args);
    }

    @Bean
    CommandLineRunner run(CepService cepService) {
        return args -> {
            Scanner scanner = new Scanner(System.in);
            int option;

            do {
                System.out.println("Menu:");
                System.out.println("1. Consultar um CEP");
                System.out.println("2. Ver todos os CEPs pesquisados");
                System.out.println("3. Sair");
                System.out.print("Escolha uma opção: ");
                option = scanner.nextInt();
                scanner.nextLine(); // Limpa o buffer do scanner

                switch (option) {
                    case 1:
       System.out.print("Digite o CEP a ser consultado (ex: 01001-000): ");
    String codigo = scanner.nextLine();
  
    // Consulta a API para obter os dados do CEP
    Cep cep = consultarCepNaApi(codigo);
    if (cep != null) {
        // Salva o CEP no banco de dados
        Cep cepSalvo = cepService.saveCep(cep);
        if (cepSalvo != null) {
            System.out.println("CEP consultado e armazenado: " + cep.getCodigo());
        } else {
            System.out.println("O CEP " + cep.getCodigo() + " já está armazenado no banco de dados.");
        }
    } else {
        System.out.println("CEP não encontrado.");
    }                        break;

                    case 2:
                        List<Cep> ceps = cepService.findAllCeps();
                        if (ceps.isEmpty()) {
                            System.out.println("Nenhum CEP encontrado.");
                        } else {
                            System.out.println("CEPS pesquisados:");
                            System.out.println("");
                            for (Cep c : ceps) {
                                System.out.println(c);
                            }
                        }
                        break;

                    case 3:
                        System.out.println("Saindo...");
                        break;

                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }

                System.out.println(); // Linha em branco para melhor visualização
            } while (option != 3);

            scanner.close();
        };
    }

    // Método para consultar a API ViaCEP
    private Cep consultarCepNaApi(String codigo) {
        try {
            String urlString = "https://viacep.com.br/ws/" + codigo + "/json/";
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            if (connection.getResponseCode() == 200) {
                ObjectMapper objectMapper = new ObjectMapper();
                Cep cep = objectMapper.readValue(connection.getInputStream(), Cep.class);
                return cep;
            }
        } catch (IOException e) {
            System.out.println("Erro ao consultar a API: " + e.getMessage());
        }
        return null; // Retorna null se não conseguir obter os dados
    }
}
