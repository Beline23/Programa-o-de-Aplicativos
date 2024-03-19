/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		  Scanner teclado = new Scanner(System.in);
    System.out.println("Informe o Numero desejado:");
    float n1 = teclado.nextFloat();
    System.out.println("Informe o Numero desejado:");
    float n2 = teclado.nextFloat();
	
	    float soma = n1 + n2;
	    float subtracao = n1 - n2;
	    float multiplicacao = n1 * n2;
	    float divisao = n1/n2;
	    
	    System.out.println ("Soma: "+soma);
	    System.out.println ("Subtração: "+subtracao);
	    System.out.println ("Multiplicação: "+multiplicacao);
	    System.out.println ("Divisão: "+divisao);
	    
	    
	    teclado.close();
	    
	}
}
