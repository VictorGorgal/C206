package Exercicio01;

public class Main {
    public static void main(String[] args) {
        int fatorial = fatorialRecursivo(4);
        System.out.println(fatorial);

        imprimirPares(10);
    }

    /***
     * Retorna o número fatorial de n utilizando recursividade
     */
    private static int fatorialRecursivo(int n) {
        // Caso base
        if (n == 2) {
            return n;
        }

        // n * (n-1)
        return n * fatorialRecursivo(n-1);
    }

    /***
     * Imprimi os ns pares entre [0, n] (inclusos)
     */
    private static void imprimirPares(int n) {
        for (int i = 0; i <= n; i++) {
            // Verifica número par
            if (i % 2 != 0) {
                continue;
            }

            // Se for último número, imprime sem vírgula
            if (i >= n-1) {
                System.out.println(i);
                continue;
            }

            System.out.print(i + ", ");
        }
    }
}
