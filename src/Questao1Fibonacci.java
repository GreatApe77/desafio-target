import java.util.Scanner;
/**
 * 1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
 */
public class Questao1Fibonacci {
    /**
     * Verifica se um dado número pertence a sequência de fibonacci.
     * 
     * @param numero número a ser verificado
     * @return true se o número pertence a sequência de fibonacci.
     */
    public static boolean numeroPertenceFibonacci(int numero) {
        int a = 0;
        int b = 1;
        if (numero == a || numero == b) {
            return true;
        }

        int c = a + b;

        while (c <= numero) {
            if (c == numero) {
                return true;
            }

            a = b;
            b = c;
            c = a + b;

        }
        return false;

    }

    public static void alertaSePertenceFibonacci(int numero) {
        boolean pertence = numeroPertenceFibonacci(numero);
        if (pertence) {
            System.out.println("O número " + numero + " pertence a sequência.");
            return;
        }

        System.out.println("O número " + numero + " não pertence a sequência.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite um número: ");
            int numeroEntrada = scanner.nextInt();
            alertaSePertenceFibonacci(numeroEntrada);

        }
    }

}
