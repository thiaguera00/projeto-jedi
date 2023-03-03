package ex.projetoJedi2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        //variaveis para receber numeros digitado pelo usuario
        int num1, num2, num3;
        //leitor
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        num1 = scan.nextInt();
        System.out.println("Digite o segundo numero");
        num2 = scan.nextInt();
        System.out.println("Digite o terceiro numero");
        num3 = scan.nextInt();
        //condição
        if (num1 > num2 && num2 > num3) {
            System.out.println("O numero: " + num1 + " é o maior");
        } else if (num2 > num3 && num3 > num1) {
            System.out.println("O numero: " + num2 + " é o maior");
        } else {
            System.out.println("O numero: " + num3 + " é o maior");
        }
    }
}
