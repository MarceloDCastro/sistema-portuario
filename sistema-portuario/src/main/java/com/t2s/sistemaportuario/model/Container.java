package com.t2s.sistemaportuario.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_container")
public class Container extends AbstractEntity {	
	private static final long serialVersionUID = 1L;

	@Column(name = "nm_cliente", nullable = false, length = 80)
	private String nomeCliente;
	
	@Column(name = "cd_container", nullable = false, length = 11)
	private String numero;
	
	@Column(name = "ds_tipo", nullable = false)
	private Integer tipo;
	
	@Column(name = "ds_status", nullable = false)
	private StatusContainer status;
	
	@Column(name = "ds_Categoria", nullable = false)
	private CategoriaContainer categoria;
	
	public Container() {
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public StatusContainer getStatus() {
		return status;
	}

	public void setStatus(StatusContainer status) {
		this.status = status;
	}

	public CategoriaContainer getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaContainer categoria) {
		this.categoria = categoria;
	}
	
}