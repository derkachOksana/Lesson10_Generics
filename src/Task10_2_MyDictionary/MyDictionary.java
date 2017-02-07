package Task10_2_MyDictionary;

import java.util.*;

/**
 * Created by lion on 07.02.17.
 */
public class MyDictionary<TKey, TValue> {
    private Map<TKey, TValue> map;

   public MyDictionary(){
       map = new HashMap<TKey, TValue>();
   }
   public void put(TKey key, TValue value){
       map.put(key, value);

   }
   public TValue get(TKey key){
       return map.get(key);
   }

   public int size(){
       return map.size();
   }
   public void getMyDictionary(){
       Set<Map.Entry<TKey, TValue>> set = map.entrySet();
       for(Map.Entry<TKey, TValue> temp: set){
           System.out.println(temp.getKey() + ": " + temp.getValue());
       }

   }
}
