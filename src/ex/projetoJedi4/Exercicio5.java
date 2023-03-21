package ex.projetoJedi4;

public class Exercicio5 {
    public static void main(String[] args) {

        int maiorQueQuinze = 0;
        int negativos = 0;
        int multiplosDeCinco = 0;
        int soma = 0;

        int[] vetor = {2, 15, 80, 90, 45, 75, 10, 55, 99, 105};

        for (int i = 0; i < vetor.length; i++) {
            // a)
            if (vetor[i] > 15) {
                maiorQueQuinze++;
            }
            // b)
            if (vetor[i] < 0) {
                negativos++;
            }
            // c)
            if (vetor[i] % 5 == 0) {
                multiplosDeCinco++;
            }
            // d)
            soma += vetor[i] + vetor[i];
        }

        System.out.println("numeros maiores que 15: " + maiorQueQuinze);
        System.out.println("numeros negativos: " + negativos);
        System.out.println("numeros multiplos de 5: " + multiplosDeCinco);
        System.out.println("valor total somado: " + soma);
    }
}
