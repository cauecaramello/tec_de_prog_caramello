import java.util.Scanner;
public class ex9 {
    public static void main(String[] args) throws Exception {
        String nome6;
        Boolean flag = false;
        String[] nome = new String[5];
        int c = 0;
        Scanner ler = new Scanner(System.in);
        while (c < nome.length) {
            System.out.println("Digite o " + (c+1) + "º nome: ");
            nome[c] = ler.nextLine();
            c++;
        }
        System.out.println("Digite o sexto nome: ");
        nome6 = ler.nextLine();
        for (c = 0; c < nome.length; c++) {
            if (nome[c].equals(nome6)) {
                flag = true;
            }
        }
        if (flag == true) {
            System.out.println("Nome encontrado!");
        }
        else {
            System.out.println("Nome não encontrado!");
        } 
        ler.close();
    }
}