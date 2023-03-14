package ex.projetoJedi3;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scan.nextLine();

        for (int i = 0; i < 10; i++) {
            System.out.println(nome);
        }
    }
}
