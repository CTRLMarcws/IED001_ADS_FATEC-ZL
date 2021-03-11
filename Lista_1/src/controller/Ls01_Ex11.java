package controller;

import java.util.Scanner;

public class Ls01_Ex11
{
	//11. Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N recursivamente.
	
	public void Exercicio11() 
	{
		// Variaveis
		int x;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		// Entrada de dados
		System.out.println("Exercício 11");
		System.out.print("1 + 1/2 + 1/3 + ... + 1/N\nInsira o valor de N: ");
		x = scanner.nextInt();
		
		// Chamada de função fração recursiva e saída de dados
		System.out.println("Valor final: " + fracaoRecursiva(x));
	}
	
	// Função para cálculo da séria fracionada
	private double fracaoRecursiva(int x) {
		//  1 + 1/2 + 1/3 + ... + 1/N
		if (x == 1)
		{
			return 1.0;
		}
		
		return 1.0 / x + fracaoRecursiva (x - 1);
	}
}