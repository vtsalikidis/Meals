import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println("another hello!!");


        ///TEST API
        // FIND MEAL
//        List<Meal> result = Api.findMeal("Saganaki");
//        System.out.println("Όνομα γεύματος = "+result.get(0).strMeal);
//        System.out.println("Κατηγορία γεύματος = "+result.get(0).strCategory);
//        System.out.println("Περιοχή = "+result.get(0).strArea);
//        System.out.println("Οδηγίες = "+result.get(0).strInstructions);

        //MEAL CATEGORIES
//        List<Category> result= Api.findMealsCategories();
//        for(int i = 0; i < result.size(); i++) {
//            System.out.println("Id = "+result.get(i).idCategory);
//            System.out.println("Όνομα κατηγορίας = "+result.get(i).strCategory);
//            System.out.println("Εικόνα κατηγορίας = "+result.get(i).strCategoryThumb);
//            System.out.println("Περιγραφή κατηγορίας = "+result.get(i).strCategoryDescription);
//        }
        //MEAL BY CATEGORY TEST
//        List<MealByCategory> result= Api.findMealsByCategory("Seafood");
//        for(int i = 0; i < result.size(); i++) {
//            System.out.println("Id = "+result.get(i).idMeal);
//            System.out.println("Όνομα γεύματος = "+result.get(i).strMeal);
//            System.out.println("Εικόνα γεύματος = "+result.get(i).strMealThumb);
//        }

    }


}