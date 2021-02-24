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
		String novo, listaToString = null, msg = null;
		String op[] = {"String", "Char"};

		tipo = JOptionPane.showOptionDialog(null, "Defina o tipo da lista para prosseguir:\nString: Palavra\nChar: Carácter", null, JOptionPane.DEFAULT_OPTION,
				JOptionPane.INFORMATION_MESSAGE, null, op, op[0]);


		while (opc != 9)
		{


			if (tipo == 0)
			{
				listaToString = metodoString.percorrer();
			}
			else if (tipo == 1)
			{
				listaToString = metodoChar.percorrer();
			}

			opc = Integer.parseInt(JOptionPane.showInputDialog("Controle de lista - " + op[tipo] + ":\n\nLista:\n" + listaToString + "\nOpções:\n"
					+ "Adicionar:\n1 - Adicionar palavra ou frase ao inicio;\n2 - Adicionar palavra ou frase ao final;\n3 - Adicionar palavra ou frase em posição determinada;\n\n"
					+ "Remover:\n4 - Remover palavra ou frase do inicio;\n5 - Remover palavra ou frase do final;\n6 - Remover palavra ou frase em posição determinada;"
					+ "\n\n9 - Para encerrar."));

			switch (opc)
			{
			case 1:
				if (tipo == 0)
				{
					novo = JOptionPane.showInputDialog("Elemento a ser adicionado ao inicio da lista");
					msg = metodoString.adicionarInicio(novo);
				}
				else if (tipo == 1)
				{
					elemento = JOptionPane.showInputDialog("Letra a ser adicionada ao inicio da lista\nCaso mais de uma letra seja informada, apenas a primeira será considerada.").charAt(0);
					msg = metodoChar.adicionarInicio(elemento);
				}

				JOptionPane.showMessageDialog(null, msg);
				break;

			case 2:
				if (tipo == 0)
				{
					novo = JOptionPane.showInputDialog("Elemento a ser adicionado ao final da lista");
					msg = metodoString.adicionarFinal(novo);
				}
				else if (tipo == 1)
				{
					elemento = JOptionPane.showInputDialog("Letra a ser adicionada ao final da lista\nCaso mais de uma letra seja informada, apenas a primeira será considerada.").charAt(0);
					msg = metodoChar.adicionarFinal(elemento);
				}

				JOptionPane.showMessageDialog(null, msg);
				break;


			case 3:
				try
				{
					pos = Integer.parseInt(JOptionPane.showInputDialog("Posição em que o elemento deve ser adicionado"));					

					if (tipo == 0)
					{
						novo = JOptionPane.showInputDialog("Elemento a ser adicionado na " + pos + "ª posição da lista");
						msg = metodoString.adicionarQualquer(novo, pos);
					}
					else if (tipo == 1)
					{
						elemento = JOptionPane.showInputDialog("Letra a ser adicionada na " + pos + "ª posição da lista.\nCaso mais de uma letra seja informada, apenas a primeira será considerada.").charAt(0);
						msg = metodoChar.adicionarInicio(elemento);
					}

					JOptionPane.showMessageDialog(null, msg);
				}
				catch(NumberFormatException err)
				{
					JOptionPane.showMessageDialog(null, "Formato incorreto.\nPara posição insira apenas números.");
					System.out.println(err);
				}

				break;

			case 4:
				if (tipo == 0)
				{
					msg = metodoString.removerInicio();
				}
				else if (tipo == 1)
				{
					msg = metodoChar.removerInicio();
				}

				JOptionPane.showMessageDialog(null, msg);
				break;

			case 5:
				if (tipo == 0)
				{
					msg = metodoString.removerFinal();
				}
				else if (tipo == 1)
				{
					msg = metodoChar.removerFinal();
				}

				JOptionPane.showMessageDialog(null, msg);
				break;

			case 6:
				try
				{
					pos = Integer.parseInt(JOptionPane.showInputDialog("Posição em que o elemento deve ser removido"));
					if (tipo == 0)
					{
						msg = metodoString.removerQualquer(pos);					
					}
					else if (tipo == 1)
					{
						msg = metodoChar.removerQualquer(pos);
					}

					JOptionPane.showMessageDialog(null, msg);
				}
				catch(NumberFormatException err)
				{
					JOptionPane.showMessageDialog(null, "Formato incorreto.\nPara posição insira apenas números.");
				}
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
