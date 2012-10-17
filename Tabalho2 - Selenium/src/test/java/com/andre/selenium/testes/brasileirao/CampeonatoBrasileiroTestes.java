package com.andre.selenium.testes.brasileirao;

import java.util.ArrayList;
import java.util.Arrays;

import net.sf.cglib.core.ClassInfo;

import org.apache.bcel.generic.ClassObserver;
import org.junit.Before;
import org.junit.Test;

import com.andre.selenium.SeleniumTeste;
import com.andre.selenium.SeleniumWebDriver;
import com.andre.selenium.telas.brasileirao.TelaTabelaBrasileirao;
import com.andre.selenium.telas.brasileirao.Times;
import com.andre.selenium.telas.cotacao.TelaCotacoesUOL;

public class CampeonatoBrasileiroTestes extends SeleniumTeste {

	TelaTabelaBrasileirao telaCampeonato;
	SeleniumWebDriver selenium;

	@Before
	public void prepararClassificacao() {
		this.selenium = new SeleniumWebDriver(driver);
		this.telaCampeonato = new TelaTabelaBrasileirao(selenium);
		this.telaCampeonato.abrir();
	}

	@Test
	public void testarClassificadosLibertadores() {
		ArrayList classificados = telaCampeonato
				.getEstatisticasTimeLibertadores();
		for (int i = 0; i < classificados.size(); i++) {
			System.out.println(classificados.get(i));
		}

		consultas();
	}

	private void consultas() {
		ArrayList classificados = telaCampeonato
				.getEstatisticasTimeLibertadores();
		for (int i = 0; i < classificados.size(); i++) {
			Times t = (Times) classificados.get(i);
			if (t.getTime().toLowerCase().endsWith("palmeiras")) {
				System.out
						.println("Classificação do time: " + (i + 1) + "°\n");
				if (i > 15) {
					System.out.println("O time será rebaixado a série B\n");
				}
			}
			if (i >= 16) {
				System.out.println("Clube rebaixado para série B:\n"
						+ classificados.get(i));
			}
		}
	}
}
