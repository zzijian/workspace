import java.util.*;
import java.util.stream.IntStream;

public class Test7 {
    public static void main(String[] args){
        Solution7 s = new Solution7();
        int[] nums ={3,2,3};
        System.out.println( s.reverse(-12));
        System.out.println( s.reverse(-1320));
        System.out.println( s.reverse(123));
        System.out.println( s.reverse(120));
        System.out.println( s.reverse(1200));
        System.out.println( s.trailingZeroes(13));
        System.out.println( s.trailingZeroes(20));
        System.out.println( s.hammingDistance(1,4));
        System.out.println( s.majorityElement(nums));
        System.out.println( s.canConstruct("aa","aab"));
    }
}

class Solution7 {
    public int[] twoSum0(int[] nums, int target) {
        int[] t = new int[2];
        for(int i = 0;i<nums.length-1;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    t[0]=i;
                    t[1]=j;
                }
            }
        }
        return t;
    }
    public int[] twoSum1(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int t = target - nums[i];
            if(map.containsKey(t)){
                map.get(t);
                return new int[]{ map.get(t),i };
            }
            map.put(nums[i],i);
        }
        return null;
    }

    public int reverse(int x) {
        boolean b = true;
        if(x<0){
            b=false;
        }
        String s = Integer.toString(Math.abs(x));
        StringBuffer stringBuffer = new StringBuffer(s);
        String r =  stringBuffer.reverse().toString();
        int a;
        try {
            a = Integer.parseInt(r);
        }catch (Exception e){
            return 0;
        }
        if(b){
            return a;
        }
        return -a;
    }

    public boolean isPalindrome(int x) {
        String s  = new StringBuffer(String.valueOf(x)).reverse().toString();
        return  s.equals(String.valueOf(x));
    }

    public int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == val){
                count++;
                nums[i] = 999999999;
            }
        }
        Arrays.sort(nums);
        return nums.length-count;
    }

    public int searchInsert(int[] nums, int target) {
        for(int i = 0 ;i<nums.length;i++){
            if(target>nums[i]){
                continue;
            }
            return i;
        }
        return -1;
    }

    public int lengthOfLastWord(String s) {
        if(s.charAt(s.length()-1) == ' '){
            return 0;
        }
        String[] sv = s.split(" ");
        return sv[sv.length-1].length();
    }

    public boolean containsDuplicate(int[] nums) {
        if(nums.length == 0) return false;
        Set<Integer> set = new HashSet<>();
        for(Integer i : nums){
            if(set.contains(i)) return true;
            set.add(i);
        }
        return false;
    }

    public int trailingZeroes(int n) {
        int t=1;
        for(int i = 2;i<=n;i++){
            t *= i;
        }

        String s = String.valueOf(t);

        String[] c = s.split("");

        int count = 0;

        for(int i = c.length-1;i>=0;i--){
            if(c[i].equals("0")){
                count ++;
                continue;
            }
            break;
        }
        return count;
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> resultList = new ArrayList<>();

        List<Integer> l = new ArrayList<>();

        for(int i = 0;i<nums.length;i++){
            l.add(nums[i]);
        }
        for(int i = 1;i<=nums.length;i++){
           if(l.contains(i))
               continue;

           resultList.add(i);
        }
        return resultList;
    }

    public int numJewelsInStones(String J, String S) {

        String[] jStrs = J.split("");
        String[] sStrs = S.split("");

       int count = 0;

        for(int i = 0;i<sStrs.length;i++){
            for(int j = 0;j<jStrs.length;j++){
                if(sStrs[i].equals(jStrs[j])){
                    count++;
                }
            }
        }
        return count;
    }

    public int hammingDistance(int x, int y) {
       String s1 = Integer.toBinaryString(x);
       String s2 = Integer.toBinaryString(y);

       int c = s1.length() - s2.length();
       int i = Math.abs(c);
       int j = 0;
       int count = 0;

       if(c>=0){
           while(i<s1.length()){
              if( s1.charAt(i)!=s2.charAt(j)){
                  count++;
              }
              i++;
              j++;
           }
       }else {
           while(i<s2.length()){
               if( s1.charAt(j)!=s2.charAt(i)){
                   count++;
               }
               i++;
               j++;
           }
       }
        return count;
    }


    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();

        for(int i = 0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        Set<Integer> set1 = new HashSet<>();
        for(Integer integer : nums2){
            if (set.contains(integer)){
                set1.add(integer);
            }
            set.remove(integer);
        }
        int[] r = new int[set1.size()];
        int j =0;
        for(int t:set1){
            r[j] = t;
            j++;
        }
        return r;
    }
    public int dominantIndex(int[] nums) {
        int max = 0;
        int index = 0;
        int second = 0;
        for(int i = 0;i<nums.length;i++){

            if(max>nums[i]){
                continue;
            }
            max = nums[i];
            index = i;
        }
        nums[index] = -1;

        for(int i = 0;i<nums.length;i++){
            if(second>nums[i]){
                continue;
            }
            second = nums[i];
        }
        if(max>second*2){
            return  index;
        }
        return -1;
    }

    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        int max1 = 0;
        int max2 = 0;

        max1 = nums[nums.length-1]* nums[nums.length-2]* nums[nums.length-3];
        max2 = nums[0]*nums[1]*nums[nums.length-1];

        return max1>max2?max1:max2;
    }

    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> treeMap = new HashMap<>();

        for(int i = 0;i<nums.length;i++){
            if(treeMap.containsKey(nums[i])){
                treeMap.replace(nums[i],treeMap.get(nums[i])+1);
                continue;
            }
            treeMap.put(nums[i],1);
        }
        int max = 0;
        int result = 0;
        for(Integer integer:treeMap.keySet()){
            if(treeMap.get(integer)>max){
                max = treeMap.get(integer);
                result = integer.intValue();
            }

        }
        return result;
    }

    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return -1;
    }

    public boolean canConstruct(String ransomNote, String magazine) {

        String[] ma = magazine.split("");
        List<String> mlist = new ArrayList<>();

        for(String a : ma){
            mlist.add(a);
        }

        for(int i =0;i<ransomNote.length();i++){
            String t = String.valueOf(ransomNote.charAt(i));
            if(!mlist.contains(t)){
                return false;
            }
            mlist.remove(t);
        }
        return true;
    }

    public int[] plusOne(int[] digits) {
        String num = "";
        for(int i = 0;i<digits.length;i++){
            num += digits[i];
        }
        int t = Integer.parseInt(num);
        t++;

        String r = String.valueOf(t);
        int[] result = new int[r.length()];
        int i = 1;
        while((t/10)!=0||t%10!=0){
            result[result.length - i] = (t%10);
            t = t/10;
            i++;
        }
        return result;
    }

    public int[] plusOne2(int[] digits) {
        if(digits[digits.length-1]!=9){
            digits[digits.length-1] ++;
            return digits;
        }
        for(int i = digits.length-1;i>=0;i--){
            if (digits[i]==9){
                digits[i]=0;
                continue;
            }
            digits[i]++;
            break;
        }
        if(digits[0] == 0){
            int[] r = new int[digits.length+1];
            r[0] = 1;
            return r;
        }
        return digits;
    }

    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for(int i = 0;i<moves.length();i++){
            switch (moves.charAt(i)){
                case 'U':
                    x++;
                    break;
                case 'D':
                    x--;
                    break;
                case 'R':
                    y++;
                    break;
                case 'L':
                    y--;
                    break;

            }
        }
        return x == 0&& y ==0;
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new LinkedList<>();
        return list;
    }

    class Solution {
        public int[] findErrorNums(int[] nums) {
            return null;
        }
    }

}
























