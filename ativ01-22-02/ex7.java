import java.util.Scanner;
public class ex7 {
    public static void main(String[] args) throws Exception {
        int idade;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        idade = ler.nextInt();
        if (idade < 18){
            System.out.println("Você é menor de idade!");
        }
        else if (idade >= 18 && idade < 60){
        System.out.println("Você é uma pessoa adulta!");
        }
        else {
            System.out.println("Você é uma pessoa idosa!");
        }
        ler.close();
    }
}