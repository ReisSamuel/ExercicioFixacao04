package br.ufjf.dcc.poo.model;

import java.util.Date;

public class Pessoa {
	private String nome;
	private Date dataNasc;
	
	public int calculaIdade() {
		return 0;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}
	
}
