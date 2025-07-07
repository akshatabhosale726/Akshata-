package com.app.fruits;

public class Mango extends Fruit {
	public Mango(String name, String color, double weight) {
		super(name, color, weight, true);
	}
	@Override
	public String taste() {
		return "sweet";
	}
}

