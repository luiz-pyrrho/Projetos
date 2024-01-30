package curso1;

import java.util.Scanner;

public class VogalConsoante {
	public static void main(String[] Args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite uma vogal/consoante: ");
		
		String letra = scan.next();
		
		if (letra.length() >=2) {
			System.out.println("Digíto inválido, tente novamente");
			System.out.println("Você digitou "+letra.length()+" letras");
		}
		else {
			
			switch(letra) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
				System.out.println("Você digitou uma vogal");
				break;
			default:
				System.out.println("Você digitou uma consoante");
			
			}
		}
		
	
			
	}

}
