package Parser;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JSONParser {

    public static void parseJSON(String jsonString){

        try{

            JSONObject jsonObject = new JSONObject(jsonString);
            if (jsonObject.has("a")) {

                int a = jsonObject.getInt("a");
                System.out.println("The object contains field with value "
                        + a);
            }

        } catch(JSONException e) {
            System.out.println("Exception in JSON parsing: " + e.getMessage());
        }

    }
    

}
