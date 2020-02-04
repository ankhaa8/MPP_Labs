package Lab9.prob9;

import java.util.*;

public class Dish {

	private final String name;
	private final boolean vegetarian;
	private final int calories;
	private final Type type;

	public Dish(String name, boolean vegetarian, int calories, Type type) {
		this.name = name;
		this.vegetarian = vegetarian;
		this.calories = calories;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public int getCalories() {
		return calories;
	}

	public Type getType() {
		return type;
	}

	public enum Type {
		MEAT, FISH, OTHER
	}

	@Override
	public String toString() {
		return name;
	}

	public static final List<Dish> menu = Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
			new Dish("beef", false, 700, Dish.Type.MEAT), new Dish("chicken", false, 400, Dish.Type.MEAT),
			new Dish("french fries", true, 530, Dish.Type.OTHER), new Dish("rice", true, 350, Dish.Type.OTHER),
			new Dish("season fruit", true, 120, Dish.Type.OTHER), new Dish("pizza", true, 550, Dish.Type.OTHER),
			new Dish("prawns", false, 400, Dish.Type.FISH), new Dish("salmon", false, 450, Dish.Type.FISH));

	private static boolean isVegetarianMealAvailable() {
		return menu.stream().anyMatch(Dish::isVegetarian);
	}

	private static boolean isHealthyMenuLess1000() {
		return menu.stream().allMatch(d -> d.getCalories() < 1000);
	}

	private static boolean isUnHealthyMenuGreater1000() {
		return menu.stream().noneMatch(d -> d.getCalories() >= 1000);
	}

	private static Optional<Dish> findNonVegetarianDish() {
		return menu.stream().filter(d -> d.getType() == Dish.Type.MEAT).findFirst();
	}

	private static int calculateTotalCalories() {
		return menu.stream().map(Dish::getCalories).reduce(0,(Integer i, Integer j) -> i + j);
	}

	private static int calculateTotalCaloriesMethodReference() {
		return menu.stream().map(Dish::getCalories).reduce(0, Integer::sum);
	}

	public static void main(String[] args) {
		
		System.out.println("Is Vegetarian Meal available ?" + isVegetarianMealAvailable());
	

		System.out.println("Healthy menu, less than 1000:" + isHealthyMenuLess1000());
		System.out.println("UnHealthy menu, greater than 1000:"+ !isUnHealthyMenuGreater1000());

		Optional<Dish> dish = findNonVegetarianDish();
		dish.ifPresent(d -> System.out.println(d.getName()));

		System.out.println("Total calories in menu: " + calculateTotalCalories());
		System.out.println("Total calories in menu (MethodReferences): " + calculateTotalCaloriesMethodReference());
		
	}
}