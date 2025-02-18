package com.personalizedmealplangenerator;

// Vegan Meal Plan
public class VeganMeal implements MealPlan {
    @Override
    public void displayMealDetails() {
        System.out.println("Vegan Meal: No animal products, entirely plant-based.");
    }
}
