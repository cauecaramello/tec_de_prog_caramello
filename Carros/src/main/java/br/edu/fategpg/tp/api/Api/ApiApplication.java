package br.edu.fategpg.tp.api.Api;

import br.edu.fategpg.tp.api.Api.service.ConsomeApi;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class ApiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scan = new Scanner(System.in);
		ConsomeApi consomeApi = new ConsomeApi();
		String json = consomeApi.lerJson("https://parallelum.com.br/fipe/api/v1/carros/marcas");
		System.out.println(json);
		System.out.println("Selecione o numero da marca: ");
		String marca = scan.next();
		json = consomeApi.lerJson("https://parallelum.com.br/fipe/api/v1/carros/marcas/" + marca+ "/modelos");
		System.out.println(json);
		System.out.println("Selecione o numero da modelo: ");
		String modelo = scan.next();
		json = consomeApi.lerJson("https://parallelum.com.br/fipe/api/v1/carros/marcas/" + marca+ "/modelos/" + modelo+ "/anos");
		System.out.println(json);
		System.out.println("Selecione o ano: ");
		String ano = scan.next();
		json = consomeApi.lerJson("https://parallelum.com.br/fipe/api/v1/carros/marcas/" + marca+ "/modelos/" + modelo+ "/anos/" + ano1);
		System.out.println(json);







	}
}
