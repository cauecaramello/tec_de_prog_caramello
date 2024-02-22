import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) throws Exception {

        int num1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um valor");
        num1 = scan.nextInt();
        int fat = num1;
        while (num1 > 1) {
            fat = fat * (num1 - 1);
            System.out.println(num1 + " x " + (num1 - 1) + " = " + fat);
            num1--;
        }
        scan.close();
    }
}