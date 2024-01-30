package curso1;

import java.util.Scanner;

public class ReajusteSalarial {
	public static void main(String[] Args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual é o salário");
		double salario = scan.nextDouble();
		
		if (salario <= 280) {
			double percentual = salario*0.2;
			double reajuste = salario + percentual ;
			System.out.println("Antes do reajuste era R$ " + salario +" você teve um aumento de 20%, o que resultou em um aumento de R$ " + percentual + " o que totaliza em seu novo salário de R$ " + reajuste);
		
		}
		
		if (salario >280 && salario <=700) {
			double percentual = salario*0.15;
			double reajuste = salario + percentual ;
			System.out.println("Antes do reajuste era R$ " + salario +" você teve um aumento de 15%, o que resultou em um aumento de R$ " + percentual + " o que totaliza em seu novo salário de R$ " + reajuste);
		}	
		
	}
  }
