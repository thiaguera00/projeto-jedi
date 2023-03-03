package ex.projetoJedi;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        //leitor
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número para descobrir o antecessor e seu sucessor: ");
        //armazenar numero digitado pelo usuario
        int num = scan.nextInt();

        System.out.println("O numero digitado é: " + num);
        System.out.println("O seu antecessor é: " + (num - 1));
        System.out.println("O seu sucessor é: " + (num + 1));
    }
}
