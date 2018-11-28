//Binary Search
public class Test6 {
    public static void main(String[] args){


        int[]  nums = {-1,0,3,5,9,12};
        Solution solution =new Solution();
        System.out.println(solution.search(nums,9));

    }




}

class Solution {
    public int search(int[] nums, int target) {

        int max = nums.length-1;
        int min = 0;
        int mid = (max+min)/2;

        while (min<=max){
            mid = (max+min)/2;
            if(nums[mid]>target){
                max = mid-1;
            }
            else if (nums[mid]<target){
                min = mid+1;
            }
            else if(nums[mid]==target){
                return mid;
            }
        }

        return -1;
    }
}