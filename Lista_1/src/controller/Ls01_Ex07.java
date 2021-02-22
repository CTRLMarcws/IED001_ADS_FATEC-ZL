package controller;

public class Ls01_Ex07
{
	//7. Realize recursivamentea soma de todos os n�meros de 1 a 100.

	public void Exercicio7()
	{	
		// Chamada da fun��o recursiva e sa�da de dados
		System.out.println("Exerc�cio 7");
		System.out.println(somaRecursiva(100));
	}

	// Fun��o recursiva para soma no intervalo estipulado
	private int somaRecursiva(int x)
	{
		if (x == 1)
		{
			return 1;
		}
		
		return x + somaRecursiva(x - 1);
	}
	
}