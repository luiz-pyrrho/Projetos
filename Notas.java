package curso1;

import java.util.Scanner;

public class Notas {
	public static void main(String[] Args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Nota da Prova 1: ");
		float nota1 = scan.nextFloat();
		
		System.out.println("Nota da Prova 2: ");
		float nota2 = scan.nextFloat();
		
		System.out.println("Nota da Prova 3: ");
		float nota3 = scan.nextFloat();
		
		System.out.println("Nota da Prova 4: ");
		float nota4 = scan.nextFloat();
		
		float media;
		
		media = (nota1+nota2+nota3+nota4) / 4;
		System.out.println("A média do Mouro é:"+ media);
	}
}
