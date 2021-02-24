package view;

import javax.swing.JOptionPane;

import controller.Metodos;

public class Principal
{

	public static void main(String[] args)
	{

		Metodos metodos = new Metodos();

		int pos = 0, opc = 0;
		String novo, listaString, msg;

		while (opc != 9)
		{

			opc = Integer.parseInt(JOptionPane.showInputDialog(""));

			switch (opc)
			{

			case 1:
				novo = JOptionPane.showInputDialog("Elemento a ser adicionado ao inicio da lista");
				msg = metodos.adicionarInicio(novo);
				break;
				
			case 2:
				novo = JOptionPane.showInputDialog("Elemento a ser adicionado ao final da lista");
				msg = metodos.adicionarFinal(novo);
				JOptionPane.showMessageDialog(null, msg);
				break;
				
			case 3:
				pos= Integer.parseInt(JOptionPane.showInputDialog("Posição em que o elemento deve ser adicionado"));
				novo = JOptionPane.showInputDialog("Elemento a ser adicionado na " + pos + "ª posição da lista");
				msg = metodos.adicionarInicio(novo);
				JOptionPane.showMessageDialog(null, msg);
				break;

			case 9:
				JOptionPane.showMessageDialog(null, "Programa Finalizado");
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opção inválida!");
				break;
			}



			listaString = metodos.percorrer();
			System.out.println(listaString);
		}

	}
}
