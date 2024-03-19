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
		System.out.println("Bem Vindo ao seu Banco!!");
		System.out.println("1) Verificar Saldo.");
		System.out.println("2) Dados do Usário.");
		System.out.println("3) Transferir para atendente");
		float n = teclado.nextFloat();
		
		String saldo = "R$ 5.000";
		String nome = "Lucas Almeida";
		String atendente = "Transferindo para atendente...";
		
		
		if (n==1)
{
     System.out.println ("Saldo: "+saldo);
}
	else if (n>1 || n < 3)
{
     System.out.println ("Nome do Usário: "+nome);
}
		else {
     System.out.println ("Transferir para o atendente: "+atendente);
}

		    
	}
}
