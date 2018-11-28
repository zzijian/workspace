import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapTest {
public static void main(String[] args){
    Map<String,Integer> treeMap = new TreeMap<>();
    treeMap.put("aaa",111);
    treeMap.put("bbb",141);
    treeMap.put("ccc",115);
    treeMap.put("ddd",211);
    treeMap.put("ggg",141);
    treeMap.put("fff",131);
    treeMap.put("eee",112);

    System.out.println(treeMap);
    // floor higher lower
    System.out.println(((TreeMap<String, Integer>) treeMap).ceilingEntry("bbc"));//Returns the least key-value greater than or equal to the given key, or null if there is no such key
    System.out.println(((TreeMap<String, Integer>) treeMap).ceilingKey("bbc"));//Returns the least key greater than or equal to the given key, or null if there is no such key

    System.out.println(treeMap.containsKey("bbb")+" "+treeMap.containsValue("131"));//containKey() containValue()
    System.out.println(treeMap.entrySet()+" "+treeMap.size()+" "+treeMap.keySet()+" "+treeMap.values());
    System.out.println(treeMap.get("ccc"));//get(K key)
    System.out.println(((TreeMap<String, Integer>) treeMap).firstKey()+" "+((TreeMap<String, Integer>) treeMap).firstEntry());//lastKey() lastEntry()

    System.out.println(((TreeMap<String, Integer>) treeMap).headMap("fff"));//Returns a view of the portion of this map whose keys are strictly less than toKey


    treeMap.remove("aaa");
    System.out.println(((TreeMap<String, Integer>) treeMap).pollFirstEntry()+" "+((TreeMap<String, Integer>) treeMap).pollLastEntry());//poll :Removes and returns


    System.out.println(treeMap.size());

    treeMap = ((TreeMap<String, Integer>) treeMap).subMap("aaa","zzz");
    System.out.println(treeMap);

    System.out.println(((SortedMap<String, Integer>) treeMap).tailMap("eee"));//Returns a view of the portion of this map whose keys are greater than or equal to fromKey

    treeMap.clear();


}

}
