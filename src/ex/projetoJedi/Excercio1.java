package ex.projetoJedi;

import java.util.Scanner;

public class Excercio1 {
    public static void main(String[] args) {

        // leitor
        Scanner scan = new Scanner(System.in);

        // variaveis que será utilizada com o leitor
        int anos, mes, dias;

        // variaveis incializada para calculos
        int diasNoAno = 365;
        int diasMes = 30;

        System.out.println("CALCULAR IDADE EM DIAS!: ");
        System.out.println("Anos: ");
        anos = scan.nextInt();
        System.out.println("Mês: ");
        mes = scan.nextInt();
        System.out.println("Dias: ");
        dias = scan.nextInt();

        dias += (anos * diasNoAno) + (mes * diasMes);

        System.out.println("Sua idade em dias é: " + dias);

    }
}