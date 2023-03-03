package ex.projetoJedi;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        //leitor
        Scanner scan = new Scanner(System.in);

        float salarioMin = 1288;

        System.out.println("Salario minimo: " + salarioMin);
        System.out.println("Digite seu salario: ");
        //armazenar o valor do salario do usuario
        float salario = scan.nextFloat();
        //calculo sobre quantos salarios minimos ganha
        float numSalario = salario / salarioMin;
        System.out.println("Você recebe " +  numSalario + " salarios minimos");
    }
}
