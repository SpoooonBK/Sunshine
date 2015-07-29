package nyc.esteban.sunshine;


import android.text.format.Time;
import android.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;


/**
 * Created by Spoooon on 7/4/2015.
 */
public class WeatherDataParser {


    private static final String LOG_TAG ="sunshine" ;

    public static double getMaxTemperatureForDay(String weatherJsonStr, int dayIndex) throws JSONException{


        JSONObject jsonObject = new JSONObject(weatherJsonStr);
        JSONArray jsonArray = jsonObject.getJSONArray("list");
        jsonObject = jsonArray.getJSONObject(dayIndex);
        jsonObject = jsonObject.getJSONObject("temp");
        return jsonObject.getDouble("max");
    }

}
