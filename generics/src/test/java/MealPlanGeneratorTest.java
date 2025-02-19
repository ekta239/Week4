import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.personalizedmealplangenerator.*;

import static org.junit.jupiter.api.Assertions.*;
class MealPlanGeneratorTest {

    private Meal<VegetarianMeal> vegetarianMeal;
    private Meal<VeganMeal> veganMeal;
    private Meal<KetoMeal> ketoMeal;
    private Meal<HighProteinMeal> highProteinMeal;

    @BeforeEach
    void setUp() {
        // Initialize meal objects for testing
        vegetarianMeal = new Meal<>(new VegetarianMeal());
        veganMeal = new Meal<>(new VeganMeal());
        ketoMeal = new Meal<>(new KetoMeal());
        highProteinMeal = new Meal<>(new HighProteinMeal());
    }

    @Test
    void testVegetarianMealGeneration() {
        // Test generating a Vegetarian Meal Plan
        Meal.generateMealPlan(new VegetarianMeal());
        // We don't return values here, but we can check the console output manually if desired.
    }

    @Test
    void testVeganMealGeneration() {
        // Test generating a Vegan Meal Plan
        Meal.generateMealPlan(new VeganMeal());
        // Similarly, check output for Vegan Meal generation
    }

    @Test
    void testKetoMealGeneration() {
        // Test generating a Keto Meal Plan
        Meal.generateMealPlan(new KetoMeal());
    }

    @Test
    void testHighProteinMealGeneration() {
        // Test generating a High-Protein Meal Plan
        Meal.generateMealPlan(new HighProteinMeal());
    }

    @Test
    void testNullMealPlan() {
        // Test with null input, should handle invalid input
        Meal.generateMealPlan(null);
    }
}
