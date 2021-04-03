package view;

import javax.swing.JOptionPane;

import controller.Fila;
import entity.Atributos;

public class Principal {

	public static void main(String[] args)
	{
		int ID = 0, RG = 0, tel = 0;
		String nome = null, nasc = null;
		
		Fila fila = new Fila();
		Atributos pessoa = new Atributos(ID, RG, tel, nome, nasc);
		
		
		int opc = 0;
		while (opc != 9)
		{
			opc = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - adc\n2 - remover\n"
					+ "3 - ordem/procurar por ID\n4 - ver fila\n5 - ver pilha"));
			switch (opc)
			{
			case 1:
				ID =  Integer.parseInt(JOptionPane.showInputDialog("insira o id"));
				nome = JOptionPane.showInputDialog("insira o nome");
				RG = Integer.parseInt(JOptionPane.showInputDialog("insira o RG"));
				tel = Integer.parseInt(JOptionPane.showInputDialog("insira o tel"));
				nasc = JOptionPane.showInputDialog("insira o nasc");
				fila.AdicionarPessoa(ID, RG, tel, nome, nasc);
				break;
				
			case 2:
				fila.RemoverPessoa(pessoa);
				break;
				
			case 3:
				ID =  Integer.parseInt(JOptionPane.showInputDialog("insira o id"));
				fila.Pesquisar(ID);
				break;
				
			case 4:
				fila.PercorrerFila();
				break;
				
			case 5:
				fila.PercorrerPilha();
				break;
				
			}
		}
	}

}
