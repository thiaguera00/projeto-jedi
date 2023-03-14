package ex.projetoJedi3;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cem = 0;
        int acimaDeCem = 0;
        int maioresDeDuzentos = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.println("Digite o " + i + "º número");
            int num = scan.nextInt();

            if (num > 0 && num <= 100) {
                cem++;
            } else if (num > 100 && num <= 200) {
                acimaDeCem++;
            } else {
                maioresDeDuzentos++;
            }
        }
        
        System.out.println("quantidade de números que estão entre 0 e 100 é: " + cem);
        System.out.println("quantidade de números que estão entre 101 e 200 é: " + acimaDeCem);
        System.out.println("quantidade de números que estão acima de 200 é: " + maioresDeDuzentos);
        }
    }

