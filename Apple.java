package com.app.fruits;

public class Apple extends Fruit {
	public Apple(String name, String color, double weight) {
		super(name, color, weight, true);
	}
	@Override
	public String taste() {
		return "sweet n sour";
	}
}
