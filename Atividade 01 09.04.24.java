import java.util.Scanner;

public class SomaEMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalNumeros = 8;
        int soma = 0;

        // Utilizando o for
        for (int i = 0; i < totalNumeros; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            soma += numero;
        }

        double mediaFor = (double) soma / totalNumeros;
        System.out.println("Soma dos números (usando for): " + soma);
        System.out.println("Média dos números (usando for): " + mediaFor);

        // Resetar a soma para calcular novamente
        soma = 0;
        int count = 0;
        // Utilizando o while
        while (count < totalNumeros) {
            System.out.print("Digite o número " + (count + 1) + ": ");
            int numero = scanner.nextInt();
            soma += numero;
            count++;
        }

        double mediaWhile = (double) soma / totalNumeros;
        System.out.println("Soma dos números (usando while): " + soma);
        System.out.println("Média dos números (usando while): " + mediaWhile);

        scanner.close();
    }
}
