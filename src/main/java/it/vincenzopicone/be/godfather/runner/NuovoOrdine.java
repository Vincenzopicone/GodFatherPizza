package it.vincenzopicone.be.godfather.runner;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import it.vincenzopicone.be.godfather.model.*;
@Component
public class NuovoOrdine implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		creaNuovoOrdine();
	}
	public static void creaNuovoOrdine () {
		
		System.out.println("Avviato nuovo ordine");

		AnnotationConfigApplicationContext appContext = 
				new AnnotationConfigApplicationContext(GestioneOrdine.class);
		
		Ordine O1 = (Ordine) appContext.getBean("nuovoOrdine1");
		List<MenuItem> ordine1 = new ArrayList<>();
		ordine1.add(new PizzaMargherita());
		ordine1.add(new PizzaHawaiian());
		ordine1.add(new PizzaMargherita());
		ordine1.add(new PizzaHawaiian());
		ordine1.add(new DrinkLemonade());
		ordine1.add(new DrinkLemonade());
		ordine1.add(new FranchiseMug());
		ordine1.add(new DrinkLemonade());
		O1.setStatoOrdine(StatoOrdine.IN_CORSO);
		O1.setNumeroOrdine(1);
		O1.setOraOrdine(LocalTime.of(12, 55));
		O1.setTotaleCoperti(4);
		O1.setNota("Una margherita senza mozzarella");
		O1.setListaOrdine(ordine1);
		O1.setTavolo(new Tavolo1());
		O1.setTotaleOrdine(calcolaConto(ordine1));
		System.out.println("Numero ordine: " + O1.getNumeroOrdine());
		System.out.println("Ora ordine: " + O1.getOraOrdine());
		System.out.println("Note: " + O1.getNota());
		System.out.println("Stato ordine: " + O1.getStatoOrdine());
		System.out.println("Tavolo n°: " + O1.getTavolo().getNumeroTavolo());
		System.out.println("MaxCoperti n°: " + O1.getTavolo().getNumeroCopertiMax());
		System.out.println("Stato tavolo: " + O1.getTavolo().getStatoTavolo());
		System.out.println("Riepilogo ordine: ");
		riepilogoOrdine(ordine1);
		Comande.tuttiGliOrdini.add(O1);
		
		System.out.println(O1.getTotaleOrdine());
		appContext.close();
	}
	
	public static void riepilogoOrdine (List<MenuItem> ordine) {
		    ordine.stream().forEach(x -> System.out.println(x.getPrice() + " €" + " " + x.getName()));
	}
	
	public static Double calcolaConto (List<MenuItem> ordine) {
		Double conto = 0d;
		ordine.stream().map(x->x.getPrice());
		
		return conto;
	}
	
	

}
