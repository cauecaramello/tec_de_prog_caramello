import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) throws Exception {

        int num1, c = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um valor");
        num1 = scan.nextInt();
        while (c <= 10) {
            int res = num1*c;
            System.out.println(num1 +" x "+ c +" = "+ res );
            c++;
        }
        scan.close();
    }
}