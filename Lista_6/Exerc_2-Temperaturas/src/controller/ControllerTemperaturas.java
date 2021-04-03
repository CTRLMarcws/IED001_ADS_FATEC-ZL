package controller;

import entity.NO;

public class ControllerTemperaturas
{
	private NO inicio;
	
	public ControllerTemperaturas()
	{
		this.inicio = null;
	}

	
public boolean listaVazia()
{
	if(inicio == null)
	{
		return true;
	}
	return false;
}

public void adicionarInicio(double temp)
{
	NO novo = new NO();
	novo.setTemp(temp);
	novo.setProx(inicio);
	inicio = novo;
}

public void adicionarFinal(double temp)
{
	if (listaVazia())
	{
		adicionarInicio(temp);
	}
	else
	{
		NO auxiliar = inicio;
		
		while (auxiliar.getProx() != null)
		{
			auxiliar = auxiliar.getProx();
		}
		
		NO novo = new NO();
		novo.setTemp(temp);
		auxiliar.setProx(novo);
	}
}

public void adicionarPosicao(double temp, int posicao)
{
	NO novo = new NO();
	novo.setTemp(temp);
	
	//inserir validações de lista vazia e lista cheia;
	
	if(posicao == 1)
	{
		adicionarInicio(temp);
	}
	else
	{
		NO auxiliar = inicio;
		int i = 1; //?
		
		while(auxiliar != null && i < (posicao - 1))//aux.setProx?
		{
			auxiliar = auxiliar.getProx();
			i++;
		}
		
		if(i == (posicao - 1))
		{
			novo.setProx(auxiliar.getProx());
			auxiliar.setProx(novo);
		}
		else
		{
			//posição invalida
		}
	}
}

public double removerInicio()
{
	double aux = -300;
	
	if(listaVazia())
	{
		return aux;
	}
	else
	{
		aux = inicio.getTemp();
		inicio = inicio.getProx();
	}
	
	return aux;
}

public double removerFinal()
{
	double aux = -300;
	
	if(listaVazia())
	{
		return aux;
	}
	else
	{
		if(inicio.getProx() == null)
		{
			aux = inicio.getTemp();
			inicio = null;
			return aux;
		}
		else
		{
			NO auxiliar1 = inicio;
			NO auxiliar2 = inicio;
			
			while (auxiliar1.getProx() != null)
			{
				auxiliar2 = auxiliar1;
				auxiliar1  = auxiliar1.getProx();
			}
			
			aux = auxiliar1.getTemp();
			auxiliar2.setProx(null);
		}
	}
	
	return aux;
}

public double removerPosicao(int posicao)
{
	NO auxiliar1 = inicio;
	double aux = -1;
	int i = 1;
	
	if(listaVazia())
	{
		aux = -300;
	}
	else
	{
		if(posicao == 1)
		{
			aux = removerInicio();
		}
		else
		{
			while(auxiliar1.getProx() != null)
			{
				auxiliar1 = auxiliar1.getProx();
				i++;
			}
			
			if (posicao > i || posicao < 0 || posicao == 0)
			{
				aux = -400;
			}
			else if(posicao == i)
			{
				aux = removerFinal();
			}
			else
			{
				NO auxiliar2 = auxiliar1;
				
				while(i < posicao)
				{
					auxiliar2 = auxiliar1;
					auxiliar1 = auxiliar1.getProx();
					i++;
				}
				
				aux = auxiliar1.getTemp();
				auxiliar2.setProx(auxiliar1.getProx());
			}
		}
	}
	
	return aux;
	
}

public String percorrer()
{
	NO auxiliar = inicio;
	String msg = "";
	
	if(listaVazia())
	{
		msg = "Lista vazia.";
	}
	else
	{
		while(auxiliar != null)
		{
			msg += auxiliar.getTemp() + "\n";
			auxiliar = auxiliar.getProx();
		}
	}
	
	return msg;
}


}
