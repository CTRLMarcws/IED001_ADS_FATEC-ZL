package controller;

import java.util.Scanner;

public class Ls01_Ex10
{
	//10. Receba um número inteiro. Calcule e mostre a série de Fibonacci recursivamente até o número recebido
	
	public void Exercicio10()
	{
		// Variaveis
		long x;
		Scanner scanner = new Scanner(System.in);
		
		// Entrada de dados
		System.out.println("Exercício 10");
		System.out.print("Insira o número da posição de F desejada para ordem Fibonacci: ");
		x = scanner.nextInt();
		
		// Chamada da função recursiva Fibonacci e saída de dados
		System.out.println("Valor Fibonacci da ordem estipulada: " + fibonacci(x));
	}

	// Chamada da função recursiva para cálculo Fibonacci
	private long fibonacci(long x)
	{
		// F(n) = F(n-1) + F(n-2)
		if (x < 2)
		{
			return x;
		}
		
			return fibonacci(x - 1) + fibonacci(x - 2);
	}
}