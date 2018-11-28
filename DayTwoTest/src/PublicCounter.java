import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class PublicCounter {

    private AtomicInteger count = new AtomicInteger(0);
//    private int count2 = 0;
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public static void main(String[] args) throws InterruptedException {

        final int n = 23;
        CountDownLatch latch = new CountDownLatch(n);
        CyclicBarrier cyclicBarrier = new CyclicBarrier(n+1);

        PublicCounter publicCounter = new PublicCounter();
        for(int i =0;i<n;i++) {
//            MyRunnable myRunnable = publicCounter.new MyRunnable(latch);
            MyRunnable myRunnable = publicCounter.new MyRunnable(cyclicBarrier);

            Thread ts = new Thread(myRunnable);

            ts.start();
        }
//        latch.await();
        try {
            cyclicBarrier.await();
            System.out.println(publicCounter.count.get());
        }catch (Exception e){}

//        System.out.println(publicCounter.count2);
    }



class MyRunnable implements Runnable {

    final int m = 150;
    CountDownLatch latch;
    CyclicBarrier cyclicBarrier;

    public MyRunnable(CountDownLatch latch){
        this.latch = latch;
    }
    public MyRunnable(CyclicBarrier cyclicBarrier){
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
//        lock.writeLock().lock();
        try {
            for(int i=0;i<m;i++ ){
                count.incrementAndGet();
//                count2++;
//                System.out.println(Thread.currentThread().getName()+" "+count.get());
            }
            cyclicBarrier.await();
//            latch.countDown();
        }catch (Exception e){

        }finally {
//            lock.writeLock().unlock();
        }


    }

}
}

