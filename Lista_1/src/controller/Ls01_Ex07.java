package controller;

public class Ls01_Ex07
{
	//7. Realize recursivamentea soma de todos os números de 1 a 100.

	public void Exercicio7()
	{	
		// Chamada da função recursiva e saída de dados
		System.out.println("Exercício 7");
		System.out.println(somaRecursiva(100));
	}

	// Função recursiva para soma no intervalo estipulado
	private int somaRecursiva(int x)
	{
		if (x == 1)
		{
			return 1;
		}
		
		return x + somaRecursiva(x - 1);
	}
	
}