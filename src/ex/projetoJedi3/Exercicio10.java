package ex.projetoJedi3;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("digite um numero que deseja calcular a tabuada");
        int num = scan.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " +  (num * i));
        }
    }
}
