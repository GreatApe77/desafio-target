/**
 * 2) Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.
 */
public class Questao2ProcuraLetraA {

    /**
     * Conta a quantidade de letras 'A' em um dado texto.
     * 
     * @param texto Texto a ser avaliado
     * @return a quantidade de vezes que a letra 'A' (case insensitive) aparece no
     *         texto
     */
    public static int contarLetraA(String texto) {
        int quantidade = 0;
        for (int i = 0; i < texto.length(); i++) {
            Character caractereAvaliado = texto.charAt(i);
            if (caractereAvaliado == 'a' || caractereAvaliado == 'A') {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static void main(String[] args) {

        // ENTRADA DE DADOS
        String TEXTO_TESTE = "Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.";

        int quantidade = contarLetraA(TEXTO_TESTE);
        if (quantidade == 0) {
            System.out.println("O texto não possui a letra 'A'.");
        } else {
            System.out.println("A letra 'A' aparece " + quantidade + " vezes.");
        }
    }
}
