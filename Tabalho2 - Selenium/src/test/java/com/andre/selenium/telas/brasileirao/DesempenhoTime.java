package com.andre.selenium.telas.brasileirao;

public class Times {

	private String time;
	private String pontos;
	private String jogos;
	private String vitorias;
	private String empates;
	private String derrotas;
	private String golspro;
	private String golscontra;
	private String totalgols;
	private String aproveitamento;

	public Times() {
		super();
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getPa() {
		return pa;
	}

	public void setPontos(String pontos) {
		this.pontos = pontos;
	}

	public String getJogos() {
		return jogos;
	}

	public void setJ(String jogos) {
		this.jogos = jogos;
	}

	public String getVitorias() {
		return vitorias;
	}

	public void setVitorias(String vitorias) {
		this.vitorias = vitorias;
	}

	public String getEmpates() {
		return empates;
	}

	public void setEmpates(String empates) {
		this.empates = empates;
	}

	public String getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(String derrotas) {
		this.derrotas = derrotas;
	}

	public String getGolsPro() {
		return golspro;
	}

	public void setGolsPro(String golspro) {
		this.golspro = golspro;
	}

	public String getGolsContra() {
		return golscontra;
	}

	public void setGc(String golscontra) {
		this.golscontra = golscontra;
	}

	public String getTotalGols() {
		return totalgols;
	}

	public void setTotalGols(String totalgols) {
		this.totalgols = totalgols;
	}

	public String getAproveitamento() {
		return aproveitamento;
	}

	public void setAproveitamento(String aproveitamento) {
		this.aproveitamento = aproveitamento;
	}

	@Override
	public String toString() {
		return "Time: "                   + time 
				+ "\n"
				+ ", Pontos adquiridos: " + pontos
				+ "\n"
				+ ", Jogos: "             + jogos 
				+ "\n"
				+ ", Vitórias: "          + vitorias
				+ "\n"
				+ ", Empates: "           + empates 
				+ "\n"
				+ ", Derrotas: "          + derrotas
				+ "\n"
				+ ", Gols Pró: "          + golspro 
				+ "\n"
				+ ", Gols Contra: "       + golscontra
				+ "\n"
				+ ", Total Gols: " 	      + totalgols
				+ "\n"
				+ ", Aproveitamento="     + aproveitamento 
				+ "\n";
	}

}
