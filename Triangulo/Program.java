import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws IOException {
        Scanner leia = new Scanner(System.in);
        double A = leia.nextDouble();
        double B = leia.nextDouble();
        double C = leia.nextDouble();
        double soma = A + B + C;

        if (A + B > C && A + C > B && B + C > A) {
            double perimetro = A + B + C;
            System.out.printf("Perimetro = %.1f%n", perimetro);
        } else {
            double area = ((A + B) * C) / 2;
            System.out.printf("Area = %.1f%n", area);
        }
    }
}