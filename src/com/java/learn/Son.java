package com.java.learn;

public class Son extends Abfather{
    @Override
    public void fun1() {
        System.out.println("hi fun1");
    }

    @Override
    public void fun2() {
        System.out.println("hi fun2");
    }

    @Override
    public void run() {
        super.run();
    }
    public static void main(String[] args){
        new Son().run();
    }
}
