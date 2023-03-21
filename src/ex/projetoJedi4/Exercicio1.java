package ex.projetoJedi4;

public class Exercicio1 {
    public static void main(String[] args) {

        int[] vetor = {2, 4, 6, 8, 10};

        for (int i = 0; i < vetor.length; i++) {
            int[] vetor2 = new int[5];
            vetor2[i] = vetor[i];

            System.out.println(vetor2[i]);
        }
    }
}
