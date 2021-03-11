package entity;

public class Atributos {
//ID, nome, valor e quantidade
	
	private int ID, qnt;
	private String nome;
	private double valor;
	
	public Atributos(int ID, int qnt, String nome, double valor)
	{
		this.ID = ID;
		this.nome = nome;
		this.valor = valor;
		this.qnt = qnt;
	}
	
	public int getId()
	{
		return ID;
	}
	
	public void setId(int ID)
	{
		this.ID = ID;
	}
	
	public int getQnt()
	{
		return qnt;
	}
	
	public void setQnt(int qnt)
	{
		this.qnt = qnt;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public double getValor()
	{
		return valor;
	}
	
	public void setValor(double valor)
	{
		this.valor = valor;
	}
}
