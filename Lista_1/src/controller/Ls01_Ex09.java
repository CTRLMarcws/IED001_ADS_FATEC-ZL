package controller;

public class Ls01_Ex09
{
	//9. Realize recursivamente a soma de todos os números ímpares de 1 a 300.
	public void Exercicio9()
	{
		// // Chamada da função recursiva e saída de dados
		System.out.println("Exercício 9");
		System.out.println(somaRecursivaImpares(300));
	}
	
	// Função recursiva para soma de números impares no intervalo estipulado
	private int somaRecursivaImpares(int x)
	{
		if(x == 0)
		{
			return 0;
		}
		
		if (x % 2 == 1)
		{
			return x + somaRecursivaImpares(x - 1);
		}
		
		return somaRecursivaImpares(x - 1);
	}
}