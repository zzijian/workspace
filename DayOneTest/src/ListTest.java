import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
    public static void main(String[] args){
        List<String> fruits = new ArrayList<String>();
        //isEmpty()
        System.out.println(fruits.isEmpty());

        //add(E e)
        fruits.add("香蕉");
        fruits.add("苹果");
        fruits.add("梨子");
        fruits.add("西瓜");
        //add(int index,E element)
        fruits.add(2,"桃子");

        ShowList(fruits);


        //remove(Object o)
        fruits.remove("桃子");
        //remove(int index)
        fruits.remove(1);

        ShowList(fruits);

        //contains(Object o)
        System.out.println(fruits.contains("香蕉"));


        //set(int index, E element) replace the element
        fruits.set(0,"樱桃");

        ShowList(fruits);

        //	indexOf(Object o) and lastIndexOf(Object o)
        ShowInfo(fruits.indexOf("苹果"));
        fruits.add(2,"樱桃");
        fruits.add(3,"樱桃");
        fruits.add("樱桃");
        ShowList(fruits);
        ShowInfo(fruits.lastIndexOf("樱桃"));

        // subList(int from,int to) 截取
        List<String> littlefruits= fruits.subList(3,5);
        ShowList(littlefruits);

        //equals(Object o)
        // hashCode()
        System.out.println(fruits.hashCode()==littlefruits.hashCode());
        System.out.println(fruits.equals(fruits));

        //遍历List
        System.out.println("返回Iterator集合对象:"+fruits.iterator());
        Iterator it = fruits.iterator();
        while (it.hasNext()){
            String s = (String)it.next();
            System.out.println(s);
        }


        //toString()
        String toString=fruits.toString();
        System.out.println(toString);

        //toArray(T[] a)
        String[] toArray = fruits.toArray(new String[0]);
        ShowInfo(toArray.length);

        fruits.clear();
    }


    public static void ShowList(List list){
        //size() Returns the number of elements in this list.
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));//get(int index)
        }
        System.out.println();
    }

    public static void ShowInfo(int index){
        System.out.println(index);
    }

}