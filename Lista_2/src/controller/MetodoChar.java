package controller;

public class MetodoChar {

	private char listaChar[];
	private int tamanho;
	String msgListaCheia = "O elemento não pode ser adicionado pois a lista está cheia";
	String msgListaVazia = "A lista está vazia";
	
//	Metodo construtor
	public MetodoChar()
	{
		listaChar = new char[5];
		tamanho = 0;
	}
	
//	Função de verificação, caso a lista esteja vazia
	public boolean listaVazia()
	{
		if (tamanho == 0)
		{
			return true;
		}
		return false;
	}
		
//	Função de verificação, caso a lista esteja cheia
	public boolean listaCheia()
	{
		if (tamanho > listaChar.length)
		{
			return true;			
		}
		return false;
	}
	

	public String adicionarInicio(char elemento)
	{
		if (!listaCheia())
		{
				for (int i = tamanho; i > 0; i--)
				{
					listaChar[i] = listaChar [i - 1];
				}
				listaChar[0] = elemento;
				tamanho ++;
				System.out.println(listaChar[0]);
		}
		else
		{
			return msgListaCheia;
		}
		
		return "'" + elemento + "' foi adicionado na posição inicial da lista";
	}
	
	
	public String adicionarFinal(char novo)
	{
		if (!listaCheia())
		{
			listaChar[tamanho] = novo;
			tamanho ++;
		}
		else
		{
			return msgListaCheia;
		}
		
		return "'" + novo + "' foi adicionado na última posição da lista";
	}
	
	public String adicionarQualquer(char novo, int pos)
	{
		int i;
		
		if (!listaCheia())
		{
			if ((pos < tamanho + 1) && (pos >= 0))
			{	
				for (i = tamanho; i != pos; i--)
				{
					if (i != 0)
					{
						listaChar[i] = listaChar[i - 1];
					}
				}
				listaChar[i] = novo;
				tamanho ++;
			}
			else
			{
				return "O elemento '" + novo + "' não foi adicionado pois a posição " + pos + " é inválida";
			}
		}
		else
		{
			return msgListaCheia;
		}
		
		return "'" + novo + "' foi adicionado na " + pos + "ª posição da lista";
	}
	
	public String removerInicio()
	{
		char aux;
		
		if (!listaVazia())
		{
			aux = listaChar[0];
			
			for (int i = 1; i < tamanho; i++)
			{
				listaChar[i - 1] = listaChar [i];
			}
			tamanho --;
			return "O elemento '" +  aux + "' foi removido da lista (primeira posição).";
		}
		else
		{
			return msgListaVazia;
		}
	}
	
	public String removerFinal()
	{
		char aux;
		
		if (!listaVazia())
		{
			aux = listaChar[tamanho - 1];
			
			for (int i = 0; i < tamanho; i++)
			{
				if (i == tamanho - 1)
				{
					tamanho --;
				}
			}
			return "O elemento '" +  aux + "' foi removido da lista (última posição).";
		}
		else
		{
			return msgListaVazia;
		}
	}
	
	public String removerQualquer(int pos)
	{
		char aux = 0;
		
		if (!listaVazia())
		{
			if ((pos < tamanho) && (pos >= 0))
			{
				aux = listaChar[pos];				
			}
			
			for (int i = pos; i < tamanho - 1; i++)
			{
					listaChar[i] = listaChar[i + 1];
			}
			tamanho --;
			return "O elemento '" + aux + "' foi removido da lista (" + pos + "ª posição).";
		}
		else
		{
			return msgListaVazia;
		}
	}
	
	public String percorrer()
	{
		StringBuilder buffer = new StringBuilder();
		
		for (int i = 0; i < tamanho; i++)
		{
			buffer.append(listaChar[i]);
			buffer.append("\n");
			
		}
		
		return buffer.toString();
	}
}

