package curso1;

import java.util.Scanner;

public class Conversão {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("De m para cm: ");
		float metro = scan.nextFloat();
		
		float centimetro;
		
		centimetro = metro * 100;
		
		System.out.println("São "  + centimetro +" cm");
	}

}
