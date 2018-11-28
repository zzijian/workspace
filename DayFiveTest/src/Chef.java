import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class Chef implements Runnable {

    private Restaurant restaurant;
    private int count = 0;
    public Chef(Restaurant r){restaurant = r;}

    @Override
    public void run() {
        try{
            while (!Thread.interrupted()){
                synchronized (this){
                    while (restaurant.meal != null) wait();
                }
                if(++count == 50){
                    System.out.println("Out of food,closing");
                    restaurant.exec.shutdownNow();
                }
                System.out.println("Order up!");
                synchronized (restaurant.waitPerson){
                    restaurant.meal = new Meal(count);
                    restaurant.waitPerson.notifyAll();
                }

                TimeUnit.MILLISECONDS.sleep(3000);
            }
        }catch (InterruptedException e){
            System.out.println("Chef interrupted");
        }

    }
}
