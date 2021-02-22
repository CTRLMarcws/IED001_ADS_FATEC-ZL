package controller;

import java.util.Random;

public class Ls01_Ex03
{
	/*
	 * 3. Carregar um vetor [100] inteiros positivos ou negativos.
	 * Classificar este vetor em ordem crescente e apresentar os valores.
	 */

  public void Exercicio3()
  {
	  // Variaveis
	  Random random = new Random();
	  int vet[] = new int [100];
	  int min = -1000;
	  int max = 1000;
	  
	  // Popular vetor
	  for (int i = 0; i < vet.length; i++) {
		  vet[i] = random.nextInt((max - min) + 1) + min;
	  }
	  
	  // Chamada do procedimento de ordenação
	  Ordenar(vet);
	  
	  // Saída de dados
	  System.out.println("Exercício 3");
	  for (int i = 0; i < vet.length; i++) {
		  System.out.println((i+1) + "º " + vet[i]);
	  }
  }
  // Função de ordenação do vetor
  private void Ordenar(int vet[])
  {
	  for (int i = 0; i < vet.length; i++)
	  {
		  for (int j = 0; j < vet.length - 1; j++)
		  {
			  if (vet[j] > vet[i])
			  {
				  int aux = vet[j];
				  vet[j] = vet[i];
				  vet[i] = aux;
			  }
		  }
	  }
  }
}