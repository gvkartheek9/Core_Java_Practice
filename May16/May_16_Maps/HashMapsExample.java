package May_16_Maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapsExample {
    public static void main(String[] args){
        Map<String,Integer> map=new HashMap<>();
        //to add elements to the map
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        System.out.println(map);//{a=1, b=2, c=3}

        // to traverse with the help of keys
        for(String key: map.keySet()){
            System.out.println("The value for the key "+key+" is "+map.get(key));
            //The value for the key a is 1
            //The value for the key b is 2
            //The value for the key c is 3
        }

        //traverse when we have access to key and the value

         for(Map.Entry<String,Integer> entry: map.entrySet()){
             System.out.println("The key is: "+entry.getKey()+" the value is: "+entry.getValue());
             //The key is: a the value is: 1
             //The key is: b the value is: 2
             //The key is: c the value is: 3
         }

         //to remove an entry from a map
//        System.out.println(map.remove("d"));//here it will provide the 1 for success and null for false
//        System.out.println(map.remove("a",1));//gives us false if there iis no entry
//        System.out.println(map);//{b=2, c=3}

        //check wheather the given value is present or not
        if(map.containsKey("a")){
            System.out.println("The key a value is "+map.get("a"));
        }

    }
}
