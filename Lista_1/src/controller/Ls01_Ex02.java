package controller;

import java.util.Random;

public class Ls01_Ex02
{
	/*
	 * 2. Carregar um vetor [5] inteiro.
	 * Enviar cada elemento para uma fun��o e esta ir� retornar o seu fatorial que ser� armazenado em um outro vetor.
	 * Exibir os dados dos vetores
	 */
	
  public void Exercicio2()
  {
	  // Variaveis
	  Random random = new Random();
	  int vetInt[] = new int[5];
	  int vetFat[] = new int [5];
	  
	  // Popular vetor e chamada da fun��o fatorial
	  for (int i = 0; i < vetInt.length; i++)
	  {
		  vetInt[i] = random.nextInt(10);
		  vetFat[i] = Fatorial(vetInt[i]);
	  }
	  
	  // Sa�da de dados
	  System.out.println("Exerc�cio 2");
	  System.out.print("Vetor Inteiro:  ");
	  Resultado(vetInt);
	  System.out.println();
	  System.out.print("Vetor Fatorial: ");
	  Resultado(vetFat);
  }
  
  // Fun��o para c�lculo fatorial
  static int Fatorial(int N)
  {
	  int X = 1;
      while (N > 1) {
          X = X * N;
          N = N - 1;
      }
      return X;
  }
  
  // Fun��o para exibi��o de resultado
  private void Resultado(int vet[]) {
	  for(int i = 0; i < vet.length; i++) {
		  System.out.print(vet[i] + ", ");
	  }
  }
}