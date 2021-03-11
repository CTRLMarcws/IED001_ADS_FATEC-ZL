package controller;

import entity.Atributos;
/*
 * -verificar se a fila está vazia, retornando true se estiver vazia e false se não estiver;
 * -adicionar uma pessoa, caso a operação não possa ser realizada, mostre mensagem avisando;
 * -remover uma pessoa, caso a operação não possa ser realizada, mostre mensagem avisando;
 * -adicionar todas as pessoas removidas em uma pilha de pessoas
 * -pesquisar a ordem de espera de uma pessoa na fila
 * -percorrer e apresentar cada um dos elementos da fila
 * -comente no código os trechos de criação dos endereços de memória
 * -comente no código todas as associações entre classes
 */

public class Fila
{
	private Atributos [] fila;
	private Atributos [] pilha; //removidos
	private int tamFila;
	private int tamPilha;
	
	public Fila()
	{
		fila = new Atributos[5];
		pilha = new Atributos[5];
		tamFila = 0;
		tamPilha = 0;
	}

	public boolean filaVazia()
	{
		if (tamFila != 0)
		{
			return false;			
		}
		return true;
	}
	
	public boolean filaCheia()
	{
		if (tamFila == fila.length)
		{
			return true;
		}
		return false;
	}
	
	public void AdicionarPessoa(int ID, int RG, int tel, String nome, String nasc)
	{
		if (!filaCheia())
		{
			Atributos pessoa = new Atributos(ID, RG, tel, nome, nasc); // alterar nome da variavel
			fila[tamFila] = pessoa;
			tamFila ++;			
		}
		else
		{
			System.out.println("Fila Cheia");
		}
	}
	
	public Atributos RemoverPessoa(Atributos pessoa)
	{
		String nome = "";
		if (!filaVazia())
		{
			nome = fila[0].getNome();
			pessoa = fila[0];
			
			for (int i = 1; i < tamFila; i++)
			{
				fila[i - 1] = fila[i];
			}
			tamFila --;
			
			System.out.println(nome + " removido da fila, adicionado a pilha");
			
			AdicionarPilha(pessoa);
		}
		else
		{
			System.out.println("erro");
		}
		return pessoa;
	}
	
	public void AdicionarPilha(Atributos pessoa)
	{
		if (tamPilha == pilha.length)
		{
			System.out.println("pilha cheia");
		}
		else
		{
			pilha[tamPilha] = pessoa;
			tamPilha ++;
		}
	}
	
	public void Pesquisar(int ID)
	{
		int aux = 0;
		if(!filaVazia())
		{
			for (int i = 0; i < tamFila; i++)
			{
				if (ID == fila[i].getId())
				{
					System.out.println("ID #"+ fila[i].getId()
							+ "localizado.\n Posição na fila: " + (i+1));
					i = tamFila;
					aux = 1;
				}
			}
		}
		if(aux == 0)
		{
			System.out.println("ID #" + ID + " não encontrado.");
		}
		else
		{
			System.out.println("lista vazia");
		}
	}
	
	public void PercorrerFila() // usar buffer?
	{
		if (!filaVazia())
		{
			System.out.println("exibindo fila");
			for (int i = 0; i < tamFila; i++)
			{
				System.out.println("ID:                 "+fila[i].getId()+
						"\nNome:               "+fila[i].getNome()+
						"\nRG:                 "+fila[i].getRg()+
						"\nTelefone:           "+fila[i].getTel()+
						"\nData de Nascimento: "+fila[i].getNasc());
			}
		}
		else
		{
			System.out.println("fila vazia");
		}
	}
	
	public void PercorrerPilha()
	{
		if (tamPilha != 0)
		{
			System.out.println("exibindo pilha");
			for (int i = 0; i < tamPilha; i++)
			{
				System.out.println("ID:                 "+ pilha[i].getId()+
						"\nNome:               "+ pilha[i].getNome()+
						"\nRG:                 "+ pilha[i].getRg()+
						"\nTelefone:           "+ pilha[i].getTel()+
						"\nData de Nascimento: "+ pilha[i].getNasc());
			}
		}
		else
		{
			System.out.println("pilha vazia");
		}
	}
}