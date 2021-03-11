package controller;

import entity.Atributos;
import java.util.Random;

public class Cont_Produtos
{
	private Atributos [] pilha;
	private Atributos [] pilhaRemovidos;
	private int tamPilha;
	private int tamPilhaRemovidos;
	Random random = new Random();


	public Cont_Produtos()
	{
		pilha = new Atributos[5];
		pilhaRemovidos = new Atributos[5];
		tamPilha = 0;
		tamPilhaRemovidos = 0;
	}

	public boolean pilhaVazia()
	{
		if (tamPilha == 0)
		{
			return true;
		}
		return false;
	}

	public boolean pilhaCheia()
	{
		if (tamPilha == pilha.length)
		{
			return true;
		}
		return false;
	}

	public int gerarID()
	{
		return (int) (Math.random()*100);
	}

	public void AdicionarProduto(int qnt, String nome, double valor)
	{
		if (!pilhaCheia())
		{
			int ID = gerarID();
			Atributos produto = new Atributos(ID, qnt, nome, valor);
			pilha[tamPilha] = produto;
			tamPilha ++;			
		}
		else
		{
			System.out.println("Pilha Cheia");
		}
	}


	public void RemoverProduto(Atributos produto)
	{
		if (!pilhaVazia())
		{
			System.out.println(pilha[tamPilha - 1].getNome() + " removido da pilha, adicionado a pilha de removidos");
			produto = pilha[tamPilha - 1];
			AdicionarAosRemovidos(produto);
			tamPilha --;
		}
		else
		{
			System.out.println("Pilha vazia");
		}
	}

	public void AdicionarAosRemovidos(Atributos produto)
	{
		if (tamPilhaRemovidos == pilhaRemovidos.length)
		{
			System.out.println("Pilha de removidos está cheia");
		}
		else
		{
			pilhaRemovidos[tamPilhaRemovidos] = produto;
			tamPilhaRemovidos ++;
		}
	}

	public void Pesquisar(int ID)
	{
		int aux = 0;
		if (!pilhaVazia())
		{
			for (int i = 0; i < tamPilha; i++)
			{
				if (ID == pilha[i].getId())
				{
					System.out.println("ID #"+ pilha[i].getId()
							+ "localizado.\n Posição na pilha: " + (i+1));
					i = tamPilha;
					aux = 1;
				}
			}
		}
		if (aux == 0)
		{
			System.out.println("ID #" + ID + " não encontrado.");
		}
		else
		{
			System.out.println("lista vazia");
		}
	}


	public void RemoverPorNome(String nome, Atributos produto)
	{
		int aux = 0;
		if (!pilhaVazia())
		{
			for (int i = 0; i < tamPilha; i++)
			{
				if (nome.equalsIgnoreCase(pilha[i].getNome()))
				{
					System.out.println(nome + " removido, posição: " + (i+1));
					produto = pilha[i];

					AdicionarAosRemovidos(produto);

					for (int j = i; j < tamPilha; j++)
					{
						pilha[j] = pilha[j+1];
					}
					tamPilha --;

					aux = 1;
					i = tamPilha;
				}
			}
		}
		else
		{
			if (aux == 0)
			{
				System.out.println("Produto: " + nome + " não encontrado.");
			}
			else
			{
				System.out.println("Pilha vazia");
			}
		}
	}
	
	public void PercorrerPilha()
	{
		if (!pilhaVazia())
		{
			System.out.println("exibindo pilha");
			for (int i = 0; i < tamPilha; i++)
			{
				System.out.println("ID:                 "+pilha[i].getId()+
						"\nNome:               "+pilha[i].getNome()+
						"\nQuantidade:         "+pilha[i].getQnt()+
						"\nValor:              "+pilha[i].getValor());
			}
		}
		else
		{
			System.out.println("Pilha vazia");
		}
	}

	public void PercorrerPilhaRemovidos()
	{
		if (tamPilhaRemovidos != 0)
		{
			System.out.println("exibindo pilha de removidos");
			for (int i = 0; i < tamPilhaRemovidos; i++)
			{
				System.out.println("ID:                 "+pilhaRemovidos[i].getId()+
						"\nNome:               "+pilhaRemovidos[i].getNome()+
						"\nQuantidade:         "+pilhaRemovidos[i].getQnt()+
						"\nValor:              "+pilhaRemovidos[i].getValor()+
						"\n-----------------------");
			}
		}
		else
		{
			System.out.println("Pilha vazia");
		}
	}

}
