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
    System.out.println("Cadastre o Produto");
    String produto = teclado.next();
    System.out.println("Informe a Quantidade");
    int quantidade = teclado.nextInt();
    System.out.println("Informe o Preço");
    float preco = teclado.nextFloat();
    teclado.close();
}
}