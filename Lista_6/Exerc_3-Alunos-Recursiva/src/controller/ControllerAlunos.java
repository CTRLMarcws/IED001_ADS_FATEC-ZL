package controller;

import entity.NO;

import javax.swing.JOptionPane;

import entity.Atributos;

public class ControllerAlunos
{
	private NO inicio;
	private String msg = "";

	public ControllerAlunos()
	{
		inicio = null;
	}

	public boolean listaVazia()
	{
		if(inicio == null)
		{
			return true;
		}
		return false;
	}
	
	public void msgListaVazia()
	{
		JOptionPane.showMessageDialog(null,"A lista está vazia.", "Erro" ,JOptionPane.ERROR_MESSAGE);
	}
	
	public void msgPosicaoInvalida()
	{
		JOptionPane.showMessageDialog(null,"Posição invalida!\nTente novamente.", "Erro", 0);
	}

	public void adicionarInicio(Atributos aluno)
	{
		NO novo = new NO(aluno);
		novo.setProx(inicio);
		inicio = novo;
	}

	public void adicionarFinal(Atributos aluno)
	{
		if(listaVazia())
		{
			adicionarInicio(aluno);
		}
		else
		{
			NO auxiliar =  buscarParaAdicionar(inicio);

			NO novo = new NO (aluno);
			auxiliar.setProx(novo);
		}
	}
	
	private NO buscarParaAdicionar(NO auxiliar)
	{
		if (auxiliar.getProx() != null)
		{
			return buscarParaAdicionar(auxiliar.getProx());
		}
		return auxiliar;
	}

	public void adicionarPosicao(Atributos aluno, int posicao)
	{
		NO novo = new NO (aluno);

		if(posicao == 1 || listaVazia())
		{
			adicionarInicio(aluno);
		}
		else
		{
			NO auxiliar = inicio;
			int i = 1;

			while (auxiliar.prox != null && i < (posicao - 1))
			{
				auxiliar = auxiliar.prox;
				i++;
			}

			if (i == (posicao - 1))
			{
				novo.setProx(auxiliar.getProx());
				auxiliar.setProx(novo);
			}
			else
			{
				msgPosicaoInvalida();
			}
		}
	}

	public Atributos removerInicio()
	{
		Atributos removido = new Atributos();

		if (listaVazia())
		{
			msgListaVazia();
		}
		else
		{
			removido = inicio.aluno;
			inicio = inicio.getProx();
		}
		return removido;
	}

	public Atributos removerFinal()
	{
		Atributos removido = new Atributos();

		if(listaVazia())
		{
			msgListaVazia();
		}
		else
		{
			if(inicio.prox==null)
			{
				removido = inicio.aluno;
				inicio = null;
			}
			else
			{
				NO auxiliar = buscarParaRemover(inicio, inicio);

				removido = auxiliar.aluno;
				auxiliar.setProx(null); 
			}
		}

		return removido;
	}

	private NO buscarParaRemover(NO auxiliar1, NO auxiliar2)
	{
		if(auxiliar1.getProx() != null)
		{
			return buscarParaRemover(auxiliar1.getProx(), auxiliar1);
		}
			return auxiliar2;
	}

	public Atributos removerPosicao(int posicao)
	{
		Atributos removido = new Atributos();
		int i = 1;
		NO auxiliar1 = inicio;

		if(listaVazia())
		{
			msgListaVazia();			
		}
		else if(posicao == 1)
		{
			removido = removerInicio();
		}
		else
		{
			while(auxiliar1.getProx() != null)
			{
				auxiliar1 = auxiliar1.getProx();
				i++;
			}

			if(posicao > i || posicao <= 0)
			{
				msgPosicaoInvalida();
			}
			else if (posicao == i)
			{
				removido = removerFinal();
			}
			else
			{
				auxiliar1 = inicio;
				NO auxiliar2 = auxiliar1;

				while(posicao > 1)
				{
					auxiliar2 = auxiliar1;
					auxiliar1 = auxiliar1.getProx();
					posicao--;
				}

				removido = auxiliar1.aluno;
				auxiliar2.setProx(auxiliar1.getProx());
			}
		}


		return removido;
	}

	public String percorrer()
	{
		NO auxiliar = inicio;
		
		if(listaVazia())
		{
			msg = "Lista vazia.";
		}
		else
		{
			int i = 1;
			msg = "Lista de alunos:";

			while(auxiliar != null)
			{
				msg += "\n\n" + i
						+ " -  RA:     " + auxiliar.aluno.getRA()
						+ "\nNome:     " + auxiliar.aluno.getNome()
						+ "\nSemestre: " + auxiliar.aluno.getSemestre()
						+ "\nTurma:    " + auxiliar.aluno.getTurma();
						auxiliar = auxiliar.prox;
						i++;
			}
		}

		return msg;
	}
}
