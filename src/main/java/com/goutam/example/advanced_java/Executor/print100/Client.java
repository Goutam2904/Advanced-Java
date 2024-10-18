package com.goutam.example.advanced_java.Executor.print100;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        Executor executor = Executors.newFixedThreadPool(5);// Executor will have executor waiting for next job.
                                                                            // Executor service has option to shutdown service
            for (int i = 0; i < 100; i++) {
                print_1to100 task = new print_1to100(i);
                executor.execute(task);
            }
//            executor.shutdown();
        }
    }

