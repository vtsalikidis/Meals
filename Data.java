import java.util.List;

public class Data {
    //-fields
    private List<Meal> meals;
    private List<MealCategory> categories;
    private List<MealByCategory> mealsByCategory;
    // +getters/setters
    public List<MealCategory> getCategories() {
        return categories;
    }
    public List<MealByCategory> getMealsByCategory() { return mealsByCategory;    }
    public List<Meal> getMeals() { return meals;    }

}