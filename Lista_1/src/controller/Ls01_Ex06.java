package controller;

import java.util.Scanner;

public class Ls01_Ex06
{
	//6. Receba um n�mero inteiro. Calcule e mostre o seu fatorial recursivamente.
	public void Exercicio6()
	{
		// Variaveis
		int x = 0;
		Scanner scanner = new Scanner(System.in);
		
		// Entrada de dados
		System.out.println("Exerc�cio 6");
		System.out.print("Insira o n�mero a ser calculado em fatorial: ");
		x = scanner.nextInt();
		
		// Sa�da de dados e chamada a fun��o recursiva
		System.out.println("Fatorial de " + x + " �: " + fatorialRecursivo(x));
	}

	// Fun��o fatorial recursiva
	private int fatorialRecursivo(int x)
	{
		if (x == 0)
		{
			return 1;
		}
		
		return x * fatorialRecursivo(x - 1);
	}
}