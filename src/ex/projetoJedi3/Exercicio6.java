package ex.projetoJedi3;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        int soma = 0;

        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 20; i++) {
            System.out.println("Digite a " + i + "º idade");
            int num = scan.nextInt();
            soma += num;
        }

        System.out.println("soma das idades: " + soma);
    }
}
