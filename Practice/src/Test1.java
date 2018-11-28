public class Test1 {
    public static void main(String[] args){
        TwoPrint twoPrint = new TwoPrint();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 26; i++){
                    twoPrint.printNum();
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 26; i++){
                    twoPrint.printChar();
                }
            }
        }).start();


    }
}
class TwoPrint{
    private  boolean flag =true;
    private int count = 1;

    public synchronized void printNum(){
        while (flag == false){
            try {
                this.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.print(count*2-1);
        System.out.print(count*2);
        flag = false;
        this.notify();
    }

    public synchronized void printChar(){
        while (flag == true){
            try {
                this.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.print((char)(count+'A'-1));
        count++;
        flag = true;
        this.notify();
    }


}
