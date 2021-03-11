package entity;

public class Atributos {

//ID, nome, RG, telefone e data de nascimento
	private int ID, RG, tel;
	private String nome, nasc;
	
	public Atributos (int ID, int RG, int tel, String nome, String nasc)
	{
		this.ID = ID;
		this.RG = RG;
		this.tel = tel;
		this.nome = nome;
		this.nasc = nasc;
	}
	
	public int getId()
	{
		return ID;
	}
	
	public void setId(int ID)
	{
		this.ID = ID;
	}
	
	public int getRg()
	{
		return RG;
	}
	
	public void setRg(int RG)
	{
		this.RG = RG;
	}
	
	public int getTel()
	{
		return tel;
	}
	
	public void setTel(int tel)
	{
		this.tel = tel;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public String getNasc()
	{
		return nasc;
	}
	
	public void setNacs(String nasc)
	{
		this.nasc = nasc;
	}
}
