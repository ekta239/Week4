package com.personalizedmealplangenerator;

// Generic Meal class that works with different meal plans
public class Meal<T extends MealPlan> {
    private T mealPlan;

    public Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    // Method to display meal plan details
    public void displayMealPlan() {
        mealPlan.displayMealDetails();
    }

    // Generic method to validate and generate a personalized meal plan dynamically
    public static <T extends MealPlan> void generateMealPlan(T mealPlan) {
        if (mealPlan != null) {
            System.out.println("Meal Plan Generated:");
            mealPlan.displayMealDetails();
        } else {
            System.out.println("Invalid Meal Plan. Please choose a valid category.");
        }
    }
}
