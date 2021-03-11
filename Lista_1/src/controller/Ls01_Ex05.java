package controller;

import java.util.Scanner;

public class Ls01_Ex05
{
	/*
	 * 5. Criar e carregar  uma matriz [4 x 4] inteiro,
	 * onde os valores da diagonal principal serão carregados pela aplicação conforme o gráfico
	 * e os demais dados serão digitados pelo usuário
	 */
	public void Exercicio5()
	{
		// Variaveis
		int mat[][] = new int [4][4];
		int vet[] = {1, 3, 9, 27};
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		// Popular matriz
		System.out.println("Exercício 5");
		System.out.println("Insira o número desejado após a posição na matriz ser exibida: ");
		
		for (int i = 0; i < vet.length; i++) {
			for (int j = 0; j < vet.length; j++) {
				if (i == j) {
					mat[i][j] = vet[i];
				}
				else {
					System.out.print("X: " + i + " , Y: " + j + " = ");
					mat[i][j] = scanner.nextInt();
				}
			}
		}
		
		// Saída de dados
		System.out.println("------------");
		
		for (int i = 0; i <= 3; i++)
		  {
			  for (int j = 0; j <= 3; j++)
			  {
				  System.out.print(mat[i][j] + " ");
			  }
			  System.out.println();
		  }
	}
}