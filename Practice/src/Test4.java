public class Test4 {
    public static void main(String[] args){
        for(int i=1;i<=4;i++){
            int a,b,c,d;
            a= i!=1?1:0;
            b= i==3?1:0;
            c= i==4?1:0;
            d= i!=4?1:0;
            int sum= a+b+c+d;
            if(sum == 3){
                System.out.print(i);
            }

        }


    }
}
