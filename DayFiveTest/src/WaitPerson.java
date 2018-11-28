import java.util.concurrent.TimeUnit;

public class WaitPerson implements Runnable {
    private Restaurant restaurant;
    public WaitPerson(Restaurant r){restaurant = r;}


    @Override
    public void run() {
        try {
            while (!Thread.interrupted()){
                synchronized (this){
                    while (restaurant.meal == null)
                        wait();
                }
                System.out.println("WaitPerson got"+restaurant.meal);
                synchronized (restaurant.chef){
                    restaurant.meal =null;
                    TimeUnit.MILLISECONDS.sleep(3000);
                    restaurant.chef.notifyAll();
                }

            }
        }catch (InterruptedException e){
            System.out.println("WaitPerson interrupted");
        }
    }
}
