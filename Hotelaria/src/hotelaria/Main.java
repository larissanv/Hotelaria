package hotelaria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		boolean loop = true;
		String saida = "";
		Scanner sc = new Scanner(System.in);
		
		while(loop) {
			
			System.out.println("Deseja sair? (S/N)");
			sc.next();
			if (saida.equalsIgnoreCase("S"))
				loop = false;
			
		}
		
	}
	
}
