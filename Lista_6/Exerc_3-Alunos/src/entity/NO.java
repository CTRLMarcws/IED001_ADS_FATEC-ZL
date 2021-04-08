package entity;

public class NO
{
	public Atributos aluno;
	public NO prox;
	
	public NO(Atributos aluno)
	{
		this.aluno = aluno;
		prox = null;
	}
	
	public NO getProx()
	{
		return prox;
	}
	
	public void setProx(NO prox)
	{
		this.prox = prox;
	}
}
