package it.vincenzopicone.be.godfather.model;

public class Tavolo4 extends Tavolo {
	public Tavolo4() {
		super(4, 4, StatoTavolo.LIBERO);
		this.setStatoTavolo(StatoTavolo.OCCUPATO);
	}
	
}