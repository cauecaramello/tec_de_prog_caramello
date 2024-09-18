package br.edu.fatecpg.apigemini.view;
import br.edu.fatecpg.apigemini.service.ConsomeApi;

import java.io.IOException;
import java.util.Scanner;

import static br.edu.fatecpg.apigemini.service.ConsomeApi.fazerPergunta;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scan = new Scanner(System.in);
        boolean flag = false;
        while (!flag) {
            System.out.println("Menu:");
            System.out.println("1. Fazer uma pergunta");
            System.out.println("2. Sair");
            System.out.print("Escolha uma opção: ");
            int escolha = scan.nextInt();
            scan.nextLine();
            switch (escolha) {
                case 1:
                    System.out.print("Digite sua pergunta: ");
                    String pergunta = scan.nextLine();
                    String resposta = fazerPergunta(pergunta);
                    System.out.println(resposta);
                    break;
                case 2:
                    flag = true;
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        scan.close();
    }
    }

