public class ThreadForPools implements Runnable{
    private Integer index;
    public ThreadForPools(Integer index) {
        this.index=index;
    }

    @Override
    public void run() {
        try {
            System.out.println("线程开始 "+Thread.currentThread().getName());
            Thread.sleep((index+1)*1000);
            System.out.println("我的线程标识是 "+this.toString());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}