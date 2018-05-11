package org.java8.rakesh;

import java.util.ArrayList;
import java.util.List;

interface Predicate<T> {
	boolean test(T t);
}

public class Apple {
	public List<Apple> inventory;

	public String getColour() {

		return null;

	}

	public int getWeight() {
		return 0;
	}

	public static List<Apple> getGreenApples(List<Apple> inventory) {
		List<Apple> greenAppleList = new ArrayList<>();
		for (Apple a : inventory) {
			if ("green".equals(a.getColour())) {
				greenAppleList.add(a);
			}
		}
		return greenAppleList;
	}

	public static boolean isGreenApple(Apple apple) {
		return "green".equals(apple.getColour());
	}

	public boolean isHeavyApple(Apple apple) {
		return apple.getWeight() > 150;
	}

	static List<Apple> filterApples(List<Apple> inventory, Predicate p) {
		List<Apple> result = new ArrayList<>();
		for (Apple a : inventory) {
			if (p.test(a)) {
				result.add(a);
			}
		}

		return result;
	}
	
	

}
