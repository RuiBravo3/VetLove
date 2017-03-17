package model;

public class Animal {
	private String classificacao,
				   raca,
				   datanasc;
	
	Ficha ficha;
	
	public String getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getDatanasc() {
		return datanasc;
	}
	public void setDatanasc(String datanasc) {
		this.datanasc = datanasc;
	}
	public Ficha getFicha() {
		return ficha;
	}
	public void setFicha(Ficha ficha) {
		this.ficha = ficha;
	}
	public Animal(String classificacao, String raca, String datanasc, Ficha ficha) {
		super();
		this.classificacao = classificacao;
		this.raca = raca;
		this.datanasc = datanasc;
		this.ficha = ficha;
	}
	
				   
}
