package curso1;

import java.util.Scanner;

public class LeituraDadosTeclado {
	
	public static void main(String[] Args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Digite o seu nome completo: ");
	String nomeCompleto = scan.nextLine();
	System.out.println("Seu nome completo é: " + nomeCompleto);
	
	
	System.out.println("Digite a sua idade: ");
	int idade = scan.nextInt();
	System.out.println("A sua idade é:" + idade);
	
	System.out.println("Digite o seu primeiro nome, idade, qnt de filhos , altura e se tem bixo de estimação:");
	String umNome = scan.next();
	int novaIdade = scan.nextInt();
	byte filhos = scan.nextByte();
	float altura = scan.nextFloat();
	boolean pets = scan.nextBoolean();
	
	System.out.println("Você digitou...");
	System.out.println("Primeiro nome: " + umNome);
	System.out.println("Idade:" + novaIdade);
	System.out.println("Quantidade de filhos: " + filhos);
	System.out.println("Altura: " + altura);
	System.out.println("Se tem animal: " + pets);
	
	}
}
