/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main{
public static void main(String[]args){
    Scanner teclado = new Scanner(System.in);
    System.out.println("Informe o Prmeiro Mês: ");
    float mes1 = teclado.nextFloat();
    System.out.println("Informe o Segundo Mês: ");
    float mes2 = teclado.nextFloat();
    System.out.println("Informe o Terceiro Mês: ");
    float mes3 = teclado.nextFloat();
    System.out.println("Informe o Tempo de Reposição");
    float tr = teclado.nextFloat();
    System.out.println("Informe o Lote de Reposição");
    float lr = teclado.nextFloat();
    System.out.println("Informe o Estoque de Atual");
    float ea = teclado.nextFloat();
    
    
    float vmd = ((mes1 + mes2 + mes3)/3)/25;
    float emin = tr * vmd;
    float emax = lr + emin;
    
    System.out.println("Venda Media Diaria: "+vmd);
    System.out.println("Estoque Minimo: "+emin);
    System.out.println("Estoque Maximo: "+emax);
    
    if (ea < emin)
{
     System.out.println("Atenção!!!");
     System.out.println("Repor o estoque imediatamente!.");
}
else
{
     System.out.println("Não comprar mais produtos");
}
    
    

    
    
    
    teclado.close();
}
}