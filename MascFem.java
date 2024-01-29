package curso1;

import java.util.Scanner;

public class MascFem {
	
	public static void main(String[] Args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o seu sexo: F/M");
		
		String input = scan.next();
		if (input.equalsIgnoreCase("f")) {
			
			System.out.println("Feminino");
		}	
		else if (input.equalsIgnoreCase("m")) {
			System.out.println("Masculino");
		}
		else {
			System.out.println("Sexo inválido");
			
	    }
	}
}
