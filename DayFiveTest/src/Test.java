import java.util.*;

public class Test {
    public static void main(String[] args){

        Map<Integer,Student> m = new HashMap<>();
        m.put(1,new Student());


        System.out.println(m.get(1).getName());
        m.get(1).setName("sss");
        System.out.println(m.get(1).getName());

        String a = new String();

        System.out.println(a == null);

//        showYouMyHeart();
       // System.out.println(reverseStr("abcdefg",2));
    }

    public static int rotatedDigits(int N) {
        int count = 0;
        for(int i =1;i<=N;i++){
            String string = String.valueOf(i);
            String[] strings = string.split("");
            List<String> list = new ArrayList<>();
            for (int j = 0;j<strings.length;j++){
                if (strings[j].equals("3")||strings[j].equals("4")||strings[j].equals("7")){
                    list.clear();
                    break;
                }
                list.add(strings[j]);
            }
            if(list.contains("2")||list.contains("5")||list.contains("6")||list.contains("9")){
                System.out.print(i+" ");
                count++;
            }
        }
        return count;
    }

    public static String reverseStr(String s, int k) {
        if (s.length()<k){
            StringBuffer stringBuffer = new StringBuffer(s);
            return stringBuffer.reverse().toString();
        }
        if(s.length()<2*k){
            StringBuffer stringBuffer1 = new StringBuffer(s.substring(0,k));
            return stringBuffer1.reverse().toString()+s.substring(k,s.length());
        }

        if((s.length()-2*k)<k){
            StringBuffer stringBuffer = new StringBuffer(s);
            return stringBuffer.reverse().toString();
        }

        if((s.length()-2*k)<2*k){
            StringBuffer stringBuffer1 = new StringBuffer(s.substring(0,k));
            StringBuffer stringBuffer2 = new StringBuffer(s.substring(2*k,3*k+1));
            return stringBuffer1.reverse().toString()+s.substring(k,2*k)+stringBuffer2.reverse().toString()+s.substring(3*k);
        }
        StringBuffer stringBuffer1 = new StringBuffer(s.substring(0,k));
        return stringBuffer1.reverse().toString()+s.substring(k);
    }


    public static void showYouMyHeart() {
        for (float y = (float) 1.5; y > -1.5; y -= 0.1) {
            for (float x = (float) -1.5; x < 1.5; x += 0.05) {
                float a = x * x + y * y - 1;
                if ((a * a * a - x * x * y * y * y) <= 0.0) {
                    System.out.print(randomChar());
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static char randomChar(){
        return '.';
    }
}
