package it.vincenzopicone.be.godfather.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import it.vincenzopicone.be.godfather.model.Drink;
import it.vincenzopicone.be.godfather.model.DrinkLemonade;
import it.vincenzopicone.be.godfather.model.Franchise;
import it.vincenzopicone.be.godfather.model.FranchiseMug;
import it.vincenzopicone.be.godfather.model.Menu;
import it.vincenzopicone.be.godfather.model.Pizza;
import it.vincenzopicone.be.godfather.model.PizzaFamilySize;
import it.vincenzopicone.be.godfather.model.PizzaHawaiian;
import it.vincenzopicone.be.godfather.model.PizzaMargherita;
import it.vincenzopicone.be.godfather.model.PizzaSalami;
import it.vincenzopicone.be.godfather.model.ToppingCheese;
import it.vincenzopicone.be.godfather.model.ToppingHam;

@Configuration
public class MenuConfig {

	@Bean
	public Menu menu() {

		Menu menu = new Menu();

		menu.getMenuPizza().add(pizzaMargherita());
		menu.getMenuPizza().add(pizzaHawaiian());
		menu.getMenuPizza().add(pizzaSalami());

		menu.getMenuTopping().add(new ToppingCheese(null));
		menu.getMenuTopping().add(new ToppingHam(null));


		menu.getMenuDrink().add(drinkLemonade());
		
		

		return menu;

	}

	@Bean
	public PizzaMargherita pizzaMargherita() {
		return new PizzaMargherita();
	}

	@Bean
	public PizzaHawaiian pizzaHawaiian() {
		return new PizzaHawaiian();
	}

	@Bean
	public PizzaSalami pizzaSalami() {
		return new PizzaSalami();
	}

	@Bean
	public Drink drinkLemonade() {
		return new DrinkLemonade();
	}
	
	@Bean
	public Franchise franchiseMug() {
		return new FranchiseMug();
	}
}
