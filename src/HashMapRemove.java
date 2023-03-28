import com.sun.jdi.Value;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapRemove {
        Map<String,Integer> hashmap = new HashMap<>();
        public void divisibleByFive() {
            hashmap.put("red", 15);
            hashmap.put("yellow", 18);
            hashmap.put("Green", 13);
            hashmap.put("Blue", 20);
            ArrayList<Integer> arr=new ArrayList<>();
            for(Map.Entry maps : hashmap.entrySet()){
                arr.add((Integer) maps.getKey());
            }

            for(int i=0; i < arr.size();i++) {
                if(arr.get(i)%5==0) {
                    hashmap.remove(arr.get(i));
                }
            }
            for(Map.Entry maps : hashmap.entrySet()){
                System.out.println("The key for value " + maps.getValue() + " is " + maps.getKey());
            }
        }

    public static void main(String[] args) {
      HashMapRemove remove = new HashMapRemove();
      remove.divisibleByFive();
    }
}




