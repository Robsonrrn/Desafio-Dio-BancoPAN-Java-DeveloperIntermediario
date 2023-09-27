

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int morangos = input.nextInt();
        int macas = input.nextInt();
        double vaMorango = 0;
        double vaMacas = 0;
        double soma = 0;

        if (morangos > 5) {
            vaMorango = 2.20;
        }else {
            vaMorango = 2.50;
        }
        double totalMorango = morangos * vaMorango;

        if (macas > 5) {
            vaMacas = 1.50;
        }else {
            vaMacas = 1.80;
        }
        double totalMaca = macas * vaMacas;

        soma = totalMaca + totalMorango;

        if (morangos + macas > 8 || soma > 25) {
            soma -= soma/10;
        }
        System.out.println(soma);
    }
}
