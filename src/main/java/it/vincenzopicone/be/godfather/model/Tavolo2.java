package it.vincenzopicone.be.godfather.model;

public class Tavolo2 extends Tavolo {
	public Tavolo2() {
		super(2, 8, StatoTavolo.LIBERO);
		this.setStatoTavolo(StatoTavolo.OCCUPATO);
	}
	
}
