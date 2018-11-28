public class Test11 {
    public static void main(String[] args){
        Solution11  s = new Solution11();

        System.out.println(s.climbStairs(5));


    }

}

class Solution11 {
    public int  climbStairs(int n){

        int d[] = new int[n+1];

        for(int i = 1;i<n+1;i++){
            if(i == 1){
                d[i]=1;
                continue;
            }
            if(i == 2){
                d[i]=2;
                continue;
            }
            d[i] = d[i-1]+d[i-2];
        }


        return d[n];
    }
}