package ex.projetoJedi4;

public class Excercio4 {
    public static void main(String[] args) {

        int cont = 0;
        int[] vetor = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                cont++;
            }
        }

        System.out.println("Quantidade de numeros pares são: " + cont);
    }
}
