package view;

import javax.swing.JOptionPane;

import controller.Cont_Produtos;
import entity.Atributos;

public class Principal {
	/*
	 * 2. Uma Loja Virtual necessita de uma aplica��o que fa�a o gerenciamento de suas vendas por meio de uma Pilha que retire os produtos removidos que n�o existam em estoque. 
	 * A classe Produtos possui os atributos ID, nome, valor e quantidade. A aplica��o deve:
	 * -verificar se a pilha est� vazia, retornando true se estiver vazia e false se n�o estiver;
	 * -adicionar um produto na pilha, caso a opera��o n�o possa ser realizada, mostre mensagem avisando;
	 * -remover um produto na pilha, caso a opera��o n�o possa ser realizada, mostre mensagem avisando;
	 * -adicionar todos os produto removidos em uma pilha de produtos
	 * -remover uma pesquisa por nome do produto
	 * -pesquisar a ordem de espera de uma pessoa na pilha
	 * -percorrer e apresentar cada um dos elementos da pilha
	 * -comente no c�digo os trechos de cria��o dos endere�os de mem�ria
	 * -comente no c�digo todas as associa��es entre classes
	 */

	public static void main(String[] args)
	{
		int ID = 0, qnt = 0;
		String nome = null;
		double valor = 0;

		Cont_Produtos pilha = new Cont_Produtos();//alterar
		Atributos produto = new Atributos(ID, qnt, nome, valor);


		int opc = 0;
		while (opc != 9)
		{
			opc = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - adc\n2 - remover\n"
					+ "3 - ordem/procurar por ID\n4 - remove por nome\n5 - ver pilha\n6 - ver pilha removidos"));
			switch (opc)
			{
			case 1:
				nome = JOptionPane.showInputDialog("insira o nome");
				qnt = Integer.parseInt(JOptionPane.showInputDialog("insira a quantidade"));
				valor = Double.parseDouble(JOptionPane.showInputDialog("insira o valor"));
				pilha.AdicionarProduto(qnt, nome, valor);
				break;

			case 2:
				pilha.RemoverProduto(produto);
				break;

			case 3:
				ID =  Integer.parseInt(JOptionPane.showInputDialog("insira o id"));
				pilha.Pesquisar(ID);
				break;
				
			case 4:
				nome = JOptionPane.showInputDialog("insira o nome");
				pilha.RemoverPorNome(nome, produto);
				break;


			case 5:
				pilha.PercorrerPilha();
				break;

			case 6:
				pilha.PercorrerPilhaRemovidos();
				break;
				
			default:
				System.out.println("op��o incorreta");
				break;
			}
		}
	}
}
