import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test9 {
    public static void main(String[] args){
        Solution9 solution9 = new Solution9();
        System.out.println(solution9.getHint("1123","0111"));

    }
}

class Solution9 {

    public String getHint(String secret, String guess) {
        if(secret==null || guess==null || secret.length()<=0 || guess.length()<=0)
            return "0A0B";
        int bull=0 , cow=0;
        List<Integer> ss=new ArrayList<>();
        List<Integer> gg=new ArrayList<>();
        for(int i=0;i<secret.length();i++)
        {
            if(secret.charAt(i)==guess.charAt(i))
                bull++;
            else
            {
                ss.add(secret.charAt(i)-'0');
                gg.add(guess.charAt(i)-'0');
            }
        }

        Collections.sort(ss);
        Collections.sort(gg);
        int i=0,j=0;
        while(i<ss.size() && j<gg.size())
        {
            if(ss.get(i)==gg.get(j))
            {
                cow++;
                i++;
                j++;
            }else if(ss.get(i)<gg.get(j))
                i++;
            else
                j++;
        }
        return bull+"A"+cow+"B";
    }
}