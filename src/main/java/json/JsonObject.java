package json;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Andrii_Rodionov on 1/3/2017.
 */
public class JsonObject extends Json {
    private Map<String, Json> jsonPairs;

    String Jsonstr = "";

    public JsonObject(JsonPair... jsonPairs) {
        this.jsonPairs = new HashMap<>();
        for (JsonPair pair : jsonPairs) {
            this.jsonPairs.put(pair.key, pair.value);
        }
    }

    @Override
    public String toJson() {
//        jsonPairs.forEach((k, v) -> Jsonstr = Jsonstr.concat("'"+ k + "': '" +v+"'"));
//        return "{" + Jsonstr + "}";
        if (jsonPairs.size() == 0){
            return "{}";
       }
        for(String key : jsonPairs.keySet()){
            String JsonK = new JsonString(key).toJson();
            String JsonV = jsonPairs.get(key).toJson();
            Jsonstr = Jsonstr.concat(JsonK + ": " + JsonV);
            Jsonstr = Jsonstr.concat(", ");
        }
        Jsonstr += Jsonstr.concat("}");
        return "{"+Jsonstr;
    }

    public void add(JsonPair jsonPair) {
        jsonPairs.put(jsonPair.key, jsonPair.value);
    }

    public Json find(String name) {
        return jsonPairs.get(name);
    }

    public JsonObject projection(String... names) {
        // ToDo
        return null;
    }
}

