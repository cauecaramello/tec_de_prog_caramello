import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) throws Exception {
        double num;
        Scanner ler = new Scanner(System.in);
        System.out.println ("Digite o número: ");
        num = ler.nextDouble();
        if (num >= 0) {
            System.out.println("Número Positivo!");
        }
        else {
            System.out.println("Número Negativo!");
        }
        ler.close();
    }
}
