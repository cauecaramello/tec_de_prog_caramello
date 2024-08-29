import com.google.gson.Gson;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException, SQLException {

        Gson gson = new Gson();
        ConnectionDB connectionDB = new ConnectionDB();
        Connection conn = connectionDB.getConnection();
        EnderecoDAO db = new EnderecoDAO(conn);
        Scanner scan = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Consultar CEP");
            System.out.println("2. Listar CEPs Consultados");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scan.nextInt();
            scan.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o CEP: ");
                    String cep = scan.nextLine();
                    String getCEP = ConsomeAPI.buscaCEP(cep);
                    Endereco endereco = gson.fromJson(getCEP, Endereco.class);
                    String getDatetime = ConsomeAPI.buscaHorario();
                    Arquivos arquivo = gson.fromJson(getDatetime, Arquivos.class);
                    db.salvarEndereco(endereco);
                    arquivo.escreverArquivo(endereco);
                    break;
                case 2:
                    db.MostrarEnderecos();
                    break;
                case 3:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);

//        scan.close();
//        System.out.print("Digite o CEP: ");
//        String cep = scan.nextLine();
//        String getCEP = ConsomeAPI.buscaCEP(cep);
//        Endereco endereco = gson.fromJson(getCEP, Endereco.class);
//        String getDatetime = ConsomeAPI.buscaHorario();
//        Arquivos arquivo = gson.fromJson(getDatetime, Arquivos.class);
//        db.salvarEndereco(endereco);
//        arquivo.escreverArquivo(endereco);
//        arquivo.lerArquivo();
//        db.MostrarEnderecos();

    }
}
