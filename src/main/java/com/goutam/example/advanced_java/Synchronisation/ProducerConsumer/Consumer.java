package com.goutam.example.advanced_java.Synchronisation.ProducerConsumer;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
    private Queue<Object> queue;

    public Consumer(Queue<Object> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
                if (queue.size() > 0) {
                    queue.remove();
                }

        }
    }
}
