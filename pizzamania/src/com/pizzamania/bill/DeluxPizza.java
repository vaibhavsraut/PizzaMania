package com.pizzamania.bill;

import java.util.Scanner;

public class DeluxPizza {
	
	protected int totalPrice = 0;	
	protected boolean veg;
	
	protected int basePizzaPrice = 0;
	protected int packagingPrice = 20;
	
	protected boolean isVegPizza = false;
	protected boolean isNonVegPizza = false;
	protected boolean isTakeAway = false;
	
	DeluxPizza(boolean veg){
		this.veg = veg;
		if(veg) {
			basePizzaPrice = 550;
		}else {
			basePizzaPrice = 650;
		}
		
		totalPrice += basePizzaPrice;
	}
	
	
	
	Scanner scanner = new Scanner(System.in);

	public void takeAway() {
		System.out.println();
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
		
		if(isTakeAway) {
			System.out.println("Packaging Charges: " + packagingPrice);
		}
		
	
		System.out.println("---------------------------");
		System.out.println("Total Amount: " + totalPrice);
		
		System.out.println();
		System.out.println("Thank You!!! Visit Again...");
		
	}

}
