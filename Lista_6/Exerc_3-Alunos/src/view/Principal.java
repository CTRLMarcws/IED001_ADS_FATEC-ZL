package view;

import javax.swing.JOptionPane;

import controller.ControllerAlunos;
import entity.Atributos;

public class Principal
{

	public static void main(String[] args)
	{
		ControllerAlunos lista = new ControllerAlunos();
		int opc = 0, posicao = 0;
		Atributos aluno;

		while (opc != 9)
		{
			opc = Integer.parseInt(JOptionPane.showInputDialog(null,
							  "          Lista de Alunos"
							+ "\n   Escolha a opção desejada"
							+ "\n----------------------------------------"
							+ "\n1 - Adicionar no início"
							+ "\n2 - Adicionar no final"
							+ "\n3 - Adicionar em posição específica"
							+ "\n4 - Remover no início"
							+ "\n5 - Remover no final"
							+ "\n6 - Remover em posição específica"
							+ "\n7 - Demonstrar lista"
							+ "\n9 - Finalizar\n\n"));

			switch (opc)
			{
			case 1:
				aluno = adicionar();
				lista.adicionarInicio(aluno);
				demonstrar(aluno, 0);
				break;

			case 2:
				aluno = adicionar();
				lista.adicionarFinal(aluno);
				demonstrar(aluno, 0);
				break;

			case 3:
				aluno = adicionar();
				posicao = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Informe a posição em que o aluno deve assumir na lista:"));
				lista.adicionarPosicao(aluno, posicao);
				JOptionPane.showMessageDialog(null,"Aluno " + aluno.getNome() + " foi adicionado.\n\nDados:"
						+ "\nRA:       " + aluno.getRA()
						+ "\nNome:     " + aluno.getNome()
						+ "\nTurma:    " + aluno.getTurma()
						+ "\nSemestre: " + aluno.getSemestre()
						+ "\nPosição:  " + posicao);
				break;

			case 4:
				aluno = new Atributos();
				aluno = lista.removerInicio();
				demonstrar(aluno, 1);
				break;

			case 5:
				aluno = new Atributos();
				aluno = lista.removerFinal();
				demonstrar(aluno, 1);
				break;

			case 6:
				aluno = new Atributos();
				posicao = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Informe a posição do aluno que deve ser removido da lista:"));
				aluno = lista.removerPosicao(posicao);
				demonstrar(aluno, 1);
				break;

			case 7:
				JOptionPane.showMessageDialog(null, lista.percorrer());
				break;

			case 9:
				JOptionPane.showMessageDialog(null, "Finalizando...");
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opção invalida.");
				break;
			}
		}


	}
	public static Atributos adicionar()
	{
		Atributos aluno = new Atributos();
		int aux = 0;
		while(aux == 0)
		{
			try
			{
				aluno.setRA(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o RA do aluno:")));			
				aux = 1;
			}
			catch(NumberFormatException err)
			{
				JOptionPane.showMessageDialog(null,"O campo RA é obrigatório e numérico.", "Erro" ,JOptionPane.ERROR_MESSAGE);
			}
		}
		aluno.setNome(JOptionPane.showInputDialog(null, "Insira o nome do aluno:"));
		aluno.setTurma(JOptionPane.showInputDialog(null, "Insira a turma do aluno:"));
		aluno.setSemestre(JOptionPane.showInputDialog(null, "Insira o semestre do aluno:"));
		return aluno;
	}

	public static void demonstrar(Atributos aluno, int tipo)
	{
		if (tipo == 0)
		{
			JOptionPane.showMessageDialog(null,"Aluno " + aluno.getNome() + " foi adicionado.\n\nDados:"
					+ "\nRA:       " + aluno.getRA()
					+ "\nNome:     " + aluno.getNome()
					+ "\nTurma:    " + aluno.getTurma()
					+ "\nSemestre: " + aluno.getSemestre());			
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Aluno " + aluno.getNome() + " foi removido.\n\nDados:"
					+ "\nRA:       " + aluno.getRA()
					+ "\nNome:     " + aluno.getNome()
					+ "\nTurma:    " + aluno.getTurma()
					+ "\nSemestre: " + aluno.getSemestre());	
		}
	}
}