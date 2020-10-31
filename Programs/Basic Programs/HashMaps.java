import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args){

        // HashMaps doesn't allows duplicate key value pairs 
        // It allows key key to be null but only once 

        // we can also write Map<X,Y> = new HashMap<X,Y>();

        HashMap<String,Integer> hmap = new HashMap<String,Integer>();

        hmap.put("India", 1);
        hmap.put("Karnataka", 2);
        hmap.put("Shimoga", 3);
        hmap.put("India", 3); // replaces India 's with value with 3'

        System.out.println("HashMap is " + hmap + " size = " + hmap.size());

        // put(key, value);



        // methods 

        // containsKey(O key); 
        // containsValue(O key);  -- returns true or false 

        System.out.println("hmap has Shimoga " + hmap.containsKey("Shimoga"));
        System.out.println("hmap has value 4 " + hmap.containsValue(4));

        // isEmpty()

        // entrySet() - returns the set view 
        System.out.println("Entryset = " + hmap.entrySet());

        // get(E e) ;  get value of the key , returns null after
        System.out.println("Tha value of key = India is " + hmap.get("India"));

        // keySet(); - returns the set view of keys 
        System.out.println("set view of keys keySet  " + hmap.keySet());

        // remove(O o)
        hmap.remove("India");
        System.out.println("India removed " + hmap);

        hmap.put("India", 1);

        // values() - returns a collection of keys 
        System.out.println("Values " + hmap.values());

        // putIfAbsent(Key, Value); - if they key is not present inserts , otherwise returns the current value
        System.out.println("Trying inserting repeated key using putIfAbsent " + hmap.putIfAbsent("India", 2) +  " " + hmap);

        // getOrDefault(Key K, V Defaultvalue); 
        System.out.println("Using getordefualt " + hmap.getOrDefault("Shimoga2", 4));

    }
}