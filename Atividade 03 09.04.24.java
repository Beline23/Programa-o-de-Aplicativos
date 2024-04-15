import java.util.Scanner;

public class CalculoMediaAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int aluno = 1; aluno <= 2; aluno++) {
            double soma = 0;
            for (int i = 1; i <= 5; i++) {
                System.out.print("Digite a nota " + i + " do aluno " + aluno + ": ");
                double nota = scanner.nextDouble();
                soma += nota;
            }

            double media = soma / 5;
            System.out.println("Média do aluno " + aluno + ": " + media);

            if (media >= 7.0) {
                System.out.println("Aluno " + aluno + " está aprovado.");
            } else if (media >= 4.0) {
                System.out.println("Aluno " + aluno + " está reprovado com direito a recuperação.");
            } else {
                System.out.println("Aluno " + aluno + " está reprovado sem direito a recuperação.");
            }
        }

        scanner.close();
    }
}
