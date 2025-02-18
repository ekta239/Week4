package com.personalizedmealplangenerator;

public class Main {

    public static void main(String[] args) {
        // Create instances of different meal plans
        Meal<VegetarianMeal> vegetarianMeal = new Meal<>(new VegetarianMeal());
        Meal<VeganMeal> veganMeal = new Meal<>(new VeganMeal());
        Meal<KetoMeal> ketoMeal = new Meal<>(new KetoMeal());
        Meal<HighProteinMeal> highProteinMeal = new Meal<>(new HighProteinMeal());

        // Generate meal plans using the generic method
        System.out.println("Generating Vegetarian Meal Plan:");
        Meal.generateMealPlan(new VegetarianMeal());
        System.out.println();

        System.out.println("Generating Vegan Meal Plan:");
        Meal.generateMealPlan(new VeganMeal());
        System.out.println();

        System.out.println("Generating Keto Meal Plan:");
        Meal.generateMealPlan(new KetoMeal());
        System.out.println();

        System.out.println("Generating High-Protein Meal Plan:");
        Meal.generateMealPlan(new HighProteinMeal());
        System.out.println();
    }
}
