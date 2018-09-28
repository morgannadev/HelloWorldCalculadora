package br.com.helloworld;
import java.util.Scanner;

import br.com.calculadora.Calculadora;

public class HelloWorld {

	public static void main(String[] args) throws Exception {
		
		Calculadora calculadora = new Calculadora();
		Integer escolha;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Escolha a operação:\n"
					+ "1 - SOMAR\n"
					+ "2 - SUBTRAIR\n"
					+ "3 - DIVIDIR\n"
					+ "4 - MULTIPLICAR\n"
					+ "5 - SAIR\n");
			
			escolha = sc.nextInt();
			
			switch (escolha) {
			case 1:				
				System.out.println("Digite o primeiro valor: ");		
				Double valorASomar = sc.nextDouble();
				
				System.out.println("Digite o segundo valor: ");		
				Double valorBSomar = sc.nextDouble();
				
				calculadora.somar(valorASomar, valorBSomar);			
				
				System.out.println(calculadora.getResultado());
				break;

			case 2:			
				System.out.println("Digite o primeiro valor: ");		
				Double valorASubtrair = sc.nextDouble();
				
				System.out.println("Digite o segundo valor: ");		
				Double valorBSubtrair = sc.nextDouble();
				
				calculadora.subtrair(valorASubtrair, valorBSubtrair);
				
				System.out.println(calculadora.getResultado());
				break;
			
			case 3:
				System.out.println("Digite o primeiro valor: ");		
				Double valorADividir = sc.nextDouble();
				
				System.out.println("Digite o segundo valor: ");		
				Double valorBDividir = sc.nextDouble();
				
				calculadora.dividir(valorADividir, valorBDividir);
				
				System.out.println(calculadora.getResultado());
				break;
				
			case 4:
				System.out.println("Digite o primeiro valor: ");		
				Double valorAMultiplicar = sc.nextDouble();
				
				System.out.println("Digite o segundo valor: ");		
				Double valorBMultiplicar = sc.nextDouble();
				
				calculadora.multiplicar(valorAMultiplicar, valorBMultiplicar);
				
				System.out.println(calculadora.getResultado());
				break;
				
			case 5:						
				break;
				
			default:
				System.out.println("Opção inválida.");
				break;
			}		
			
			if(escolha != 5) {
				escolha = null;
			}
			
		} while(escolha == null);		
	}
}
