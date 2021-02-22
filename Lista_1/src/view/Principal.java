package view;

import javax.swing.JOptionPane;

public class Principal {
		
	public static void main(String[] args) throws Exception
	{
	    String opc = "";
	    
        while (opc != "Encerrar") {
            opc = JOptionPane.showInputDialog("Lista 01 - Estrutura de Dados - \nDigite o número do exercicio ou digite 'Encerrar' para finalizar a aplicação.\n\nOs resultados são exibidos no console.");
            	switch (opc) {
                case "1":
                	LimparTela();
                	controller.Ls01_Ex01 Ex01 = new controller.Ls01_Ex01();
                	Ex01.Exercicio1();
                    break;
                    
                case "2":
                	LimparTela();
                	controller.Ls01_Ex02 Ex02 = new controller.Ls01_Ex02();
                	Ex02.Exercicio2();
                    break;
                    
                case "3":
                	LimparTela();
                	controller.Ls01_Ex03 Ex03 = new controller.Ls01_Ex03();
                	Ex03.Exercicio3();
                    break;
                    
                case "4":
                	LimparTela();
                	controller.Ls01_Ex04 Ex04 = new controller.Ls01_Ex04();
                	Ex04.Exercicio4();
                    break;
                    
                case "5":
                	LimparTela();
                	controller.Ls01_Ex05 Ex05 = new controller.Ls01_Ex05();
                	Ex05.Exercicio5();
                    break;
                    
                case "6":
                	LimparTela();
                	controller.Ls01_Ex06 Ex06 = new controller.Ls01_Ex06();
                	Ex06.Exercicio6();
                    break;
                    
                case "7":
                	LimparTela();
                	controller.Ls01_Ex07 Ex07 = new controller.Ls01_Ex07();
                	Ex07.Exercicio7();
                    break;
                    
                case "8":
                	LimparTela();
                	controller.Ls01_Ex08 Ex08 = new controller.Ls01_Ex08();
                	Ex08.Exercicio8();
                    break;
                    
                case "9":
                	LimparTela();
                	controller.Ls01_Ex09 Ex09 = new controller.Ls01_Ex09();
                	Ex09.Exercicio9();
                    break;
                    
                case "10":
                	LimparTela();
                	controller.Ls01_Ex10 Ex10 = new controller.Ls01_Ex10();
                	Ex10.Exercicio10();
                    break;
                    
                case "11":
                	LimparTela();
                	controller.Ls01_Ex11 Ex11 = new controller.Ls01_Ex11();
                	Ex11.Exercicio11();
                    break;

                case "Encerrar":
                    System.out.print("FIM");
                    System.exit(0);
                    break;
                    
                case "encerrar":
                System.out.print("FIM");
                System.exit(0);
                break;
                    
                
                default:
                    JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA");
            }
        }
	}
	
	static public void LimparTela()
	{
		for (int i = 0; i < 5; i++)
		{
			System.out.println(" ");
		}
	}
}