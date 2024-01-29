package curso1;

import java.util.Scanner;

public class MaiorMenor {

		public static void main(String[]Args ) {
			Scanner scan= new Scanner(System.in);
			
			System.out.println("Digite o primeiro número: ");
			double numero1=  scan.nextDouble();
			
			System.out.println("Digite o segundo número: ");
			double numero2=  scan.nextDouble();
			
		if ( numero1 > numero2 ) {
			System.out.println("O primeiro número digitado é maior ");
		}
		else if (numero2 > numero1) {
			System.out.println("O segundo número digitado é maior ");
		}	
		else
			System.out.println("Os números são iguais ");
			
			
		
	} 
}
