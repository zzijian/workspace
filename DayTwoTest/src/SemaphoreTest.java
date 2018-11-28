import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreTest {
    public static void main(String[] args){
        ExecutorService service = Executors.newCachedThreadPool();
        final  Semaphore sp = new Semaphore(3);

        for(int i = 0;i<10;i++){
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    try {
                        sp.acquire();
                    } catch (InterruptedException e) {
                    }
                    System.out.println(Thread.currentThread().getName()+"有"+(3-sp.availablePermits())+"个并发");
                    try {
                        Thread.sleep(3000);
                    }catch (InterruptedException e){

                    }
                    sp.release();
                    System.out.println("线程"+Thread.currentThread().getName()+"已经离开");

                }
            };
            service.execute(runnable);
        }

    }
}
