import java.util.Set;
import java.util.TreeSet;

public class Test10 {
    public static void main(String[] args){
        int[] test = {2,2};
        Solution10 solution10 = new Solution10();
        System.out.print( solution10.lengthOfLIS(test));

    }
}

class Solution10 {
    public int lengthOfLIS(int[] nums) {

        if(nums.length == 0) return 0;

        int[] d = new int[nums.length];
        int len = 1;


        for(int i = 0;i<nums.length;i++){
            d[i]=1;

            for(int j = 0;j<i;j++){
                if(nums[j]<nums[i] && (d[j]+1>=d[i])){
                    d[i] = d[j] + 1;
                }
                if(d[i]>len) len = d[i];
            }
        }

        return len;
    }
}
