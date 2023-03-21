package ex.projetoJedi4;

public class Exercicio3 {
    public static void main(String[] args) {

        int[] vetor = {6, 12, 18, 24, 30, 36, 42, 48, 54, 60};
        int[] vetor2 = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};

        for (int i = 0; i < vetor.length; i++) {
            int[] vetorSub = new int[10];

            vetorSub[i] = vetor[i] - vetor2[i];

            System.out.println(vetorSub[i]);
        }
    }
}
