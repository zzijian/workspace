import java.util.UUID;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 公共常量
 * @author 骆昊
 *
 */
class Constants {
    public static final int MAX_BUFFER_SIZE = 10;
    public static final int NUM_OF_PRODUCER = 2;
    public static final int NUM_OF_CONSUMER = 3;
}


class Task {
    private String id;  // 任务的编号

    public Task() {
        id = UUID.randomUUID().toString();
    }

    @Override
    public String toString() {
        return "Task[" + id + "]";
    }
}

class Consumer implements Runnable {
    private BlockingQueue<Task> buffer;

    public Consumer(BlockingQueue<Task> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while(true) {
            try {
                Task task = buffer.take();
                System.out.println("Consumer[" + Thread.currentThread().getName() + "] got " + task);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Producer implements Runnable {
    private BlockingQueue<Task> buffer;

    public Producer(BlockingQueue<Task> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while(true) {
            try {
                Task task = new Task();
                buffer.put(task);
                System.out.println("Producer[" + Thread.currentThread().getName() + "] put " + task);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}

