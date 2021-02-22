package controller;

import java.util.Scanner;

public class Ls01_Ex06
{
	//6. Receba um número inteiro. Calcule e mostre o seu fatorial recursivamente.
	public void Exercicio6()
	{
		// Variaveis
		int x = 0;
		Scanner scanner = new Scanner(System.in);
		
		// Entrada de dados
		System.out.println("Exercício 6");
		System.out.print("Insira o número a ser calculado em fatorial: ");
		x = scanner.nextInt();
		
		// Saída de dados e chamada a função recursiva
		System.out.println("Fatorial de " + x + " é: " + fatorialRecursivo(x));
	}

	// Função fatorial recursiva
	private int fatorialRecursivo(int x)
	{
		if (x == 0)
		{
			return 1;
		}
		
		return x * fatorialRecursivo(x - 1);
	}
}