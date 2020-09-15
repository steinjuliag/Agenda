package com.julia.agenda.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Servico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idServico;
	private String nome;
	private Double valor;
	private int tempoServicoMinutos;
	@OneToOne
	@JoinColumn(name = "idProfissional")
	private Profissional profissional;

	public Long getIdServico() {
		return idServico;
	}

	public void setIdServico(Long idServico) {
		this.idServico = idServico;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public int getTempoServicoMinutos() {
		return tempoServicoMinutos;
	}

	public void setTempoServicoMinutos(int tempoServicoMinutos) {
		this.tempoServicoMinutos = tempoServicoMinutos;
	}

	public Profissional getProfissional() {
		return profissional;
	}

	public void setProfissional(Profissional profissional) {
		this.profissional = profissional;
	}

	@Override
	public String toString() {
		return "Servico [idServico=" + idServico + ", nome=" + nome + ", valor=" + valor + ", tempoServicoMinutos="
				+ tempoServicoMinutos + ", profissional=" + profissional + "]";
	}

}
