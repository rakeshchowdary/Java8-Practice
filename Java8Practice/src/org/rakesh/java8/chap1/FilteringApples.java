package org.rakesh.java8.chap1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilteringApples {

	public static void main(String args[]) {
		FilteringApples mainInstance = new FilteringApples();
		List<Apple> inventory = Arrays.asList(mainInstance.new Apple(80, "green"), mainInstance.new Apple(155, "green"),
				mainInstance.new Apple(120, "red"));
		List<Apple> greenApples = filterGreenApples(inventory, FilteringApples::isGreenApple);
		System.out.println(greenApples);
		List<Apple> heavyApple = filterGreenApples(inventory, FilteringApples::isHeavyApple);
		System.out.println(heavyApple);
		List<Apple> greenApple2 = filterGreenApples(inventory, (Apple a) -> "green".equals(a.getColour()));
		System.out.println(greenApple2);
		List<Apple> heavyWeightApple = filterGreenApples(inventory, (Apple a) -> a.getWeight() > 150);
		System.out.println(heavyWeightApple);
	}

	public static List<Apple> filteringGreenApple(List<Apple> inventory) {
		List<Apple> result = new ArrayList<FilteringApples.Apple>();
		for (Apple a : inventory) {
			if ("Green".equals(a.getColour())) {
				result.add(a);
			}
		}
		return result;
	}

	public static List<Apple> filteringHeavyWeightApple(List<Apple> inventory) {
		List<Apple> result = new ArrayList<>();
		for (Apple a : inventory) {
			if (a.getWeight() > 150) {
				result.add(a);
			}
		}
		return result;

	}

	public static boolean isGreenApple(Apple apple) {
		return "Green".equals(apple.getColour());
	}

	public static boolean isHeavyApple(Apple a) {
		return a.getWeight() > 150;
	}

	public static List<Apple> filterGreenApples(List<Apple> inventory, Predicate<Apple> p) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (p.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}

	public class Apple {
		private int weight = 0;
		private String colour = "";

		@Override
		public String toString() {
			return "Apple [weight=" + weight + ", colour=" + colour + "]";
		}

		public int getWeight() {
			return weight;
		}

		public void setWeight(int weight) {
			this.weight = weight;
		}

		public String getColour() {
			return colour;
		}

		public void setColor(String colour) {
			this.colour = colour;
		}

		public Apple(int weight, String colour) {
			this.weight = weight;
			this.colour = colour;

		}

	}

}
