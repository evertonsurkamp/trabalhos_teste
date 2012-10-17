package com.andre.selenium.telas.brasileirao;

import java.util.ArrayList;

import org.apache.bcel.generic.RETURN;

import com.andre.selenium.SeleniumWebDriver;

public class TelaTabelaBrasileirao {

	private SeleniumWebDriver selenium;
	private static final String URL = "http://esporte.uol.com.br/futebol/campeonatos/brasileiro/2012/serie-a/classificacao/classificacao.htm";

	public TelaTabelaBrasileirao(SeleniumWebDriver selenium) {
		this.selenium = selenium;
	}

	public void abrir() {
		selenium.driver.get(URL);
		selenium.assertTitle("Classificação do Campeonato Brasileiro 2012 de Futebol - UOL Esporte");
	}

	public ArrayList<Times> getEstatisticasTimeLibertadores() {
		ArrayList<Times> times = new ArrayList<>();
		Times t;
		for (int i = 1; i <= 20; i++) {
			t = new Times();
			t.setTime(selenium.getTextTableCell("classificationTable", i, 1));
			t.setPg(selenium.getTextTableCell("classificationTable", i, 2));
			t.setJ(selenium.getTextTableCell("classificationTable", i, 3));
			t.setV(selenium.getTextTableCell("classificationTable", i, 4));
			t.setE(selenium.getTextTableCell("classificationTable", i, 5));
			t.setD(selenium.getTextTableCell("classificationTable", i, 6));
			t.setGp(selenium.getTextTableCell("classificationTable", i, 7));
			t.setGc(selenium.getTextTableCell("classificationTable", i, 8));
			t.setSg(selenium.getTextTableCell("classificationTable", i, 9));
			t.setAproveitamento(selenium.getTextTableCell(
					"classificationTable", i, 10));
			times.add(t);
		}
		return times;
	}

}
