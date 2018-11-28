import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class MapTest {
    public static void main(String[] args){
        Map<String,Integer> map = new HashMap<String, Integer>();
        Map<String,Integer> littlemap = new HashMap<String, Integer>();

        //isEmpty()
        System.out.println(map.isEmpty());

        //put(K key, V value)
        map.put("aaa",98);
        map.put("abc",96);
        map.put("acc",98);
        map.put("bas",100);
        map.put("awf",95);
        map.put("aqe",86);

        littlemap.put("qwe",100);
        littlemap.put("ewq",100);

        //putAll(Map<? extends K, ? extends V> map)
        map.putAll(littlemap);

        //size()
        System.out.println(map.size());

        //remove(Object key)
        map.remove("aaa");

        //containsKey(Object key)
        //containsValue(Object value)
        System.out.println(map.containsKey("aaa"));
        System.out.println(map.containsValue(98));

        //get(Object key) return value
        System.out.println(map.get("qwe"));

        //values() keySet() entrySet()
        System.out.println(map.values());
        System.out.println(map.keySet());
        System.out.println(map.entrySet());

        System.out.println();

        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
        while (iter.hasNext()){
            Map.Entry<String,Integer> entry = iter.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
//            map.remove(entry.getKey());
            iter.remove();

        }
        System.out.println(map);

        Map<String,Integer> concurrentHashMap = new ConcurrentHashMap<String, Integer>();
        concurrentHashMap.putAll(map);
        System.out.println(concurrentHashMap);

        Iterator<Map.Entry<String, Integer>> citer = concurrentHashMap.entrySet().iterator();
        while (citer.hasNext()){
            Map.Entry<String,Integer> entry = citer.next();
            concurrentHashMap.remove(entry.getKey());
        }
        System.out.println(concurrentHashMap);




        map.clear();



    }

}
