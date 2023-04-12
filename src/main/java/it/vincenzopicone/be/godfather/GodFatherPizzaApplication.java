package it.vincenzopicone.be.godfather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import it.vincenzopicone.be.godfather.runner.NuovoOrdine;

@SpringBootApplication
public class GodFatherPizzaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GodFatherPizzaApplication.class, args);

//		GestioneMenu stampa = new GestioneMenu();
//		stampa.stampaMenu();
//		stampa.testTopping();

	}

}
