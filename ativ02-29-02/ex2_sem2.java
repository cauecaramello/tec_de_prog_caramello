import java.util.Scanner;

public class ex2_sem2 {
    public static void main(String[] args) {
        String[][] usuario = new String[6][2];
        String user, senha;
        boolean flag = false;
        Scanner scan = new Scanner(System.in);
        for (int l = 0; l < 6; l++) {
            for (int c = 0; c < 2; c++) {
                if (c == 0) {
                    System.out.println("Digite o usuário");
                } else {
                    System.out.println("Digite a senha");
                }
                usuario[l][c] = scan.nextLine();
            }
        }
        System.out.println("Digite o nome de usuário");
        user = scan.nextLine();
        System.out.println("Digite a senha de usuário ");
        senha = scan.nextLine();
        for (int l = 0; l < 6; l++) {
            for (int c = 0; c < 2; c++) {
                if (user.equals(usuario[l][0])) {
                    if (senha.equals(usuario[l][1])) {
                        System.out.println("bem vindo " + usuario[l][0]);
                        flag = true;
                        break;
                    }
                }
            }
        }
        if (flag == false) {
            System.out.println("Usuário não encontrado");
        }
        scan.close();
    }
}
