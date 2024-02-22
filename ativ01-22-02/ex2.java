import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) throws Exception {

        int num1, num2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o primeiro valor");
        num1 = scan.nextInt();
        System.out.println("Entre com o segundo valor");
        num2 = scan.nextInt();
        if (num1 > num2) {
            System.out.println("o Número: " + num1 + " é maior do que "+num2);
        }
        else if(num2 > num1){
            System.out.println("o Número: " + num2 + " é maior do que "+num1);
        }
        else{
            System.out.println("Os números são iguais");
        }
        scan.close();
    }
}