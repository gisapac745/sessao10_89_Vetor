package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		// declara��o das vari�veis
		int numElementos;
		double soma=0;
		double media;
		
		// formata��o de ponto flutuante
		Locale.setDefault(Locale.US);
		
		// inst�ncia do objeto Scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		// corpo do programa
		System.out.println(">>>>>>> PROGRAMA TESTE DE VETOR NO GIT HUB");
		System.out.println(">>>>>>> NOVO TESTE GIT HUB");
		System.out.println();
		
		System.out.println("Entre com o n�mero de elementos que o vetor ter�:");
		numElementos = sc.nextInt();
		
		// declara��o do vetor
		double[] vet = new double[numElementos];
		
		// for para percorrer o vetor
		for (int i=0; i< numElementos; i++) {
			System.out.println("Informe o " + (i+1) + "� elemento");
			vet[i] = sc.nextDouble();
			soma += vet[i];
		}
		
		media = soma/numElementos;
		System.out.printf("A m�dia dos n�meros inseridos �: %.2f",  media);
		
		sc.close();
	}

}
