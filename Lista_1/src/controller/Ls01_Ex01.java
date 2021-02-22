package controller;

import java.util.Random;

/*
 *1. Carregar um vetor [100] real de valores de saldos. Calcular e exibir:
 *- Média dos saldos positivos entre 100 à 1000
 *- Média geral dos saldos
 *- Soma dos saldos negativos
 */

public class Ls01_Ex01
{
	
  public void Exercicio1()
  {
	// Variaveis
    Random random = new Random();
    double vet[] = new double[100];
    double medPos = 0;
    double medNeg = 0;
    double medGer = 0;
    int aux1 = 0;
    int aux2 = 0;
    int min = -1000;
    int max = 1000;

    // Populando vetor e variaveis auxiliares
    for(int i = 0; i < 100; i++){
      vet[i] = random.nextDouble() * random.nextInt((max - min) + 1) + min;
      medGer += vet[i];
      
      if(vet[i] >= 100){
    	  medPos += vet[i];
    	  aux1 ++;
      }
      else if(vet[i] <= 0) {
    	  medNeg += vet[i];
    	  aux2 ++;
      }
    }
    
    // Calculo de médias
    medPos = medPos / aux1;
    medNeg = medNeg / aux2;
    medGer = medGer / vet.length;

    // Saída de dados
    System.out.println("Exercício 1");
    System.out.printf("Media positiva: %.2f\nMedia negativa: %.2f\nMedia Geral: %.2f", medPos, medNeg, medGer);
  }
}