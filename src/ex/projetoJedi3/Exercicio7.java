package ex.projetoJedi3;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        int media = 0;

        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 20; i++) {
            System.out.println("Digite a " + i + "º idade");
            int num = scan.nextInt();
            media += num;
        }
        media /= 20;
        System.out.println("media: " + media);
    }
}
