package ex.projetoJedi3;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        int cont = 0;

        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 20; i++) {
            System.out.println("Digite a " + i + "º idade");
            int idade = scan.nextInt();

            if (idade >= 18) {
                cont++;
            }
        }

        System.out.println("maiores de idades: " + cont);
    }
}
