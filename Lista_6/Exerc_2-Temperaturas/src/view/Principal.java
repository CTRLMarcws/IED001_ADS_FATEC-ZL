package view;

import javax.swing.JOptionPane;

import controller.ControllerTemperaturas;

public class Principal {

	public static void main(String[] args)
	{
		ControllerTemperaturas lista = new ControllerTemperaturas();
		
		int opc = 0, posicao = 0;
		double temperatura = 0, aux = 0;
		String err = "    Temperatura invalida.\nValor abaixo do zero absoluto";
		String err300 = "A lista vazia.\nAdicione valores e tente novamente.";
		while (opc != 9)
		{
			
			opc = Integer.parseInt(JOptionPane.showInputDialog(null,
			   "       Lista de Temperaturas"
			 + "\n   Escolha a op��o desejada"
			 + "\n----------------------------------------\n"
			 + "\n1-Adicionar no in�cio"
			 + "\n2-Adicionar no final"
			 + "\n3-Adicionar em posi��o espec�fica"
			 + "\n4-Remover no in�cio"
			 + "\n5-Remover no final"
			 + "\n6-Remover em posi��o espec�fica"
			 + "\n9-Finalizar"
			 + "\n\nLista:\n" + lista.percorrer()));
			switch (opc)
			{
			case 1:
				temperatura = Double.parseDouble(JOptionPane.showInputDialog("Insira a temperatura desejada:"));
				if (temperatura < -274)
				{
					JOptionPane.showMessageDialog(null, err);
				}
				else
				{
				lista.adicionarInicio(temperatura);
				JOptionPane.showMessageDialog(null, "A temperatura " + temperatura
						+ "� foi adicionada ao inicio.");
				}
				break;
			
			case 2:
				temperatura = Double.parseDouble(JOptionPane.showInputDialog("Insira a temperatura desejada:"));
				if (temperatura < -274)
				{
					JOptionPane.showMessageDialog(null, err);
				}
				else
				{
					lista.adicionarFinal(temperatura);
					JOptionPane.showMessageDialog(null, "A temperatura " + temperatura
							+ "� foi adicionada ao final.");					
				}
				break;
				
			case 3:
				temperatura = Double.parseDouble(JOptionPane.showInputDialog("Insira a temperatura desejada:"));
				if (temperatura < -274)
				{
					JOptionPane.showMessageDialog(null, err);				
				}
				else
				{
				posicao = Integer.parseInt(JOptionPane.showInputDialog("Insira a posi��o desejada:"));
				lista.adicionarPosicao(temperatura, posicao);
				JOptionPane.showMessageDialog(null, "Temperatura " + temperatura + "� adicionada na "
						+ posicao + "� posi��o");
				}
				break;
				
			case 4:
				aux = lista.removerInicio();
				if(aux == -300)
				{
					JOptionPane.showMessageDialog(null, err300);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "A temperatura " + aux + "� foi removida do inicio.");					
				}
				break;
				
			case 5:
				aux = lista.removerFinal();
				if(aux == -300)
				{
					JOptionPane.showMessageDialog(null, err300);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "A temperatura " + aux + "� foi removida do final.");					
				}
				break;
				
			case 6:
				posicao = Integer.parseInt(JOptionPane.showInputDialog("Insira a posi��o desejada:"));
				aux = lista.removerPosicao(posicao);
				if(aux == -300)
				{
					JOptionPane.showMessageDialog(null, err300);
				}
				else if (aux == -400)
				{
					JOptionPane.showMessageDialog(null, "Posi��o inv�lida.");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "A temperatura " + aux
							+ "� foi removida da " + posicao + "� posi��o.");										
				}
				break;
				
			case 9:
				JOptionPane.showMessageDialog(null, "Finalizando...");
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "Op��o invalida.");
				break;
			}
		}
	}

}
