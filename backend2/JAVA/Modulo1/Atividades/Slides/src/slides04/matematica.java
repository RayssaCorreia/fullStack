package slides04;
import java.util.Scanner;

public class matematica {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x, y, z;
        double  A, B, C;
        double delta, a, b, c, x1, x2;

        System.out.println("Digite o valor de x:");
        x = sc.nextDouble();
        System.out.println("Digite o valor de y:");
        y = sc.nextDouble();
        System.out.println("Digite o valor de z:");
        z = sc.nextDouble();
        System.out.println();

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);

        System.out.println("Raiz quadrada de  x  = " + A);
        System.out.println("Raiz quadrada de  y = " + B);
        System.out.println("Raiz quadrada de 25 = " + C);
        System.out.println();

        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);
        System.out.println(x + " elevado a y = " + A);
        System.out.println(x + " elevado ao quadrado = " + B);
        System.out.println("5 elevado ao quadrado = " + C);
        System.out.println();

        A = Math.abs(y);
        B = Math.abs(z);
        System.out.println("Valor absoluto de y  = " + A);
        System.out.println("Valor absoluto de z  = " + B);
        System.out.println();

    }
}