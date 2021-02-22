package controller;

import java.util.Scanner;

public class Ls01_Ex10
{
	//10. Receba um n�mero inteiro. Calcule e mostre a s�rie de Fibonacci recursivamente at� o n�mero recebido
	
	public void Exercicio10()
	{
		// Variaveis
		long x;
		Scanner scanner = new Scanner(System.in);
		
		// Entrada de dados
		System.out.println("Exerc�cio 10");
		System.out.print("Insira o n�mero da posi��o de F desejada para ordem Fibonacci: ");
		x = scanner.nextInt();
		
		// Chamada da fun��o recursiva Fibonacci e sa�da de dados
		System.out.println("Valor Fibonacci da ordem estipulada: " + fibonacci(x));
	}

	// Chamada da fun��o recursiva para c�lculo Fibonacci
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