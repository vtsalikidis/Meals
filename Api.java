import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

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
    public static String findMeal(String meal)
    {
        String result = Api.getJSon("https://www.themealdb.com/api/json/v1/1/search.php?s=",meal);
        return result;
    }
    public static String findMealsCategories(){
        String result = Api.getJSon("https://www.themealdb.com/api/json/v1/1/categories.php","");
        return result;
    }
    public static String findMealsByCategory(String category)
    {
        String result = Api.getJSon("https://www.themealdb.com/api/json/v1/filter.php?c=",category);
        return result;
    }

}
