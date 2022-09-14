package com.hellobank.hellobank.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.time.ZonedDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.hellobank.hellobank.model.Transacao;



@SpringBootTest
class TransacaoTest {
	
	@Test
	void validarPorpiedadesTransacao() {
		var transacao = new Transacao();
		LocalDate dt = LocalDate.from(ZonedDateTime.now());
		transacao.setDataTransacao(dt);

		transacao.setValor(100.00);
		//assertequal é uma função que faz uma validacao sobre um dado
		;
		assertEquals(dt , transacao.getDataTransacao());
		assertEquals(100.00, transacao.getValor());
		
		
	}

	
}