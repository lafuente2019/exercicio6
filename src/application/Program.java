package application;

import java.util.Locale;
import java.util.Scanner;
import entities.AberturaConta;

/* faça um programa para abrir uma conta dando a opção do cliente 
 * possa fazer ou não um deposito em sua conta e se desejar tambem poderar fazer um saque 
 * e mostre o resultado na tela
 */
public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account Number:");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.println("enter name:");
		String name = sc.nextLine();
		
	    AberturaConta conta = new AberturaConta(number,name);
	    
	    System.out.println();
	    System.out.println("deseja fazer uma deposito?: S/N");
	    char res = sc.next().charAt(0);
	    
	    if(res == 'S') {
	     System.out.println();	
	     System.out.println("digite o valor do deposito:");
	     double value = sc.nextDouble();
	    
	    conta.addDeposit(value);
	    System.out.println(conta.toString());
	    System.out.println();
		
	    }else {
	    	
	    	 System.out.println( conta.toString());
	    	
	    }
	    
	    System.out.println("Deseja efetuar um saque: S/N ");
	    char resp = sc.next().charAt(0);
	    
	    if(resp == 'S') {
	    	System.out.println("digite o valor do saque: ");
	    	double saque = sc.nextDouble();
	    	conta.valorSaque(saque);
	    	
	    	 System.out.println(conta.toString());
	    }else {
	    	
	    	 System.out.println( conta.toString());
	    }
		
		
		sc.close();

	}

}
