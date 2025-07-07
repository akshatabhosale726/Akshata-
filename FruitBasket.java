
package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of basket: ");
		int size = sc.nextInt();
		Fruit[] basket = new Fruit[size];
		int counter = 0;

		while (true) {
			System.out.println("\n0.Exit\n1.Add Mango\n2.Add Orange\n3.Add Apple\n4.Display fruit names"
					+ "\n5.Display details of fresh fruits\n6.Mark fruit as stale\n7.Display taste of stale fruits");
			System.out.print("Enter choice: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 0:
				System.out.println("Exiting...");
				return;
			case 1: // Add Mango
				if (counter < basket.length) {
					System.out.print("Enter name, weight, color: ");
					String name = sc.next();
					double weight = sc.nextDouble();
					String color = sc.next();
					basket[counter++] = new Mango(name, color, weight);
					System.out.println("Mango added.");
				} else
					System.out.println("Basket full!");
				break;
			case 2: // Add Orange
				if (counter < basket.length) {
					System.out.print("Enter name, weight, color: ");
					String name = sc.next();
					double weight = sc.nextDouble();
					String color = sc.next();
					basket[counter++] = new Orange(name, color, weight);
					System.out.println("Orange added.");
				} else
					System.out.println("Basket full!");
				break;
			case 3: // Add Apple
				if (counter < basket.length) {
					System.out.print("Enter name, weight, color: ");
					String name = sc.next();
					double weight = sc.nextDouble();
					String color = sc.next();
					basket[counter++] = new Apple(name, color, weight);
					System.out.println("Apple added.");
				} else
					System.out.println("Basket full!");
				break;
			case 4: // Display names
				System.out.println("Names of fruits:");
				for (Fruit f : basket)
					if (f != null)
						System.out.println(f.getName());
				break;
			case 5: // Fresh fruit details
				for (Fruit f : basket)
					if (f != null && f.isFresh())
						System.out.println(f + ", Taste: " + f.taste());
				break;
			case 6: // Mark stale
				System.out.print("Enter index to mark as stale: ");
				int idx = sc.nextInt();
				if (idx >= 0 && idx < counter && basket[idx] != null) {
					basket[idx].setFresh(false);
					System.out.println("Marked as stale.");
				} else
					System.out.println("Invalid index!");
				break;
			case 7: // Taste of stale fruits
				for (Fruit f : basket)
					if (f != null && !f.isFresh())
						System.out.println(f.getName() + " taste: " + f.taste());
				break;
			default:
				System.out.println("Invalid choice!");
			}
		}
	}
}
