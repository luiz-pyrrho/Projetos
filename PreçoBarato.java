package curso1;

import java.util.Scanner;

public class PreçoBarato {

	public static void main(String[] Args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro preço: R$");
		double preco1 = scan.nextDouble();
		
		System.out.println("Digite o segundo preço: R$");
		double preco2 = scan.nextDouble();
		
		System.out.println("Digite o terceiro preço: R$");
		double preco3 = scan.nextDouble();
		
		if (preco1 < preco2 && preco1 < preco3) {
			System.out.println("Compre o primeiro produto pois é o mais barato custando R$ "+preco1);
		}
		else if (preco2 < preco1 && preco2 <preco3) {
			System.out.println("Compre o segundo produto pois é o mais barato custando R$ "+preco2);
		}	
		else if (preco3 < preco1 && preco3 < preco2) {
			System.out.println("Compre o terceiro produto pois é o mais barato custando R$ "+preco3);
	       
		}
  }
	}

