package com.goutam.example.advanced_java.CallableThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class TreeSizeCalculator implements Callable<Integer> {
    private Node root;
    ExecutorService es;
    public TreeSizeCalculator(Node root, ExecutorService es) {
        this.root = root;
        this.es = es;
    }

    public Integer call() throws Exception {
        if (root == null) {
            return 0;
        }
        TreeSizeCalculator left = new TreeSizeCalculator(root.left, es);
        Future<Integer> leftsize = es.submit(left);
        TreeSizeCalculator right = new TreeSizeCalculator(root.right, es);
        Future<Integer> rightsize = es.submit(right);
        return leftsize.get() + rightsize.get() +1 ;
    }
}
