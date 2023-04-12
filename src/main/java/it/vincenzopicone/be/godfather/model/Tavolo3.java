package it.vincenzopicone.be.godfather.model;

public class Tavolo3 extends Tavolo {
	public Tavolo3() {
		super(3, 10, StatoTavolo.LIBERO);
		this.setStatoTavolo(StatoTavolo.OCCUPATO);
	}
	
}