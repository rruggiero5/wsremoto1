package model;

public class Horista  extends Funcionario{
	private int numHoras;
	private float valorHora;
	
	public Horista(String nome, int numRegistro, int numHoras, float valorHora) {
		super(nome, numRegistro);
		this.numHoras = numHoras;
		this.valorHora = valorHora;
	}

	@Override
	public float calcularSalario() {
		// TODO Auto-generated method stub
		return valorHora * numHoras;
	}

	public int getNumHoras() {
		return numHoras;
	}

	public void setNumHoras(int numHoras) {
		this.numHoras = numHoras;
	}

	public float getValorHora() {
		return valorHora;
	}

	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}
	
	

}