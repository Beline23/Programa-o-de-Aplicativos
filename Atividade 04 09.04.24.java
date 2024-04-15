
import java.util.Scanner;

public class CalculoEstoque {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] vendasDiarias = new int[3];
        int[] estoqueMinimo = new int[3];
        int[] estoqueMaximo = new int[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Produto " + (i+1) + ":");
            System.out.print("Digite a venda média diária: ");
            vendasDiarias[i] = input.nextInt();
            System.out.print("Digite o estoque mínimo: ");
            estoqueMinimo[i] = input.nextInt();
            System.out.print("Digite o estoque máximo: ");
            estoqueMaximo[i] = input.nextInt();
        }

        // Cálculo da média das vendas diárias
        int totalVendas = 0;
        for (int venda : vendasDiarias) {
            totalVendas += venda;
        }
        
        double mediaVendasDiarias = totalVendas / 3.0;
        
        System.out.println("A média de vendas diárias para os 3 produtos é: " + mediaVendasDiarias);
        
        // Encontrando o estoque mínimo e máximo geral
        int estoqueMinimoGeral = estoqueMinimo[0];
        int estoqueMaximoGeral = estoqueMaximo[0];
        
        for (int i = 1; i < 3; i++) {
            if (estoqueMinimo[i] < estoqueMinimoGeral) {
                estoqueMinimoGeral = estoqueMinimo[i];
            }

            if (estoqueMaximo[i] > estoqueMaximoGeral) {
                estoqueMaximoGeral = estoqueMaximo[i];
            }
        }

        System.out.println("O estoque mínimo geral é: " + estoqueMinimoGeral);
        System.out.println("O estoque máximo geral é: " + estoqueMaximoGeral);
    }
} 
