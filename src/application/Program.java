package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		// declaração das variáveis
		int numElementos;
		double soma=0;
		double media;
		
		// formatação de ponto flutuante
		Locale.setDefault(Locale.US);
		
		// instância do objeto Scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		// corpo do programa
		System.out.println(">>>>>>> PROGRAMA TESTE DE VETOR NO GIT HUB");
		System.out.println(">>>>>>> NOVO TESTE GIT HUB");
		System.out.println();
		
		System.out.println("Entre com o número de elementos que o vetor terá:");
		numElementos = sc.nextInt();
		
		// declaração do vetor
		double[] vet = new double[numElementos];
		
		// for para percorrer o vetor
		for (int i=0; i< numElementos; i++) {
			System.out.println("Informe o " + (i+1) + "º elemento");
			vet[i] = sc.nextDouble();
			soma += vet[i];
		}
		
		media = soma/numElementos;
		System.out.printf("A média dos números inseridos é: %.2f",  media);
		
		sc.close();
	}

}
