package ex.projetoJedi3;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int soma = 0;

        for (int i = 0; i < Integer.MAX_VALUE; i ++) {
            System.out.println("Digite o numero que deseja somar: ");
            int num = scan.nextInt();

            if (num < 0) {
                break;
            }

            soma += num;
        }

        System.out.println("total: " + soma);
    }
}
