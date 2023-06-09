package it.vincenzopicone.be.godfather.model;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@PropertySource("classpath:application.properties")
public class Ordine {
	
	private int numeroOrdine;
	private Double coperto = 1d;
	private StatoOrdine statoOrdine;
	private List<MenuItem> listaOrdine;
	private Double totaleCoperti;
	private Tavolo tavolo;
	private LocalTime oraOrdine;
	private String nota;
	private Double totaleOrdine;
	
}
