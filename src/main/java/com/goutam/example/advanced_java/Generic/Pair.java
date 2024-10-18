package com.goutam.example.advanced_java.Generic;


public class Pair <T,V> {
    private T first;
    private V second;
    private String name;
    public Pair(T first, V second) {
        this.first = first;
        this.second = second;
    }
    public T getFirst() {
        return first;
    }
    public V getSecond() {
        return second;
    }
    public String getName() {
        return name;
}
        public <S> S doSomething(S name){
        System.out.println(name);
        return name;
    }

}
