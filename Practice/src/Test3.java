import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test3 {
    public static void main(String[] args){


//        List<Student> list = new ArrayList<>();
//        Student[] students = new Student[5];
//        //对于有序的链表 通过反向遍历 得到key所能取到的最大值
//        for(int i = 1;i<students.length+1;i++){
//            students[i-1] = new Student(i*10,"a"+i);
//            list.add(students[i-1]);
//        }
//        Student key = new Student(44,"");
//        for(int i =list.size()-1;i>=0;i--){
//            if(key.id<list.get(i).id){
//                continue;
//            }
//            key.name = list.get(i).name;
//            System.out.print(key);
//            break;
//        }
//        System.out.print(list);

        //get不到Integer的value返回的是null
//        Map<Integer,Integer> map = new HashMap<>();
//        map.put(1,1);
//        map.put(2,1);
//        map.put(3,1);
//        System.out.print(map.get(4)==null?0:map.get(4));

        Map<Integer,Student> map  = new HashMap<>();

        Student a = new Student(1,"111");
        map.put(a.id,a);

        map.get(a.id).setName();

        System.out.println(map);



    }
}


class Student{
    public int id;
    public String name;
    public Student(int id,String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return id+" "+name;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName() {
        this.name= "111231";
    }
}