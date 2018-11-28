import java.util.Iterator;
import java.util.TreeSet;
public class TreeSetTest {
    public static void main(String[] args){
        TreeSet<String> treeSet = new TreeSet<>();
        TreeSet<String> treeSet2 = new TreeSet<>();

        treeSet.add("aaa");
        treeSet.add("bbb");
        treeSet.add("ccc");
        treeSet.add("fff");
        treeSet.add("eee");

        treeSet2.add("rrr");
        treeSet2.add("ggg");

        treeSet.addAll(treeSet2);
        System.out.println(treeSet.size());

        System.out.println(treeSet.floor("ggf"));//小于等于的最大元素
        System.out.println(treeSet.lower("ggg"));//小于的最大元素
        System.out.println(treeSet.ceiling("ggf"));//大于等于的最小元素
        System.out.println(treeSet.higher("ggg"));//大于的最小元素

        treeSet2 = (TreeSet<String>) treeSet.subSet("bbb","ggg");
        System.out.println("现在的treeset2"+treeSet2);


        treeSet.remove("aaa");
        System.out.println(treeSet);

        String[] arr = (String[])treeSet.toArray(new String[0]);
        System.out.println(arr.length);
        for (String str:arr)
            System.out.print(str+" ");

        System.out.println(treeSet.pollFirst());//删除并返回第一个元素
        System.out.println(treeSet.pollLast());//删除并返回最后的元素
        System.out.println(treeSet);

        for(Iterator iter = treeSet.iterator(); iter.hasNext(); ) {
            System.out.println(iter.next());        //遍历
        }


        treeSet.clear();
        System.out.println(treeSet.isEmpty());



    }
}
