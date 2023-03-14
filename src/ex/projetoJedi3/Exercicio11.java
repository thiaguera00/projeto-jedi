package ex.projetoJedi3;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int cont = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.println("Digite o " + i + "º número");
            int num = scan.nextInt();

            if (num > 8) {
                cont++;
            }
        }

        System.out.println("numeros maiores que 8 são: " + cont);
    }
}
