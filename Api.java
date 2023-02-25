import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.List;

public class Api {

    private static String getJSon(String url,String arg)
    {
        String result="";
        String urlToCall = url+arg;
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(urlToCall).build();
        try (Response response = client.newCall(request).execute()) {
            if (response.isSuccessful() && response.body() != null) {
                String responseString=response.body().string();
                //System.out.println(responseString);
                result = responseString;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
            return "Error!";
        }
        return result;
    }
    public static List<Meal> findMeal(String findThisMeal)
    {
        String result = Api.getJSon("https://www.themealdb.com/api/json/v1/1/search.php?s=",findThisMeal);

        Gson gson = new Gson();
        Data data = gson.fromJson(result, Data.class);
        List<Meal> m = data.getMeals();
        return m;
    }
    public static List<MealCategory> findMealsCategories(){
        String result = Api.getJSon("https://www.themealdb.com/api/json/v1/1/categories.php","");

        Gson gson = new Gson();
        Data data = gson.fromJson(result, Data.class);
        List<MealCategory> categories = data.getCategories();
        return categories;
    }
    public static List<MealByCategory> findMealsByCategory(String category)
    {
        String result = Api.getJSon("https://www.themealdb.com/api/json/v1/1/filter.php?c=",category);

        Gson gson = new Gson();
        Data data = gson.fromJson(result, Data.class);
        List<MealByCategory> meals = data.getMealsByCategory();

        return meals;
    }
}


