package controller;

import java.util.Random;

public class Ls01_Ex04
{
	/*
	 * 4. Carregar uma matriz [4 x 4 inteiro]. Apresentar:
  		- Soma dos valores no intervalo de 1 a 100
  		- Quantidade de n�meros impares entre 30 a 50
  		- Quantidade de n�meros divis�veis por 8
  		- Quantidade de n�meros �mpares divis�veis por 3
  		- Fatorial do maior n�mero informado na matriz
	 */
  public void Exercicio4()
  {
	  
	  // Variaveis
	  Random random = new Random();
	  int mat[][] = new int [4][4];
	  int min = -101;
	  int max = 101;
	  
	  // Popular e exibir matriz
	  System.out.println("Exerc�cio 4");
	  for (int i = 0; i <= 3; i++)
	  {
		  for (int j = 0; j <= 3; j++)
		  {
			  mat[i][j] = random.nextInt((max - min) + 1) + min;
			  System.out.print(mat[i][j] + " ");
		  }
		  System.out.println();
	  }
	  
	  //Sa�da de dados
	  System.out.println("-------------");
	  SomaIntervalo(mat);
	  
	  System.out.println("\n-------------");
	  ImparesEntre30e50(mat);
	  
	  System.out.println("\n-------------");
	  Divisiveispor8(mat);
	  
	  System.out.println("\n-------------");
	  ImparesPor3(mat);
	  
	  System.out.println("\n-------------");
	  FatorialMaior(mat);
  }
  
  	// Procedimento para soma no intervalo (Entre 1 e 100)
	private void SomaIntervalo(int mat[][])
	{
		  int aux = 0;
		  
		  for (int vet[] : mat)
		  {
			  for (int ind : vet)
			  {
				  if (ind >= 1 && ind <= 100)
				  {
					  aux += ind;
				  }
			  }
		  }
		  System.out.print("Soma dos valores no intervalo de 1 a 100: " + aux);
	  }
	
	// Procedimento para soma de n�meros impares no intervalo (Entre 30 e 50)
	 private void ImparesEntre30e50 (int mat[][])
	 {
		 int soma = 0;
		 
		 for (int vet[] : mat)
		  {
			  for (int ind : vet)
			  {
				  if (ind >= 30 && ind <= 50)
				  {
					  if(eImpar(ind))
					  {
						  soma ++;
					  }
				  }
			  }
		  }
		 System.out.print("Quantidade de n�meros impares entre 30 a 50: " + soma);
	 }
	 
	 // Procedimento para soma de n�meros divis�veis por 8
	 private void Divisiveispor8(int mat[][])
	 {
		 int soma = 0;
		 
		 for (int vet[] : mat)
		  {
			  for (int ind : vet)
			  {
				  if(divPor(ind, 8))
				  {
					  soma ++;
				  }
			  }
		  }
		 System.out.print("Quantidade de n�meros divis�veis por 8: " + soma);
	 }
	 
	 // Procedimento para soma de n�meros impares divis�veis por 3
	 private void ImparesPor3(int mat[][])
	 {
		 int soma = 0;
		 
		 for (int vet[] : mat)
		  {
			  for (int ind : vet)
			  {
				  if(eImpar(ind) && divPor(ind, 3))
				  {
					  soma ++;
				  }
			  }
		  }
		 System.out.print("Quantidade de n�meros �mpares divis�veis por 3: " + soma);
	 }
	 
	 // Procedimento para localizar maior n�mero presente na matriz
	 private void FatorialMaior (int mat[][])
	 {
		 int num = 0;
		 for (int vet[] : mat)
		  {
			  for (int ind : vet)
			  {
				  if (num < ind)
				  {
					  num = ind;
				  }
			  }
		  }
		 System.out.println("O fatorial de " + num + " �: " + fatorial(num));
		 
	 }
	 
	 // Fun��o de calculo fatorial
	 static double fatorial(int num)
	  {
		  double X = 1;
	      while (num > 1)
	      {
	          X = X * num;
	          num = num - 1;
	      }
	      return X;
	  }
	
	// Fun��o para testar se o dividendo � divisivel pelo divisor
	static boolean divPor(int dividendo, int divisor)
	{
		return dividendo % divisor == 0;
	}
	
	// Fun��o para testar se o inteiro � impar
	static boolean eImpar(int x)
	{
		return x % 2 == 1;
	}

 }