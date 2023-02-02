package br.ufjf.dcc.poo.model;

import java.util.ArrayList;

public class Produto {
	private String nomeProduto;
	private int peso;
	private int qtdeDisponivel;
	private ArrayList<ItemPedido> itens = new ArrayList<>();
	
	public Produto consultarProduto() {
		Produto p = new Produto();
		return p;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getQtdeDisponivel() {
		return qtdeDisponivel;
	}

	public void setQtdeDisponivel(int qtdeDisponivel) {
		this.qtdeDisponivel = qtdeDisponivel;
	}

	public ArrayList<ItemPedido> getItens() {
		return itens;
	}

	public void setItens(ArrayList<ItemPedido> itens) {
		this.itens = itens;
	}

}
