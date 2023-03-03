package ex.projetoJedi;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        //leitor
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu saldo: ");
        double saldo = scan.nextDouble();
        saldo = (saldo * 0.01) + saldo;
        System.out.println("Seu saldo com reajuste de 1% é: " + saldo);

        //estou em dúvida se o reajuste é para mais ou para menos  🤔
    }
}
