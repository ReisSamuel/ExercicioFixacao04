package br.ufjf.dcc.poo.model;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
	private Date dataPedido;
	private String vendedor;
	private String status;
	private String observacoes;
	private Cliente cliente;
	private ArrayList<ItemPedido> itensPedidos;
	
	public void encerrarPedido() {
		
	}
	public void cancelarPedido() {
		
	}
	
	public Date getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}
	public String getVendedor() {
		return vendedor;
	}
	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public ArrayList<ItemPedido> getItensPedidos() {
		return itensPedidos;
	}
	public void setItensPedidos(ArrayList<ItemPedido> itensPedidos) {
		this.itensPedidos = itensPedidos;
	}
}
