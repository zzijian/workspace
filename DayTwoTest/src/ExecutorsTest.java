import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorsTest {

    public static void main(String[] args){
        //newCachedThreadPool
        //创建一个可缓存线程池，应用中存在的线程数可以无限大
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        System.out.println("----newCachedThreadPool----");
        for(int i=0;i<4;i++)
        {
            final int index=i;
            newCachedThreadPool.execute(new ThreadForPools(index));
        }

        // newFixedThreadPool
        //创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);
        System.out.println("----newFixedThreadPool----");

        for(int i=0;i<4;i++)
        {
            final int index=i;
            newFixedThreadPool.execute(new ThreadForPools(index));
        }

        //newScheduledThreadPool
        //创建一个定长线程池，支持定时及周期性任务执行。延迟之后执行，除了延迟执行之外和newFixedThreadPool基本相同，可以用来执行定时任务
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(2);
        System.out.println("----newScheduledThreadPool----");
        for(int i=0;i<4;i++)
        {
            final int index=i;
            newScheduledThreadPool.schedule(new ThreadForPools(index),3, TimeUnit.SECONDS);
        }

        //创建一个单线程化的线程池，它只会用唯一的工作线程来执行任务，保证所有任务按照指定顺序(FIFO, LIFO, 优先级)执行
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        System.out.println("----newSingleThreadPool-----");
        for(int i=0;i<4;i++)
        {
            final int index=i;
            newSingleThreadExecutor.execute(new ThreadForPools(index));
        }



    }


}

