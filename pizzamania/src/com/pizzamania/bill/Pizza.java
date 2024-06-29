package com.pizzamania.bill;

import java.util.Scanner;

public class Pizza {
	protected int totalPrice = 0;	
	protected boolean veg;
	
	protected int basePizzaPrice = 0;
	protected int extraCheesePrice = 100;
	protected int extraToppingsPrice = 150;
	protected int packagingPrice = 20;
	
	protected boolean isVegPizza = false;
	protected boolean isNonVegPizza = false;
	protected boolean isExtraCheese = false;
	protected boolean isExtraToppings = false;
	protected boolean isTakeAway = false;
	
	Pizza(boolean veg){
		this.veg = veg;
		if(veg) {
			isVegPizza = true;
			basePizzaPrice = 300;
		}else {
			isNonVegPizza = true;
			basePizzaPrice = 400;
		}
		
		totalPrice += basePizzaPrice;
	}
	
	Scanner scanner = new Scanner(System.in);
	 
	public void addExtraToppings() {
		System.out.println();
		System.out.println("Do you want extra topings?(y/n)");
		char ch = scanner.next().charAt(0);
		if(ch=='y' || ch == 'Y') {
			isExtraToppings = true;
			totalPrice+=extraToppingsPrice;
		}
	}

	public void addExtraCheese() {
		System.out.println("Do you want extra cheese?(y/n)");
		char ch = scanner.next().charAt(0);
		if(ch=='y' || ch == 'Y') {
			isExtraCheese = true;
			totalPrice+=extraCheesePrice;
		}
		
	}

	public void takeAway() {
		System.out.println("Do you want to take away your order?(y/n)");
		char ch = scanner.next().charAt(0);
		if(ch=='y' || ch == 'Y') {
			isTakeAway = true;
			totalPrice+=packagingPrice;
		}
		
	}

	public void getBill() {
		
		System.out.println();
		System.out.println("Pizza: " + basePizzaPrice);
		if(isExtraToppings) {
			System.out.println("Extra Toppings: " + extraToppingsPrice);
		}
		if(isExtraCheese) {
			System.out.println("Extra Cheese: " + extraCheesePrice);
		}
		if(isTakeAway) {
			System.out.println("Packaging Charges: " + packagingPrice);
		}
		
	
		System.out.println("---------------------------");
		System.out.println("Total Amount: " + totalPrice);
		
		System.out.println();
		System.out.println("Thank You!!! Visit Again...");
		
	}

}
