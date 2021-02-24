package controller;

public class MetodoString {

	private String lista[];
	private int tamanho;
	String msgListaCheia = "O elemento n�o pode ser adicionado pois a lista est� cheia";
	String msgListaVazia = "A lista est� vazia";
	
//	Metodo construtor
	public MetodoString()
	{
		lista = new String[5];
		tamanho = 0;
	}
	
//	Fun��o de verifica��o, caso a lista esteja vazia
	public boolean listaVazia()
	{
		if (tamanho == 0)
		{
			return true;
		}
		return false;
	}
		
//	Fun��o de verifica��o, caso a lista esteja cheia
	public boolean listaCheia()
	{
		if (tamanho > lista.length)
		{
			return true;			
		}
		return false;
	}
	

	public String adicionarInicio(String novo)
	{
		if (!listaCheia())
		{
			for (int i = tamanho; i > 0; i--)
				{
					lista[i] = lista [i - 1];
				}
				lista[0] = novo;
				tamanho ++;
		}
		else
		{
			return msgListaCheia;
		}
		
		return "'" + novo + "' foi adicionado na posi��o inicial da lista";
	}
	
	
	public String adicionarFinal(String novo)
	{
		if (!listaCheia())
		{
			lista[tamanho] = novo;
			tamanho ++;
		}
		else
		{
			return msgListaCheia;
		}
		
		return "'" + novo + "' foi adicionado na �ltima posi��o da lista";
	}
	
	public String adicionarQualquer(String novo, int pos)
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
						lista[i] = lista[i - 1];
					}
				}
				lista[i] = novo;
				tamanho ++;
			}
			else
			{
				return "O elemento '" + novo + "' n�o foi adicionado pois a posi��o " + pos + " � inv�lida";
			}
		}
		else
		{
			return msgListaCheia;
		}
		
		return "'" + novo + "' foi adicionado na " + pos + "� posi��o da lista";
	}
	
	public String removerInicio()
	{
		String aux;
		
		if (!listaVazia())
		{
			aux = lista[0];
			
			for (int i = 1; i < tamanho; i++)
			{
				lista[i - 1] = lista [i];
			}
			tamanho --;
			return "O elemento '" +  aux + "' foi removido da lista (primeira posi��o).";
		}
		else
		{
			return msgListaVazia;
		}
	}
	
	public String removerFinal()
	{
		String aux;
		
		if (!listaVazia())
		{
			aux = lista[tamanho - 1];
			
			for (int i = 0; i < tamanho; i++)
			{
				if (i == tamanho - 1)
				{
					tamanho --;
				}
			}
			return "O elemento '" +  aux + "' foi removido da lista (�ltima posi��o).";
		}
		else
		{
			return msgListaVazia;
		}
	}
	
	public String removerQualquer(int pos)
	{
		String aux = null;
		
		if (!listaVazia())
		{
			if ((pos < tamanho) && (pos >= 0))
			{
				aux = lista[pos];				
			}
			
			for (int i = pos; i < tamanho - 1; i++)
			{
					lista[i] = lista[i + 1];
			}
			tamanho --;
			return "O elemento '" + aux + "' foi removido da lista (" + pos + "� posi��o).";
		}
		else
		{
			return msgListaVazia;
		}
	}
	
	public String percorrer()
	{
		StringBuffer buffer = new StringBuffer();
		
		for (int i = 0; i < tamanho; i++)
		{
			buffer.append(lista[i]);
			buffer.append("\n");
			
		}
		
		return buffer.toString();
	}
}

