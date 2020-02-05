package application1;

import java.util.Locale;
import java.util.Scanner;

import util.Hotel;

/* crie um programa para um hotel onde é indicado a quantidade de quartos 
 * e pergunte se o cliente deseja ou não alugar um quarto se sim 
 * pegue os dados do cliente e o numero do quarto que deseja se instalar 
 * depois mostre os quartos que estão ocupados.
 */ 

public class Program {

	public static void main(String[] args) {
	
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			int count = 0;
			
			System.out.println("digite:a quantidade de quartos: ");
			int n = sc.nextInt();
			
			Hotel [] hotel = new Hotel[n];
			
			while(count == 0 ) {
				 System.out.println("Digite:\n"
				 		+ "1: para alugar um quarto\n"
				 		+ "0: para sair");
				 int opc = sc.nextInt();
				switch(opc) {
				
				case 1 :
				sc.nextLine();
				System.out.println("Digite o nome, o email e numero do quarto que deseja se hospedar:");
				String name = sc.nextLine();
				String email = sc.nextLine();
				int room = sc.nextInt();
				
				hotel[room] = new Hotel(name, email,room);
				break;
				
				case 0:
					count++;
			}
		}
		    
			for (int i = 0; i < hotel.length; i++) {
				
				if(hotel[i] != null) {
					System.out.println("Name: " + hotel[i].getName() + ", Email:" + hotel[i].getEmail() + " Romm: " + hotel[i].getRoom());
				}else {
				   System.out.println("-------------------------");
				   System.out.println(hotel[i]);
				}
				
			}
			sc.close();
		}

	}


