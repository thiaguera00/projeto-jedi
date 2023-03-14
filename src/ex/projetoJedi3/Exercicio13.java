package ex.projetoJedi3;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int cont = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.println("Digite o " + i + "º número");
            int num = scan.nextInt();

            if (num > 0 && num <= 100) {
                cont++;
            }
        }

        System.out.println("quantidade de números que estão entre 0 e 100 é: " + cont);
    }
}
