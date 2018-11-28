import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
    public static void main(String[] args){
        Set<String> fruit = new HashSet<String>();
        System.out.println(fruit.isEmpty());

        // add(E e)
        fruit.add("苹果");
        fruit.add("苹果1");
        fruit.add("苹果2");
        fruit.add("苹果3");
        fruit.add("苹果4");
        fruit.add("苹果5");
        fruit.add("苹果6");

        System.out.println(fruit.add("苹果2"));

        //size()
        System.out.println(fruit.size());
        ShowSet(fruit);

        // remove(Object o)
        fruit.remove("苹果4");
        //contains(Object o)
        System.out.println(fruit.contains("苹果4"));


        //toArray
        String[] arr = fruit.toArray(new String[0]);
        for (String str:arr)
            System.out.println(str);

        System.out.println();

        Set<String> defruit = new HashSet<String>();
        defruit.add("苹果1");
        defruit.add("苹果5");
        defruit.add("苹果4");

        //removeAll(Collection<?> c) 删除集合c中有的
        HashSet<String> littlefruit = (HashSet<String>) ((HashSet<String>) fruit).clone();
        littlefruit.removeAll(defruit);
        ShowSet(littlefruit);

        //retainAll(Collection<?> c) 只留下集合c中有的
        HashSet<String> littlefruit2 = (HashSet<String>) ((HashSet<String>) fruit).clone();
        littlefruit2.retainAll(defruit);
        ShowSet(littlefruit2);

        //clear()
        fruit.clear();


    }

    public static void ShowSet(Set set){
        //iterator() Set的遍历1
        for(Iterator iterator = set.iterator(); iterator.hasNext(); )
          System.out.println(iterator.next());

        System.out.println();
    }

    public static void ShowSet2(Set set){
        //Set的遍历2
        for (Object str : set) {
            System.out.println(str);
        }
    }
}
