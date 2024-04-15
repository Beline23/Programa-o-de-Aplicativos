public class NumerosImpares {
    public static void main(String[] args) {
        System.out.println("Números ímpares entre 1 e 70 (usando for):");
        for (int i = 1; i <= 70; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nNúmeros ímpares entre 1 e 70 (usando while):");
        int num = 1;
        while (num <= 70) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
            num++;
        }
    }
}
