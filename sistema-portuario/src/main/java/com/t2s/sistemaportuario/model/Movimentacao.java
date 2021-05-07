package com.t2s.sistemaportuario.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_movimentacao")
public class Movimentacao extends AbstractEntity {
	private static final long serialVersionUID = 1L;
	
	@Column(name = "ds_tipo", nullable = false)
	private TipoMovimentacao tipo;
	
	@Column(name = "dt_inicio", nullable = false)
	private Date dataHoraInicio;
	
	@Column(name = "dt_fim", nullable = true)
	private Date dataHoraFim;
	
	public Movimentacao() {
	}

	public TipoMovimentacao getTipo() {
		return tipo;
	}

	public void setTipo(TipoMovimentacao tipo) {
		this.tipo = tipo;
	}

	public Date getDataHoraInicio() {
		return dataHoraInicio;
	}

	public void setDataHoraInicio(Date dataHoraInicio) {
		this.dataHoraInicio = dataHoraInicio;
	}

	public Date getDataHoraFim() {
		return dataHoraFim;
	}

	public void setDataHoraFim(Date dataHoraFim) {
		this.dataHoraFim = dataHoraFim;
	}
	
}
