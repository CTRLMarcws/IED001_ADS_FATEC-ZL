package controller;

import entity.NO;
import entity.Atributos;

// private int rA;
// private String nome, turma, semestre;

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

	public void adicionarInicio(Atributos aluno)
	{
		NO novo = new NO(aluno);
		novo.prox = inicio;
		inicio = novo;
		//novo.setAluno(aluno);
		//novo.setProx() = inicio;
	}

	public void adicionarFinal(Atributos aluno)
	{
		if(listaVazia())
		{
			adicionarInicio(aluno);
		}
		else
		{
			NO auxiliar = inicio;

			while(auxiliar.prox != null)
			{
				auxiliar = auxiliar.prox;
			}
			NO novo = new NO (aluno);
			auxiliar.prox = novo;
		}
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
				novo.prox = auxiliar.prox;
				auxiliar.prox = novo;
			}
			else
			{
				//erro
			}
		}
	}

	public Atributos removerInicio()
	{
		Atributos removido = new Atributos();

		if (listaVazia())
		{
			//"Erro, lista vazia.";
		}
		else
		{
			removido = inicio.aluno;
			inicio = inicio.prox;
		}
		return removido;
	}

	public Atributos removerFinal()
	{
		Atributos removido = new Atributos();

		if(listaVazia())
		{
			//lista vazia
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
				NO auxiliar1 = inicio;
				NO auxiliar2 = inicio;

				while (auxiliar1.prox != null)
				{
					auxiliar2 = auxiliar1;
					auxiliar1 = auxiliar1.prox;
				}

				removido = auxiliar1.aluno;
				auxiliar2.prox= null; 
			}
		}

		return removido;
	}

	public Atributos removerPosicao(int posicao)
	{
		Atributos removido = new Atributos();
		int i = 1;
		//		String msg; 
		NO auxiliar1 = inicio;

		if(listaVazia())
		{
			//			return msg;
			//lista vazia
		}
		if(posicao == 1)
		{
			removido = removerInicio();
		}
		else
		{
			while(auxiliar1.prox != null)
			{
				auxiliar1 = auxiliar1.prox;
				i++;
			}

			if(posicao > 1 || posicao == 0)
			{
				//posicao invalida
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
					auxiliar1 = auxiliar1.prox;
					posicao--;
				}

				removido = auxiliar1.aluno;
				auxiliar2.prox = auxiliar1.prox;
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
			msg = "Lista de alunos:\n";

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
