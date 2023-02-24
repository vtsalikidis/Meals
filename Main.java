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
        String result = Api.findMeal("Saganaki");
        System.out.println(result);
        result= Api.findMealsCategories();
        System.out.println(result);
        result = Api.findMealsByCategory("Seaffod");
    }


}