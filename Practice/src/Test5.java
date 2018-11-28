import java.util.*;
import java.util.stream.Collectors;

//设计一个找到数据流中第K大元素的类（class）。注意是排序后的第K大元素，不是第K个不同的元素。
//你的 KthLargest 类需要一个同时接收整数 k 和整数数组nums 的构造器，它包含数据流中的初始元素。每次调用 KthLargest.add，返回当前数据流中第K大的元素。
public class Test5 {

    public static void main(String[] args){
        int k = 3;
        int[] arr = {4,5,8,2};
        KthLargest kthLargest = new KthLargest(3, arr);

        System.out.println(kthLargest.add(3));

        System.out.println(kthLargest.add(5));

        System.out.println(kthLargest.add(10));

        System.out.println(kthLargest.add(9));

        System.out.println(kthLargest.add(4));
    }
}

class KthLargest {
    private int k;
    private List<Integer> nums;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.nums = Arrays.stream(nums ).boxed().collect(Collectors.toList());
    }

    public int add(int val) {

        nums.add(val);
        Collections.sort(nums);

        return  (int)nums.get(nums.size()-k);
    }
}