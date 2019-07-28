package com.java.learn;

public abstract class Abfather {
    public void fun1(){
        System.out.println("hello fun1");
    }
    public void fun2(){
        System.out.println("hello fun2");
    }
    public void run(){
        this.fun1();
        this.fun2();
    }
}
