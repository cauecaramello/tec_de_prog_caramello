import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) throws Exception {
        int valor;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        valor = ler.nextInt();
        if (valor % 2 == 0){
            System.out.println("O número é par!");
        }
        else{
        System.out.println("O número é ímpar!");
        }
        ler.close();
    }
}