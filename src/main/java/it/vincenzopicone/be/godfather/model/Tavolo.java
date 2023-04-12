package it.vincenzopicone.be.godfather.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public abstract class Tavolo {
	
	private int numeroTavolo;
	private int numeroCopertiMax;
	private StatoTavolo statoTavolo;
}
