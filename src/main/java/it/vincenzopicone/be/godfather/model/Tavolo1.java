package it.vincenzopicone.be.godfather.model;

public class Tavolo1 extends Tavolo {
	public Tavolo1() {
		super(1, 6, StatoTavolo.LIBERO);
		this.setStatoTavolo(StatoTavolo.OCCUPATO);
	}

}
