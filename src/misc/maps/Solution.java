package misc.maps;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    // Object 1: 	{ k1: "v1", k2: "v3" }
    // Object 2:	{ k2: "v2" }
    // Result:		{ k1: "v1", k2: [ "v2", "v3" ] }

    public static HashMap<Object, Object> combineMaps(HashMap<Object, Object> object1,
                                                      HashMap<Object, Object> object2){
        HashMap<Object, Object> combined = new HashMap<>();
        for(Object key : object1.keySet()){
            combined.put(key, object1.get(key));
        }
        for(Object key2 : object2.keySet()){
            addIntoMap(object2, combined, key2);
        }
        return combined;
    }

    public static void addIntoMap(HashMap<Object, Object> addFrom,  HashMap<Object, Object> combined,
                                  Object key){
        if(combined.containsKey(key)){
            ArrayList<Object> valuesToAdd = new ArrayList<>();
            Object currentValue = combined.get(key);
            valuesToAdd.add(currentValue);
            valuesToAdd.add(addFrom.get(key));
            combined.put(key, valuesToAdd);
        }else{
            combined.put(key, addFrom.get(key));
        }
    }

    public static void setUpTestData(){
        HashMap<Object, Object> object1 = new HashMap<>();
        object1.put("k1", "v1");
        object1.put("k2", 3);
        HashMap<Object, Object> object2 = new HashMap<>();
        object2.put("k2", "v2");
        HashMap<Object, Object> combined = combineMaps(object1, object2);
        for(Object key : combined.keySet()){
            System.out.println(key + ":" + combined.get(key));
        }
    }
}
