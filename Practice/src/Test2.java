import java.util.concurrent.Semaphore;

public class Test2 {

    public static void main(String[] args) throws InterruptedException {
        Driver driver = new Driver();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                    try {
                        driver.printA();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
            }
        });
        thread1.start();
        thread1.join();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                    try {
                        driver.printB();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
            }
        });
        thread2.start();
        thread2.join();

        new Thread(new Runnable() {
            @Override
            public void run() {
                    try {
                        driver.printC();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
            }
        }).start();
    }

}

class Driver{
    public static Semaphore semaphore = new Semaphore(1);

    public void printA() throws InterruptedException {
        semaphore.acquire();
        for (int i=0;i<10;i++)
            System.out.print("A");
        semaphore.release();
    }

    public void printB() throws InterruptedException {
        semaphore.acquire();
        for (int i=0;i<10;i++)
            System.out.print("B");
        semaphore.release();
    }

    public void printC() throws InterruptedException {
        semaphore.acquire();
        for (int i=0;i<10;i++)
            System.out.print("C");
        semaphore.release();
    }

}