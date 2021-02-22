package controller;

public class Ls01_Ex09
{
	//9. Realize recursivamente a soma de todos os n�meros �mpares de 1 a 300.
	public void Exercicio9()
	{
		// // Chamada da fun��o recursiva e sa�da de dados
		System.out.println("Exerc�cio 9");
		System.out.println(somaRecursivaImpares(300));
	}
	
	// Fun��o recursiva para soma de n�meros impares no intervalo estipulado
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