import java.util.Scanner;
public class ex10 {
    public static void main(String[] args) throws Exception {

        String senha = "Senha@123", entrada_senha;
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com uma senha: ");
        entrada_senha = scan.nextLine();
        while (!entrada_senha.equals(senha)) {
            System.out.println("Tentativa inválida! ");
            System.out.println("Entre com uma senha: ");
            entrada_senha = scan.nextLine();
        }

        System.out.println("Bem-Vindo! ");
        scan.close();
    }
}