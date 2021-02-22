package controller;

public class Ls01_Ex08
{
	//8. Realize recursivamente a soma de todos os números pares de 1 a 200
	
	public void Exercicio8()
	{
		// Chamada da função recursiva e saída de dados
		System.out.println("Exercício 8");
		System.out.println(somaRecursivaPares(200));
	}
	
	// Função recursiva para soma de números impares no intervalo estipulado
	private int somaRecursivaPares(int x)
	{
		if(x == 0)
		{
			return 0;
		}
		
		if (x % 2 == 0)
		{
			return x + somaRecursivaPares(x - 1);
		}
		
		return somaRecursivaPares(x - 1);
	}
}