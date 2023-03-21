package ex.projetoJedi4;

public class Exercicio6 {
    public static void main(String[] args) {

        String nomes[] = {"thiago", "joao", "matheus", "julia", "lucas", "caio", "mateus", "ana", "luiza", "guilherme"};
        String resultado = "";

        for (int i = 0; i < nomes.length; i++) {
            resultado += nomes[i] + " ";
            System.out.println(resultado);
        }

    }
}
