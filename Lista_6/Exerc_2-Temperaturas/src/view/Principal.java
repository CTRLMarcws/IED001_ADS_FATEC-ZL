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
			 + "\n   Escolha a opção desejada"
			 + "\n----------------------------------------\n"
			 + "\n1-Adicionar no início"
			 + "\n2-Adicionar no final"
			 + "\n3-Adicionar em posição específica"
			 + "\n4-Remover no início"
			 + "\n5-Remover no final"
			 + "\n6-Remover em posição específica"
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
						+ "º foi adicionada ao inicio.");
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
							+ "º foi adicionada ao final.");					
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
				posicao = Integer.parseInt(JOptionPane.showInputDialog("Insira a posição desejada:"));
				lista.adicionarPosicao(temperatura, posicao);
				JOptionPane.showMessageDialog(null, "Temperatura " + temperatura + "º adicionada na "
						+ posicao + "ª posição");
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
					JOptionPane.showMessageDialog(null, "A temperatura " + aux + "º foi removida do inicio.");					
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
					JOptionPane.showMessageDialog(null, "A temperatura " + aux + "º foi removida do final.");					
				}
				break;
				
			case 6:
				posicao = Integer.parseInt(JOptionPane.showInputDialog("Insira a posição desejada:"));
				aux = lista.removerPosicao(posicao);
				if(aux == -300)
				{
					JOptionPane.showMessageDialog(null, err300);
				}
				else if (aux == -400)
				{
					JOptionPane.showMessageDialog(null, "Posição inválida.");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "A temperatura " + aux
							+ "º foi removida da " + posicao + "ª posição.");										
				}
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

}
