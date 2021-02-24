package view;

import javax.swing.JOptionPane;

import controller.MetodoChar;
import controller.MetodoString;

public class Principal
{

	public static void main(String[] args)
	{

		MetodoString metodoString = new MetodoString();
		MetodoChar metodoChar = new MetodoChar();

		int pos = 0, opc = 0;
		int tipo;
		char elemento;
		String novo, listaToString, msg;
		String op[] = {"String", "Char"};

		tipo = JOptionPane.showOptionDialog(null, "Defina o tipo da lista para prosseguir", null, JOptionPane.DEFAULT_OPTION,
				JOptionPane.INFORMATION_MESSAGE, null, op, op[0]);

		listaToString = metodoString.percorrer();

		if (tipo == 0)
		{
			while (opc != 9)
			{

				listaToString = metodoString.percorrer();

				opc = Integer.parseInt(JOptionPane.showInputDialog("Controle de lista - String:\n\nLista:\n" + listaToString + "\nOpções:\n"
						+ "Adicionar:\n1 - Adicionar palavra ou frase ao inicio;\n2 - Adicionar palavra ou frase ao final;\n3 - Adicionar palavra ou frase em posição determinada;\n\n"
						+ "Remover:\n4 - Remover palavra ou frase do inicio;\n5 - Remover palavra ou frase do final;\n6 - Remover palavra ou frase em posição determinada;"
						+ "\n\n9 - Para encerrar."));

				switch (opc)
				{
				case 1:
					novo = JOptionPane.showInputDialog("Elemento a ser adicionado ao inicio da lista");
					msg = metodoString.adicionarInicio(novo);
					JOptionPane.showMessageDialog(null, msg);
					break;

				case 2:
					novo = JOptionPane.showInputDialog("Elemento a ser adicionado ao final da lista");
					msg = metodoString.adicionarFinal(novo);
					JOptionPane.showMessageDialog(null, msg);
					break;

				case 3:
					pos = Integer.parseInt(JOptionPane.showInputDialog("Posição em que o elemento deve ser adicionado"));
					novo = JOptionPane.showInputDialog("Elemento a ser adicionado na " + pos + "ª posição da lista");
					msg = metodoString.adicionarQualquer(novo, pos);
					JOptionPane.showMessageDialog(null, msg);
					break;

				case 4:
					msg = metodoString.removerInicio();
					JOptionPane.showMessageDialog(null, msg);
					break;

				case 5:
					msg = metodoString.removerFinal();
					JOptionPane.showMessageDialog(null, msg);
					break;

				case 6:
					pos = Integer.parseInt(JOptionPane.showInputDialog("Posição em que o elemento deve ser removido"));
					msg = metodoString.removerQualquer(pos);
					JOptionPane.showMessageDialog(null, msg);
					break;

				case 9:
					JOptionPane.showMessageDialog(null, "Programa Finalizado");
					break;

				default:
					JOptionPane.showMessageDialog(null, "Opção inválida!");
					break;
				}
			}

		} 
		else if (tipo == 1)
		{
			while (opc != 9)
			{

				opc = Integer.parseInt(JOptionPane.showInputDialog("Controle de lista - Char:\n\nLista:\n" + listaToString + "\nOpções:\n"
						+ "Adicionar:\n1 - Adicionar carácter ao inicio;\n2 - Adicionar carácter ao final;\n3 - Adicionar carácter em posição determinada;\n\n"
						+ "Remover:\n4 - Remover carácter do inicio;\n5 - Remover carácter do final;\n6 - Remover carácter em posição determinada;"
						+ "\n\n9 - Para encerrar."));

				switch (opc)
				{
				case 1:
					elemento = JOptionPane.showInputDialog("Elemento a ser adicionado ao inicio da lista").charAt(0);
					msg = metodoChar.adicionarInicio(elemento);
					break;

				case 2:
					elemento = JOptionPane.showInputDialog("Elemento a ser adicionado ao final da lista").charAt(0);
					msg = metodoChar.adicionarFinal(elemento);
					JOptionPane.showMessageDialog(null, msg);
					break;

				case 3:
					pos= Integer.parseInt(JOptionPane.showInputDialog("Posição em que o elemento deve ser adicionado"));
					elemento = JOptionPane.showInputDialog("Elemento a ser adicionado na " + pos + "ª posição da lista").charAt(0);
					msg = metodoChar.adicionarInicio(elemento);
					JOptionPane.showMessageDialog(null, msg);
					break;

				case 4:
					msg = metodoChar.removerInicio();
					JOptionPane.showMessageDialog(null, msg);
					break;

				case 5:
					msg = metodoChar.removerFinal();
					JOptionPane.showMessageDialog(null, msg);
					break;

				case 6:
					pos = Integer.parseInt(JOptionPane.showInputDialog("Posição em que o elemento deve ser removido"));
					msg = metodoChar.removerQualquer(pos);
					JOptionPane.showMessageDialog(null, msg);
					break;

				case 9:
					JOptionPane.showMessageDialog(null, "Programa Finalizado");
					break;

				default:
					JOptionPane.showMessageDialog(null, "Opção inválida!");
					break;
				}
			}
		}

	}
}
