package com.pizzamania.bill;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("************************************WELCOME TO PIZZAMANIA************************************");
		
		System.out.println("1.Veg Pizza");
		System.out.println("2.Non-Veg Pizza");
		System.out.println("3.Delux Veg Pizza");
		System.out.println("4.Delux Non-Veg Pizza");
		
		System.out.print("Select your pizza:");
		
		try (Scanner scanner = new Scanner(System.in)) {
			int choice = scanner.nextInt();
			
			switch(choice) {
			case 1:
				Pizza vegPizza = new Pizza(true);
				vegPizza.addExtraToppings();
				vegPizza.addExtraCheese();
				vegPizza.takeAway();
				vegPizza.getBill();
				
				break;
				
			case 2:
				
				Pizza nonVegPizza = new Pizza(false);
				nonVegPizza.addExtraToppings();
				nonVegPizza.addExtraCheese();
				nonVegPizza.takeAway();
				nonVegPizza.getBill();
				
				break;
				
			case 3:
				
				DeluxPizza deluxVegPizza = new DeluxPizza(true);
				deluxVegPizza.takeAway();
				deluxVegPizza.getBill();
				
				break;
				
			case 4:
				
				DeluxPizza deluxNonVegPizza = new DeluxPizza(false);
				deluxNonVegPizza.takeAway();
				deluxNonVegPizza.getBill();
				
				break;
				
			default:
				
				System.out.println("Invalid Choice!!!");
				
				
			}
		}
	}

}
