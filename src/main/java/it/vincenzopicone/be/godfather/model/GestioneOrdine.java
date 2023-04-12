package it.vincenzopicone.be.godfather.model;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class GestioneOrdine {
	
	@Bean
	@Scope("prototype")
	public Ordine nuovoOrdine1() {
		return new Ordine();
	}

}
