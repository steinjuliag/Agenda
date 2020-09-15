package com.julia.agenda.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.julia.agenda.domain.Agenda;
import com.julia.agenda.domain.Profissional;
import com.julia.agenda.domain.Servico;

public class Teste {

	/*
	 * public static void main(String[] args) {
	 * 
	 * Agenda agenda = new Agenda(); agenda.setIdAgenda(1L);
	 * agenda.setDataInicial(LocalDateTime.now()); // preencher a data final
	 * 
	 * Profissional profissionalCabelo = new Profissional();
	 * profissionalCabelo.setIdProfissional(1L);
	 * profissionalCabelo.setNome("Julia");
	 * profissionalCabelo.setFuncao("Cabelereira");
	 * 
	 * Profissional profissionalManicure = new Profissional();
	 * profissionalManicure.setIdProfissional(1L);
	 * profissionalManicure.setNome("Julia2");
	 * profissionalManicure.setFuncao("Manicure");
	 * 
	 * Servico servico = new Servico(); servico.setIdServico(1L);
	 * servico.setNome("Cabelo"); servico.setTempoServicoMinutos(30);
	 * servico.setValor(20.0); servico.setProfissional(profissionalCabelo);
	 * 
	 * Servico servico2 = new Servico(); servico2.setIdServico(2L);
	 * servico2.setNome("Unha"); servico2.setTempoServicoMinutos(25);
	 * servico2.setValor(10.0); servico2.setProfissional(profissionalManicure);
	 * 
	 * agenda.getServicos().add(servico); agenda.getServicos().add(servico2);
	 * 
	 * int totalMinutos = 0; for (Servico serv : agenda.getServicos()) {
	 * totalMinutos += serv.getTempoServicoMinutos(); }
	 * 
	 * LocalDateTime dataFinal = agenda.getDataInicial().plusMinutes(totalMinutos);
	 * agenda.setDataFinal(dataFinal);
	 * 
	 * // testes DateTimeFormatter formatter =
	 * DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	 * System.out.println(formatter.format(agenda.getDataInicial()));
	 * System.out.println(formatter.format(agenda.getDataFinal())); Double total =
	 * 0.0; for (Servico serv : agenda.getServicos()) {
	 * System.out.println(serv.getNome() + ": " + serv.getTempoServicoMinutos() +
	 * " minutos com " + serv.getProfissional().getNome()); total +=
	 * serv.getValor(); } System.out.println("Total: " + total); }
	 */
}
