package ex.projetoJedi4;

public class Exercicio2 {
    public static void main(String[] args) {

        int[] vetor = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        for (int i = 0; i < vetor.length; i++) {
            int[] calc = new int[10];
            String[] frase = new String[10];

             calc[i] = vetor[i] * 5;
             frase[i] = "o numero multiplicado por 5 é: " + calc[i];

             System.out.println(frase[i]);
        }
    }
}
