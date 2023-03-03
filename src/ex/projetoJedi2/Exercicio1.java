package ex.projetoJedi2;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        //leitor
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        //armazenar valor digitado pelo usuario
        int num = scan.nextInt();
        //condição
        if (num > 0) {
            System.out.println("o numero: " + num + " é positivo");
        } else {
            System.out.println("o numero: " + num + " é negativo");
        }
    }
}
