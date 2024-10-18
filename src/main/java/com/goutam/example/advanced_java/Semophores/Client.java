package com.goutam.example.advanced_java.Semophores;

import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.*;

public class Client {
    public static void main(String[] args) throws InterruptedException {

        Queue <Object> queue = new ConcurrentLinkedQueue<>();


        Semaphore producedSemaphore = new Semaphore(6);
        Semaphore consumedSemaphore = new Semaphore(0);

        Producer producer = new Producer(queue, producedSemaphore, consumedSemaphore);
        Producer producer2 = new Producer(queue, producedSemaphore, consumedSemaphore);
        Producer producer3 = new Producer(queue, producedSemaphore, consumedSemaphore);
        Producer producer4 = new Producer(queue, producedSemaphore, consumedSemaphore);
        Producer producer5 = new Producer(queue, producedSemaphore, consumedSemaphore);
        Producer producer6 = new Producer(queue, producedSemaphore, consumedSemaphore);

        Consumer consumer = new Consumer(queue,producedSemaphore, consumedSemaphore);
        Consumer consumer2 = new Consumer(queue,producedSemaphore, consumedSemaphore);
        Consumer consumer3 = new Consumer(queue,producedSemaphore, consumedSemaphore);
        Consumer consumer4 = new Consumer(queue,producedSemaphore, consumedSemaphore);

        Thread producerThread = new Thread(producer);
        Thread producerThread2 = new Thread(producer2);
        Thread producerThread3 = new Thread(producer3);
        Thread producerThread4 = new Thread(producer4);
        Thread producerThread5 = new Thread(producer5);
        Thread producerThread6 = new Thread(producer6);
        Thread consumerThread = new Thread(consumer);
        Thread consumerThread2 = new Thread(consumer2);
        Thread consumerThread3 = new Thread(consumer3);
        Thread consumerThread4 = new Thread(consumer4);

        producerThread.start();
        producerThread2.start();
        producerThread3.start();
        producerThread4.start();
        producerThread5.start();
        producerThread6.start();
        consumerThread.start();
        consumerThread2.start();
        consumerThread3.start();
        consumerThread4.start();

    }
}
