package curso1;

import java.util.Scanner;

public class Soma {
	
	public static void main(String[] Args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numero1 = scan.nextInt();
		
		System.out.println("Digite um número: ");
		int numero2 = scan.nextInt();
			
		System.out.println("A soma dos dois números é:"+ (numero1+numero2));
	}
}
