package ex.projetoJedi3;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = scan.nextLine();

        System.out.println("Digite o numero que deja que seja repetido seu nome");
        int num = scan.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println(nome);
        }
    }
}
