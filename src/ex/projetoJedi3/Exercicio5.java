package ex.projetoJedi3;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        int soma = 0;

        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o " + i + "º numero");
            int num = scan.nextInt();
            soma += num;
        }

        System.out.println("total: " + soma);
    }
}
