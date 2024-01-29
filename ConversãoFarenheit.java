package curso1;

import java.util.Scanner;

public class ConversãoFarenheit {
	public static void main(String[]Args ) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Farenheit: ");
		
		double farenheit = scan.nextDouble();
		
		double celsius = (farenheit -32) * 5/9;
		
		System.out.println("Em Celcius: " + celsius);
		
	}
}
