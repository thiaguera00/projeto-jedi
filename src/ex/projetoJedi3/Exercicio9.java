package ex.projetoJedi3;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome, nomeMaisNovo = "";
        int idade, idadeMaisNovo = 999;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o nome da " + i + "º pessoa:");
            nome = scan.nextLine();

            System.out.println("Digite a idade da " + i + "º pessoa:");
            idade = scan.nextInt();
            scan.nextLine();

            if (idade < idadeMaisNovo) {
                idadeMaisNovo = idade;
                nomeMaisNovo = nome;
            }
        }

        System.out.println("a pessoa mais nova é: " + nomeMaisNovo + ", com " + idadeMaisNovo + " anos.");
    }
}
