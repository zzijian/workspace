import java.util.HashMap;
import java.util.Map;

//单词模式
public class Test8 {
    public static void main(String[] args){
        Solution8 solution8 = new Solution8();
        System.out.println(solution8.wordPattern("abba","cat dog dog cat"));
    }
}


class Solution8 {

    public boolean wordPattern(String pattern, String str) {

        String[] a = pattern.split("");
        String[] b = str.split(" ");

        if(a.length != b.length){
            return false;
        }

        Map<String,String> map = new HashMap<>();

        for(int i= 0;i<a.length;i++) {
            int j =1;

            if (!a[j].equals(a[i])&&b[j].equals(b[i])) {
                return false;
            }

            if(j+1<a.length){
                j++;
            }

            map.put(a[i],b[i]);
        }

        for(int i = 0;i<a.length;i++){
            if(!map.get(a[i]).equals(b[i])){
                return false;
            }
        }

        return true;

    }
}