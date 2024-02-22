import java.util.Scanner;
public class ex8 {
    public static void main(String[] args) throws Exception {

        int num1, contador = 0, resultado = 1, acumulativo = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um valor");
        num1 = scan.nextInt();
        while (num1 > contador) {
            System.out.println(resultado);
            acumulativo = acumulativo + resultado;
            resultado = resultado + 2;
            contador++;
        }
        System.out.println(acumulativo);
        scan.close();
    }
}