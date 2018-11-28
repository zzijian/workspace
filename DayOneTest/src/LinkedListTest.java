import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    public static void main(String[] args){
        List<String> llist = new LinkedList<String>();
        List<String> llist2 = new LinkedList<String>();

        llist.add("a");
        llist.add(1,"a1");
        llist.add("a2");
        llist2.add("a3");
        llist2.add("a4");

        llist.addAll(llist2);

        ((LinkedList<String>) llist).addFirst("a0");
        ((LinkedList<String>) llist).addLast("a100");
        Show(llist);


        llist.removeAll(llist2);
        Show(llist);

        llist.addAll(llist2);

        ((LinkedList<String>) llist).removeFirst();
        llist.remove("a2");
        llist.remove(2);

        Show(llist);

        System.out.println(((LinkedList<String>) llist).peek());//return first
        System.out.println(((LinkedList<String>) llist).poll());//return first and remove

        System.out.println(llist.get(1));

        ((LinkedList<String>) llist).offer("a101"); //Adds the specified element as the tail

        Show(llist);
        ((LinkedList<String>) llist).pop();//Pops an element onto the stack
        Show(llist);
        ((LinkedList<String>) llist).push("a2");//pushes an element onto the stack

        Show(llist);


        llist.set(1,"1a");
        Show(llist);

        System.out.println(llist.size());
        String[] a = llist.toArray(new String[0]);
        System.out.println(a.length);
        llist.clear();
        System.out.println(llist.isEmpty());


    }

    public static void Show(List list){
        for(Iterator iter = list.iterator(); iter.hasNext();)
            System.out.print(iter.next()+" ");
            System.out.println();
    }



}
